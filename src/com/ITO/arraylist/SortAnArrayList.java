package com.ITO.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortAnArrayList 
{
	public static void main(String[] args) 
	{
		List<String> al = new ArrayList<String>();
		
		al.add("Raina");
		al.add("Warner");
		al.add("MS Dhoni");
		al.add("Sachin");
		al.add("Virat Kohli");
		al.add("Rohit");
		
		System.out.println("Before Sorting : "+al);
		Collections.sort(al);
		System.out.println("After Sorting : "+al);
		
	}
}
