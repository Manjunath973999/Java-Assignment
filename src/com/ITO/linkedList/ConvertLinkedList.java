package com.ITO.linkedList;

import java.util.*;

public class ConvertLinkedList 
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
		
		List<String> al = new ArrayList<String>(ll);
		
	    System.out.println("The ArrayList elements are: ");
	    
	    for (Object i : al)
	    {
	    	System.out.println(i);
	    }
		
	}
}
