package com.ajay.MyProject;

public class Circle extends Shape
{	
	double radius;
	Circle(double radius)
	{
	this.radius=radius;
	}
	public double calcArea()
	{
		double a=3.14*this.radius*this.radius;
		return a;
	}
}
