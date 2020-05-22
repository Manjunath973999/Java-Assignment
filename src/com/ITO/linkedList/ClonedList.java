package com.ITO.linkedList;

import java.util.*;

public class ClonedList 
{
	public static void main(String[] args) 
	{
		LinkedList<String> clob1 = new LinkedList<String>();
		
		clob1.add("Raina");
		clob1.add("Warner");
		clob1.add("MS Dhoni");
		clob1.add("Sachin");
		clob1.add("Virat Kohli");
		clob1.add("Rohit");
		
		System.out.println("Original list :"+clob1);
		
		// creating another object of same type
			
		LinkedList clob2 = new LinkedList();
		
		clob2 = (LinkedList) clob1.clone();
		
		System.out.println("Duplicate List :"+clob2);
				
	}
}
