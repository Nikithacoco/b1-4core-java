package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc
{
   private static boolean isPrime;
   private static final float deliveryCharges=0.0f;
  
public PrimeAcc(int accNo,String accNm,float charges,boolean isPrime) 
{
	super(accNo,accNm,charges);
	//this.isPrime = isPrime;
	PrimeAcc.isPrime=isPrime;
}
public void bookProduct (float Charges)
  {
	  
  }



@Override
public String toString() {
	return String.format("PrimeAcc [isPrime=%s]", isPrime);
}
}