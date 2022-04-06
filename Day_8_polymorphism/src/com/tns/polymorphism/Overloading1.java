package com.tns.polymorphism;

public class Overloading1 
{
	void assign(int a,int b)
	{
		System.out.println("Area of Rectangle:"+(a*b));
	}
	void assign(float a,float b)
	{
		System.out.println("Area of Rectangle:"+(float) (a*b));
	}
		public static void main(String[] args)
		{
			Overloading1 o=new Overloading1();
			o.assign(5,10);
			o.assign(10f,20f);
		}

		}
	