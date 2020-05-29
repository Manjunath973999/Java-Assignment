package com.ITO.Multithreading;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JUnitTestCaseMultiThreading 
{

	@Test
	void test() 
	{
		NumbersInWordsUsing2Threads oep = new NumbersInWordsUsing2Threads();
		Thread t1 = new Thread(new Runnable() 
		{
			@Override
			public void run() 
			{
				oep.printEven();
			}
		});
		assertFalse(t1.isAlive());
	}
	
	@Test
	void test1() 
	{
		NumbersInWordsUsing2Threads oep = new NumbersInWordsUsing2Threads();
		Thread t1 = new Thread(new Runnable() 
		{
			@Override
			public void run() 
			{
				oep.printEven();
			}
		});
		
		assertEquals("java.lang.ThreadGroup[name=main,maxpri=10]",t1.getThreadGroup().toString());
	}
	
	
	@Test
	void test2() 
	{
		NumbersInWordsUsing2Threads oep = new NumbersInWordsUsing2Threads();
		
		Thread t1 = new Thread(new Runnable() 
		{
			@Override
			public void run() 
			{
				oep.printEven();
			}
		});
		
		assertEquals(false,t1.isDaemon());
	}
	
	
	@Test
	void test3() 
	{
		NumbersInWordsUsing2Threads oep = new NumbersInWordsUsing2Threads();
		
		Thread t1 = new Thread(new Runnable() 
		{
			@Override
			public void run() 
			{
				oep.printEven();
			}
		});
		assertEquals(false,t1.isInterrupted());
	}

}
