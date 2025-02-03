package com.ajay.MyProject;

public class Example 
{
	public static void main(String a[])
	{
		String s1="a";
		String s2="a";
		String s3=s1;
		System.out.println(s1.hashCode()+" "+s2.hashCode()+" "+s3.hashCode());
		s1="b";
		System.out.println(s1.hashCode()+" "+s2.hashCode()+" "+s3.hashCode());
		System.out.println(s1==s2);
		System.out.println();
		
		Integer i1=10;
		Integer i2=19;
		System.out.println(i1.hashCode()+" "+i2.hashCode()+"\n");
		
		Character c1='c';
		Character c2='c';
		System.out.println(c1.hashCode()+" "+c2.hashCode());
	}
}