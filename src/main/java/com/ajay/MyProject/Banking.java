package com.ajay.MyProject;

class BankAccount
{
	void withdraw(double d)
	{
		
	}
	void deposit(double d)
	{
		
	}
	void info()
	{
		
	}
	double move(double a)
	{
		return 0;
	}
}
class SavingsAccount extends BankAccount
{
	String s;
	double amount;
	SavingsAccount(double am)
	{
		this.amount=am;
	}
	SavingsAccount(String s)
	{
		this.s=s;
	}
	void withdraw(double amount)
	{
		if(this.amount>=amount)
		{
			this.amount-=amount;
			System.out.println("-> "+amount+" has been withdrawn..");
			System.out.println("Total Amount : "+this.amount);
		}
		else
		{
			System.out.println("Insufficient amount");
		}
	}
	void deposit(double amount)
	{
		this.amount+=amount;
		System.out.println("-> "+amount+" is credited..");
		System.out.println("Total Amount : "+this.amount);
	}
}
class CheckingAccount extends SavingsAccount
{
	CheckingAccount(String s)
	{
		super(s);
	}
	CheckingAccount(double am) 
	{
		super(am);
	}
	void info()
	{
		System.out.println("Total Amount : "+this.amount);
	}
	
}
public class Banking 
{
	public static void main(String a[])
	{
		BankAccount c1=new CheckingAccount(1000.0);
		BankAccount c2=new CheckingAccount(1000.0);
		BankAccount c3=new SavingsAccount("a");
		BankAccount c4=new SavingsAccount("a");
		System.out.println(c1.hashCode()+" "+c2.hashCode());
		System.out.println(c3.hashCode()+" "+c4.hashCode());
		c1.info();
		c1.deposit(2000);
		c1.withdraw(3000);
		
	}
}
