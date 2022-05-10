package com.tns.framework;

public abstract class NormalAcc extends ShopAcc
{
	 private static float deliveryCharges;
	 
	public NormalAcc(int accNo,String accNm,float deliverycharges,float charges) {

		super(accNo,accNm,charges);
		NormalAcc.deliveryCharges=deliveryCharges;
	}
	public void bookProduct (float deliveryCharges)
	  {
		  
	  }
	@Override
	public String toString() {
		return String.format("NormalAcc [deliveryCharge=%s]", deliveryCharges);
	}
	 
}
