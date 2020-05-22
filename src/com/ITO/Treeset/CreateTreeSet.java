package com.ITO.Treeset;

import java.util.*;

public class CreateTreeSet 
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
		
		System.out.println("TreeSet Elements are :");
		System.out.println(ts);
	}
}
