package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testclass 
{

	@Test
	public void test()
	{
		Testcaseexample obj = new Testcaseexample();
		
		int actualResult = obj.add(10, 20);
		assertEquals(30, actualResult);
		System.out.println("Add class : " +actualResult);
		
	
	}

}
