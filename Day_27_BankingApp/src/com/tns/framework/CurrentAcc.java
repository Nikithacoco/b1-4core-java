package com.tns.framework;

public abstract class CurrentAcc extends BankAcc
{
	 private static float creditLimits;
	 
	/**
	 * 
	 */
	public CurrentAcc(int accNo,String accNm,float creditLimits, float accBal) {
		
		super(accNo,accNm,accBal);
		CurrentAcc.creditLimits=creditLimits;
	}
	public void withdraw (float creditLimits)
	   { 
		   
	   }
	@Override
	public String toString() {
		return String.format("CurrentAcc [creditLimits=%s]", creditLimits);
	}
	
	}
	


