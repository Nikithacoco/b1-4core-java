package com.tns.recursion;
import java.io.*;
public class Assignment2 
{
	 public static int sum_of_digit(int n)
	{
		if (n==0)
	    return 0;
		return (n % 10+sum_of_digit(n / 10));
	}
	

	public static void main(String[] args)
	{
		int num = 12345;
		int result = sum_of_digit(num);
		System.out.println("sum of digits in " + num + " is " + result);
	}
}

	