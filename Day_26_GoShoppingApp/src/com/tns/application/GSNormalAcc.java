package com.tns.application;

import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;

public class GSNormalAcc extends NormalAcc
{

	public GSNormalAcc(int accNo, String accNm, float deliverycharges, float charges) {
		super(accNo, accNm, deliverycharges, charges);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bookProduct(float charges) {
		float charges1=charges+NormalAcc.getDeliveryCharges();
		System.out.println("Account No: "+NormalAcc.getAccNo()+"\n"+"Account Name: "+NormalAcc.getAccNm()+"\n"+"Charges: "+NormalAcc.getCharge()+"\n"+"Delivery Charges: "+NormalAcc.getDeliveryCharges());
	}

	@Override
	public void items(float item_id) {
System.out.println();
		
	}
	@Override
	public String toString() {
		return "GSNormalAcc[toString()="+super.toString()+",getCharges()="+getCharges()+"]";
	}

}
