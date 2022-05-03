package com.tns.enum1;
enum Bike
{
	Pulser,R15,KTM,R3
}
public class Example3 {

	public static void main(String[] args) {
		Bike c=Bike.R3;
		switch(c)
		{
		case Pulser:
			System.out.println("you choose Pulser");
			break;
		case R15:
			System.out.println("you choose R15");
			break;
		case KTM:
			System.out.println("you choose KTM");
			break;
		case R3:
			System.out.println("you choose R3");
			break;
			default:
				System.out.println("Invalid name");
		}

	}

}
