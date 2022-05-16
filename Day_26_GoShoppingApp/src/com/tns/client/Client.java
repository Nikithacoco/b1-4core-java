package com.tns.client;

import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopFactory;
import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		ShopFactory obj=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(101,"Nikitha",0.0f,true);
		NormalAcc n=new GSNormalAcc(102,"Bharthi",50.0f,0.0f);
		System.out.println("Prime Account: ");
		p.bookProduct(350.0f);
		System.out.println();
		System.out.println("Normal Account: ");
		n.bookProduct(400.0f);
		
		System.out.println(p);
		System.out.println();
		System.out.println(n);
	}
}

