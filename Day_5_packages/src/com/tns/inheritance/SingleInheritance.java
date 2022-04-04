package com.tns.inheritance;
class parent
{
	void print()
	{
		System.out.print("Hello,this is Nikitha");
	}
}

	class Child extends parent
	{
		void display()
		{
		System.out.print("SingleInheritance");
	}
}
class SingleInheritance
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.display();
		c.print();
	}
}
	
	
	
