package com.tns.decisionmaking;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	switch(a)
	{
		case 1:
		System.out.println("Nikitha");
		break;
		case 2:
			System.out.println("Hello");
			break;
		case 3:
			System.out.println("Manish");
			break;
			default:
				System.out.println("Invalid input");
				s.close();
	}
	}
	}

	


