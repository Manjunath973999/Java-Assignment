package com.ITO.Hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateHasMap 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m = new HashMap<Integer,String>();
		
		m.put(10, "Manjunath");
		m.put(20, "Abhisek");
		m.put(30, "Ankith");
		m.put(40, "Hussian");
		m.put(50, "Harshitha");
		m.put(60, "Sathya");
		
		Collection<Entry<Integer,String>> c = m.entrySet();
		
		Iterator<Entry<Integer,String>> itr = c.iterator();
		
		System.out.println("key\t\t value");
		System.out.println("-----------------------------");
		
		while(itr.hasNext())
		{
			Entry<Integer,String> e = itr.next();
			System.out.println(e.getKey()+ "\t\t\t" +e.getValue());
		}
	}
}
