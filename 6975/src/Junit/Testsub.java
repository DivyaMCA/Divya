package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class Testsub {

	@Test
	public void test()
	{
		Testcaseexample obj = new Testcaseexample();
		int actualResult=obj.sub(30,20);
		assertEquals(10,actualResult);
		System.out.println("Subtract class : "+actualResult);
		
		
	}

}
