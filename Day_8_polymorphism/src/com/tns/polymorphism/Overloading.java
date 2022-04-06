package com.tns.polymorphism;

public class Overloading
{
void assign(int a)
{
	System.out.println("Area of Square:"+(a*a));
}
void assign(int a,int b)
{
	System.out.println("Area of Rectangle:"+(a*b));
}
	public static void main(String[] args) {
		Overloading o=new Overloading();
		o.assign(5);;
		o.assign(10,20);
	}

	}


