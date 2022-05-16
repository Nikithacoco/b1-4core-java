package com.tns.application;

import com.tns.framework.PrimeAcc;

import com.tns.framework.ShopAcc;

public class GSPrimeAcc extends PrimeAcc
{
	 private static float charges;
     public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		GSPrimeAcc.charges=charges;
	}
@Override
public void bookProduct(float charges) {
	System.out.println("Account No: "+ShopAcc.getAccNo()+"\n"+"Account Name: "+ShopAcc.getAccNm()+"\n"+"Charges: "+charges+"\n"+"Delivery Charges: "+PrimeAcc.getDeliverycharges());
	
}

public static float getCharges() {
	return GSPrimeAcc.charges;
}
@Override
public void items(float item_id) {
	
	
}

@Override
public String toString() {
	return "GSPrimeAcc[toString()="+super.toString()+",getCharges()="+getCharges()+"]";
}
 
}
