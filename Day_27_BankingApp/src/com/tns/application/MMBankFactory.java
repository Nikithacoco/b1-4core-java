package com.tns.application;

import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;
import com.tns.framework.BankFactory;

	public class MMBankFactory extends BankFactory 
	{
		
	
	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float creditLimits, float accBal) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalery) {
		// TODO Auto-generated method stub
		return null;
	}
}
