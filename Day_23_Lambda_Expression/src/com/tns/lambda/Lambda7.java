package com.tns.lambda;

public class Lambda7 
{

	public static void main(String[] args) 
	{
		Runnable r1=()->
		{
			System.out.println("Class Name is:Lambda7");
		};
		Thread t=new Thread(r1);
		t.start();

	}

}
