package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Filter
{

	public static void main(String[] args)
	{
		List<String> strList=Arrays.asList("abc","","bcd","","defg","jk");
		
		//Filter
		long l1=strList.stream().filter(s->s.isEmpty()).count();
		System.out.println(l1);
	
		//count string whose length is more than three
		long count=strList.stream().filter(s->s.length()>3).count();
		System.out.println(count);
				
		//count no.of strings which starts with "a"
		long count1=strList.stream().filter(s->s.startsWith("a")).count();
		System.out.println(count1);
		
		//Remove all empty String from List
		long count2=strList.stream().filter(s->!s.isEmpty()).count();
		System.out.println(count2);
		
		//create a List with string more than 2 characters
		List<String> count3=strList.stream().filter(s->s.length()>2).collect(Collectors.toList());
		System.out.println(count3);
		
		//convert string with Uppercase and join with them coma
		List<String> count4=strList.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(count4);
		
		//create a List of the square of all the distinct numbers
		List<Integer> numbers=Arrays.asList(3,2,4,5,6,7,8);
		
		List<Integer> count5=numbers.stream().map(s->s).distinct().collect(Collectors.toList());
		System.out.println(count5);
		
	}
}