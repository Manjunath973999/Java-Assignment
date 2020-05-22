package com.ITO.TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class SortUsingComparator 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>(new sort());
		
		tm.put(10, "Manjunath");
		tm.put(20, "Abhisek");
		tm.put(30, "Ankith");
		tm.put(40, "Hussian");
		tm.put(50, "Harshitha");
		tm.put(60, "Sathya");
		
		System.out.println("Before Sorting :"+tm);
			
	}
}

class sort implements Comparator<Integer>
{
	
	public int Compare(Integer i1, Integer i2)
	{
		return i2.compareTo(i1);
	}

	@Override
	public int compare(Integer arg0, Integer arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
}


