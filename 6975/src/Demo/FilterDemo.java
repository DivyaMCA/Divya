package Demo;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.*;

class FilterDemo
{

	public static void main(String[] args)
	{
		List<String>strList=Arrays.asList("abcde","","bcd","","defg","jk");
		
		
		//Filter
		
	long L1=strList.stream().filter(s->s.isEmpty()).count();
	System.out.println(L1);
	
	//count length more than three
	long count=strList.stream().filter(s->s.length()>3).count();
	System.out.println(count);
	
	//count no of strings
	long count1=strList.stream().filter(s->s.startsWith("a")).count();
	System.out.println(count1);
	
	//Remove all empty string
	long count2=strList.stream().filter(s->s.isEmpty()).count();
	System.out.println(count2);
	
	//create a list with more than 2 characters
	List<String> count3=strList.stream().filter(s->s.length()>2).collect(Collectors.toList());
	System.out.println(count3);
	
	//convert string uppercase and join with coma
	List<String> count4=strList.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
	System.out.println(count4);
	
	
	//create a list of squares
	List<Integer> numbers=Arrays.asList(3,2,4,5,6,9,8);
	
	List<Integer> count5=numbers.stream().map(s->s*s).distinct().collect(Collectors.toList());
	System.out.println(count5);
	}

}

