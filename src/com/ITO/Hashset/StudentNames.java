package com.ITO.Hashset;

import java.util.*;

public class StudentNames 
{
	public static void main(String[] args) 
	{
		  HashSet<String> hs = new HashSet<String>();
		  
		  hs.add("Jhon");  
		  hs.add("Ramesh");  
		  hs.add("Suresh");  
		  hs.add("Rajesh");
		  hs.add("Jagadish");
		    
		  Iterator<String> itr = hs.iterator();
		  
		  
		  while(itr.hasNext())
		  {  
			  System.out.println(itr.next());  
		  }  
	}
}
