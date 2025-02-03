package com.ajay.MyProject;
import java.util.Scanner;

public class Employee 
{
	int id;
	String name;
	double salary;
	double s;
	static int num=4;
	public Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return getClass()+"\n"+id+" "+name+" "+salary+" "+((50/100.0)*salary);
	}
	
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		Employee e1=new Employee(1,"Ajay",20000);
		System.out.print("Enter your name : ");
		String name=sc.nextLine();
		sc.close();
		System.out.println(name);
		System.out.print(e1);
	}
}
