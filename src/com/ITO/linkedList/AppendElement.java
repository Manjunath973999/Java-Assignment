package com.ITO.linkedList;

import java.util.*;

public class AppendElement 
{
	public static void main(String[] args) 
	{
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Raina");
		ll.add("Warner");
		ll.add("MS Dhoni");
		ll.add("Sachin");
		ll.add("Virat Kohli");
		ll.add("Rohit");
		
		System.out.println("The LinkedList is "+ll);
		
		ll.add("Yuvraj");
		
		System.out.println("The Updated LinkedList is "+ll);
	}
}
