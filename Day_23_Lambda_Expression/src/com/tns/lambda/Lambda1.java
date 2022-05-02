package com.tns.lambda;

interface A
{
	void show();
	
}

public class Lambda1 {
	

	public static void main(String[] args)
	{
		
			A obj=()->
			{
				System.out.println("Welcome to Lambda Expression");
			};
		obj.show();
		

	}

}
