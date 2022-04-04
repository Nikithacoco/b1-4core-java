package com.tns.abst;

class A
{
	String name="Nikitha";
}
class B extends A
{
	String name="Manish";
	void print()
	{
		System.out.println("Hi, i am "+name);
		System.out.println("Hi, i am "+super.name);
		
	}
}

public class Example3 
{

	public static void main(String[] args) 
	{
		B b=new B();
		b.print();

	}

}
