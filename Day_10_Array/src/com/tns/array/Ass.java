package com.tns.array;

 class Student1
{
	public int roll_no;
	public String name;
	Student1(int roll_no,String name)
	{
		this.roll_no=roll_no;
		this.name=name;
	}
}
public class Ass 
{
	public static void main(String[] args)
	{
		Student1[] arr;
		arr= new Student1[5];
        arr[0]=new Student1(1,"Amam");
        arr[1]=new Student1(2,"Vaibhav");
        arr[2]=new Student1(3,"Shikar");
        arr[3]=new Student1(4,"Dharmesh");
        arr[4]=new Student1(5,"Mohit");
        for(int i=0;i<arr.length;i++)
        	System.out.println("Element at "+i+" : "+arr[i].roll_no+" "+arr[i].name);
	}
  }
class  Assignment1
{
	public static void main(String[] args)
	{
		int[] a= {10,20,30};
		System.out.println(a.getClass().getName());
	}
}