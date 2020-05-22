package com.ITO.linkedList;

import java.util.*;

public class RetrieveFirstElement 
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
		
		System.out.println("List before Retrieving :"+ll);
		
		String str = ll.peekFirst();
		
		System.out.println("Removed Element is :"+ str);
		
		System.out.println("After removing last element: "+ll);
		
		
	}
}
