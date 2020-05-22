package com.ITO.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArraylistIsEmptyOrnot 
{
	public static void main(String[] args) 
	{
		List<String> al = new ArrayList<String>();
		
		System.out.println(al.isEmpty()+" ------>  "+"Please add elements into ArrayList");
		
		al.add("Raina");
		al.add("Warner");
		al.add("MS Dhoni");
		al.add("Sachin");
		al.add("Virat Kohli");
		al.add("Rohit");
		
		System.out.println("After adding Elements "+al.isEmpty());
		
		for (int i = 0; i < al.size(); i++) 
		{
			System.out.println(al.get(i));
		}
	}
}
