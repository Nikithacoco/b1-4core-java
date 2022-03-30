package com.tnsoops;

public class Constructor {

	String str;
	int a;
	Constructor(String st,int x)
	{
		str=st;
		a=x;
	}
	void display()
	{
	System.out.println(str+" "+a);
	}
	public static void main(String[] args)
	{
		Constructor c=new Constructor("Manish",55);
		Constructor c1=new Constructor("Nikitha",25);
		c.display();
		c1.display();
		
}

}


