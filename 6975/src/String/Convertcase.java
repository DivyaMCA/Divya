package String;

import java.util.Scanner;

public class Convertcase 
{
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		String str="";

		//input string
		System.out.println("Enter any string:");
		str=sc.nextLine();

		//declaring objects to store lowercase and uppercase strings
				String lowerCaseString= "";
				String upperCaseString="";
				
				//convert into lower case
				lowerCaseString= str.toLowerCase();
				//convert into upper case
				upperCaseString= ostr.toUpperCase();
				
				//printing the strings
				System.out.println("Original string: "str);
				System.out.println("Lower Case string: "+lowerCaseString);
				System.out.println("Upper Case String: "+upperCaseString);
	}


}
