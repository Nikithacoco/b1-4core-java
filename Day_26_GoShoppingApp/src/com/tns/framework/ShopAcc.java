package com.tns.framework;

public abstract class ShopAcc 
{
   private int accNo;
   private String accNm;
   private float charges;
   
   public ShopAcc(int accNo, String accNm, float charges) {
	super();
	this.accNo = accNo;
	this.accNm = accNm;
	this.charges = charges;
}
   
   public void bookProduct(float charges)
   {
	   
   }
   public void items(float charges)
   {
	   
   }
@Override
public String toString() {
	return String.format("ShopAcc [accNo=%s, accNm=%s, charges=%s]", accNo, accNm, charges);
}
}
