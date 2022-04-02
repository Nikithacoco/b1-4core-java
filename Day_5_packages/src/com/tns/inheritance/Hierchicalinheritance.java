package com.tns.inheritance;
 
class CellPhones
{
void message()
{
	System.out.println("Hi, Nikitha");
}
void call()
{
	System.out.println("I am calling Nikitha");
}
}
	class Samsung extends CellPhones
	{
		void facelock()
		{
			System.out.println("Modern Facelock");
		}

}
class Oneplus extends CellPhones
{
	void games()
	{
		System.out.println("PUBg");
	}
	}
public class Hierchicalinheritance
{
	public static void main(String[] args)
	{
		Oneplus c=new Oneplus();
		c.games();
		c.message();
		c.call();
		Samsung s=new Samsung();
		s.facelock();
	}
}
		
	