package com.ITO.Student;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeMap;

import org.junit.jupiter.api.Test;

class JUnitTestCaseStudent 
{

	@Test
	void test()
	{
		StudentRecord s1=new StudentRecord();
		TreeMap<StudentId,StudentDetails> tm1=	s1.record();
		assertEquals(10,tm1.size());
	}
	
	@Test
	void test1()
	{
		StudentRecord s1=new StudentRecord();
		TreeMap<StudentId,StudentDetails> tm1 = s1.record();
		assertEquals(false,tm1.isEmpty());
	}
	
	@Test
	void test2()
	{
		StudentRecord s1=new StudentRecord();
		TreeMap<StudentId,StudentDetails> tm1 =	s1.record();
		assertEquals("StudentId [deptcode=aa54, year=2013, id=2]",tm1.firstKey().toString());
	}
}
