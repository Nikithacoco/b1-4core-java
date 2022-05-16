package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc
{
   private static boolean isPrime;
   private static final float deliveryCharges=100.0f;
  
public PrimeAcc(int accNo,String accNm,float charges,boolean isPrime) 
{
	super(accNo,accNm,charges);
	//this.isPrime = isPrime;
	this.isPrime=isPrime;
}

public static boolean getisPrime() {
	return isPrime;
}



public static float getDeliverycharges() {
	return deliveryCharges;
}

}