package com.ITO.Student;

import java.util.*;

public class StudentRecord
{
	TreeMap <StudentId,StudentDetails> tm = new TreeMap<StudentId,StudentDetails>(new StudentId());
	
	public static void main(String[] args)
	{
		StudentRecord s1=new StudentRecord();
		TreeMap <StudentId,StudentDetails> tm1=	s1.record();
		
		for(Map.Entry<StudentId,StudentDetails> entry : tm1.entrySet())
		{
		
			System.out.println(entry.getKey()+""+entry.getValue()); 
			System.out.println();
		}
	
}
	
	public TreeMap <StudentId,StudentDetails> record()
	{
		StudentId s1=new StudentId("ca001",2012,01);
		StudentId s2=new StudentId("aa54",2013,02);
		StudentId s3=new StudentId("aa54",2016,03);
		StudentId s4=new StudentId("ba43",2012,04);
		StudentId s5=new StudentId("mc56",2013,05);
		StudentId s6=new StudentId("mc56",2013,07);
		StudentId s7=new StudentId("bc34",2011,07);
		StudentId s8=new StudentId("bth43",2019,05);
		StudentId s9=new StudentId("mt54",2013,11);
		StudentId s10=new StudentId("m98",2010,10);
	
		tm.put(s1,new StudentDetails(s1,"aaa","bbb",23,"cs","ma"));
		tm.put(s2,new StudentDetails(s2,"loke","kum",24,"cs","bca"));
		tm.put(s3,new StudentDetails(s3,"fan","sha",24,"ca","mca"));
		tm.put(s4,new StudentDetails(s4,"irf","pasa",13,"ca","bca"));
		tm.put(s5,new StudentDetails(s5,"tgf","aaa",23,"cr","bca"));
		tm.put(s6,new StudentDetails(s6,"ikj","bbb",21,"ca","mca"));
		tm.put(s7,new StudentDetails(s7,"abc","ccc",28,"ca","cca"));
		tm.put(s8,new StudentDetails(s8,"def","ddd",26,"ca","dca"));
		tm.put(s9,new StudentDetails(s9,"irth","eee",24,"cs","gca"));
		tm.put(s10,new StudentDetails(s10,"kith","fff",21,"cs","rca"));
	
	
		return tm;
	}
}
