package com.ITO.TreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class KeysFromTreeMap 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		
		tm.put(10, "Manjunath");
		tm.put(20, "Abhisek");
		tm.put(30, "Ankith");
		tm.put(40, "Hussian");
		tm.put(50, "Harshitha");
		tm.put(60, "Sathya");
		
		Set set = tm.entrySet();
	      
		Iterator itr = set.iterator();
	    
		while(itr.hasNext()) 
		{
	         Map.Entry me = (Map.Entry)itr.next();
	         System.out.print("key is: "+ me.getKey() + " & Corresponding Value is: ");
	         System.out.println(me.getValue());
		}
	}
}
