package com.ajay.MyProject;

class Sports
{
	void display()
	{
		
	}
}
class Football extends Sports
{
	void display()
	{
		System.out.println("Playing Football");
	}
}
class Basketball extends Sports
{
	void display()
	{
		System.out.println("Playing Basketball");
	}
}
public class Games 
{
	public static void main(String a[])
	{
		Sports f1=new Football();
		Sports b1=new Basketball();
		f1.display();
		b1.display();
	}
}