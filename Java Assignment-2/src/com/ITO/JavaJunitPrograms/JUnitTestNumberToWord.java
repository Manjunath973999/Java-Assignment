package com.ITO.JavaJunitPrograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTestNumberToWord 
{

	@Test
	void test()
	{
		NumberToWordConverter n1=new NumberToWordConverter();
		String str=	n1.convert(1234);
		assertEquals("One thousand Two hundred thirty Four",str);
	}
	
	@Test
	void test1()
	{
		NumberToWordConverter n1=new NumberToWordConverter();
		String str=	n1.convert(-1);
		assertEquals("Number cannot be negative",str);
	}
	
	@Test
	void test2()
	{
		NumberToWordConverter n1=new NumberToWordConverter();
		String str=	n1.convert(900000000);
		assertEquals("Limit Exceeded",str);
	}

}
