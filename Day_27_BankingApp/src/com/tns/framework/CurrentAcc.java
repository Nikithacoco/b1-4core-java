package com.tns.framework;

public abstract class CurrentAcc extends BankAcc
{
	 private static float CreditLimits;
	 
	public CurrentAcc(int accNo,String accNm,float CreditLimit,float accBal) {

		super(accNo,accNm,accBal);
		CurrentAcc.CreditLimits=CreditLimits;
	}

	public static float getCreditLimits() {
		return CreditLimits;
	}
	@Override
	public String toString() {
		return "CurrentAcc[getaccBal()="+getCreditLimits()+"getCreditLimits"+getCreditLimits()+",toString()="+super.toString()+"]";
	 
}
	
}
