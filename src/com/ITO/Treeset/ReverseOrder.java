package com.ITO.Treeset;

import java.util.*;

public class ReverseOrder 
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
		
		System.out.println("Elements Before reversing"+ts);
		
		Iterator itr = ts.descendingIterator();
		
		while (itr.hasNext())
		{
			Object num = itr.next(); 
		System.out.println(num);
		}
	
	}
}
