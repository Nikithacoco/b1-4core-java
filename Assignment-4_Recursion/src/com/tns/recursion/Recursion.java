package com.tns.recursion;
import java.util.ArrayList;
import java.util.List;
public class Recursion
{
static void nikitha(List<Integer> person, int k,int index)
{
	if(person.size() ==1)
	{
		System.out.println(person.get(0));
	
		return ;
	}
	index = ((index + k) % person.size());
	person.remove(index);
	nikitha(person,k,index);
}
		

	public static void main(String[] args)
	{
		int n =5;
		int k =2;
		k--;
		int index=0;
		List<Integer> person =new ArrayList<>();
		for (int i=1; i <= n;i++)
		{
		person.add(i);
	}
	nikitha(person,k,index);
}
}
		
