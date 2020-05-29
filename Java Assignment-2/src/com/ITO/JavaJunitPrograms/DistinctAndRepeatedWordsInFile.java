/* WAP to read a file and print distinct words in the file and number of occurrences of it. 
	for example, if below is the content of the file, 
		"I am Java. I am a programming language. I run in millions of computers"
	the output should be. 
		I 				3
		am 				2
		java			1
		a				1
		programming		1
		language		1
		run				1
		in				1
		millions		1
		of 				1
		computers		1 */


package com.ITO.JavaJunitPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class DistinctAndRepeatedWordsInFile 
{	 
	 public static void main(String[] args) throws Exception
	 { 
		 
		DistinctAndRepeatedWordsInFile ip1 = new DistinctAndRepeatedWordsInFile();
		 
		LinkedHashMap<String,Integer> h1 = ip1.m1();
		
		
		 for (Entry<String, Integer> entry : h1.entrySet()) 
		 { 
	         System.out.println(entry.getKey() + " \t" + entry.getValue()); 
	     } 
		 
	 }
	 
	 
	 public LinkedHashMap<String,Integer> m1() throws IOException 
	 {
		 BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\ITORIZON\\Desktop\\InputFile.txt"));
		 
		 String str= reader.readLine();
		 
		 String newstr = " ";
		 
		 for (int i = 0; i < str.length(); i++)
		 {
			if(str.charAt(i)>=65 && str.charAt(i)<=92 || str.charAt(i)>=97 && str.charAt(i)<=122 || str.charAt(i)==32 )
			{
				newstr = newstr + str.charAt(i);	
			}
		 }
		 
		 String[] str1 = newstr.split(" ");
		 
		 LinkedHashMap<String,Integer> lhm = new LinkedHashMap<String,Integer>();
		 
		 for (String i:str1)
		 {
			 if(lhm.containsKey(i))
			 {
				 lhm.put(i, lhm.get(i)+1);
			 }
			 else
			 {
				 lhm.put(i, 1);
			 }
		 }
		 
		 return lhm;
		 
	   }
	 
}
