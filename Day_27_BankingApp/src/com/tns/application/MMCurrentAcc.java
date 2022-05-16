package com.tns.application;

import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class MMCurrentAcc extends CurrentAcc 
{

	public MMCurrentAcc(int accNo, String accNm, float CreditLimit, float accBal) {
		super(accNo, accNm, CreditLimit, accBal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float CreditLimit) {
		float CreditLimit1=CreditLimit+CurrentAcc.getAccBal();
		System.out.println("Account No: "+CurrentAcc.getAccNo()+"\n"+"Account Name: "+CurrentAcc.getAccNm()+"\n"+"Account Balance: "+CurrentAcc.getAccBal()+"\n"+"Credit Limits: "+CurrentAcc.getCreditLimits());
		
	}

	@Override
	public void deposite(float charges) {
		System.out.println();
		
	}

	@Override
	public String toString() {
		return String.format("MMCurrentAcc [toString()=%s]", super.toString());
	}
	

}
