package com.ITO.Treeset;

import java.util.*;

public class RetrieveLastElement 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(12);
		ts.add(34);
		ts.add(00);
		ts.add(78);
		ts.add(28);
		ts.add(99);
		
		System.out.println("Before removing Last element: "+ts);
		
		int num = ts.pollLast();
		
		System.out.println("Removed Element is :"+ num);
		
		System.out.println("After removing last element: "+ts);
	}
}
