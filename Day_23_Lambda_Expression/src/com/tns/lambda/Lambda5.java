package com.tns.lambda;

interface C
{
	String print(String message);
}

public class Lambda5 {

	public static void main(String[] args) 
	{
		C obj=(String message)->
		{
			return message;
		};
		
		System.out.println("The Name is:"+obj.print("Nikitha"));

	}

}
