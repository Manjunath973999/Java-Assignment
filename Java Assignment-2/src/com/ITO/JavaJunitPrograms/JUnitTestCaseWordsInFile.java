package com.ITO.JavaJunitPrograms;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.LinkedHashMap;

import org.junit.jupiter.api.Test;

class JUnitTestCaseWordsInFile 
{

	@Test
	void test() throws IOException
	{
		DistinctAndRepeatedWordsInFile d1 = new DistinctAndRepeatedWordsInFile();
		 
			LinkedHashMap<String,Integer> h1=d1.m1();
			assertEquals(3,h1.get("I"));
	}
	
	@Test
	void test1() throws IOException
	{
		DistinctAndRepeatedWordsInFile d1 = new DistinctAndRepeatedWordsInFile();
		 
		LinkedHashMap<String,Integer> h1 = d1.m1();
		assertEquals(false,h1.isEmpty());
	}
	
	/*@Test
	void test2() throws IOException
	{
		DistinctAndRepeatedWordsInFile d1 = new DistinctAndRepeatedWordsInFile();
		 
		LinkedHashMap<String,Integer> h1 = d1.m1();
		assertEquals(15,h1.size());
	}*/
	
	@Test
	void test3() throws IOException
	{
		DistinctAndRepeatedWordsInFile d1 = new DistinctAndRepeatedWordsInFile();
		 
		LinkedHashMap<String,Integer> h1 = d1.m1();
		assertEquals(false,h1.containsKey("java"));
	}

}
