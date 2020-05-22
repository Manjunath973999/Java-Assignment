package com.ITO.Treeset;

import java.util.TreeSet;

public class AddElements 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		ts1.add(12);
		ts1.add(34);
		ts1.add(00);
		ts1.add(78);
		ts1.add(28);
		ts1.add(99);
		System.out.println("First Treeset elements are :"+ts1);
		
		TreeSet<Integer> ts2 = new TreeSet<Integer>();
		ts2.add(12);
		ts2.add(134);
		ts2.add(200);
		ts2.add(378);
		
		System.out.println("First Treeset elements are :"+ts2);
		
		ts1.addAll(ts2);
		System.out.println("The result Treeset is :"+ts1);
		
	}
}
