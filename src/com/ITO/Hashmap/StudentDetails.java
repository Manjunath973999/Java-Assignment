package com.ITO.Hashmap;

import java.util.*;

public class StudentDetails 
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
		
		System.out.println(m);
		
		Set s1 = m.keySet();
		Collection c= m.values();
		
		Set s2 = m.entrySet();
		
		System.out.println("key :"+s1);
		System.out.println("Values :"+c);
		
		System.out.println("Entries :"+s2);
		
	}

}
