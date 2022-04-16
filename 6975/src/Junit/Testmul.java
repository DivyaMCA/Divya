package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class Testmul 
{

	@Test
	public void test() 
	{
		Testcaseexample obj=new Testcaseexample();
		int actualResult=obj.mul (10,20);
		assertEquals(200,actualResult);
		System.out.println("Multiplication class : "+actualResult);
	}

}
