package com.ITO.arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdateSpecificElement 
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
		
		System.out.println("Students Present in the arraylist ");
		System.out.println("-------------------------------------");
		
		System.out.println("Before Update : "+al);
		al.set(1, "Rishab Pant");
		System.out.println("After update : "+al);
	}
}
