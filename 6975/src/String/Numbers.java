package String;

public class Numbers 
	{
	public int sumOfTheNumbers(String stng) 
	{
	  int l = stng.length();
	  int sum = 0;
	  String temp = "";
	  for (int i = 0; i < l; i++) 
	  {
	    if (Character is Digit(stng.charAt(i))) 
		{
	      if (i < l-1 && Character is Digit(stng.charAt(i+1))) 
		  {
	        temp += stng.charAt(i);
	      }
	      else 
		  {
	        temp += stng.charAt(i);
	        sum += Integer.parseInt(temp);
	        temp = "";
	      }
	    }
	  }
	  return sum;
	}

	public static void main (String[] args)
	    {
	      Numbers m= new Numbers();
	      String str1 =  "it 15 is25 a 20string";
	      System.out.println("The given string is: "+str1);
	      System.out.println("The sum of numbers in the string is: "+m.sumOfTheNumbers(str1));
		 

	}

}
