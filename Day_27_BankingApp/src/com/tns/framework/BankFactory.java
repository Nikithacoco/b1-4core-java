package com.tns.framework;

public abstract class BankFactory
{
	 public abstract CurrentAcc getNewCurrentAccount(int accNo,String accNm,float creditLimits, float accBal);
     public abstract SavingAcc  getNewSavingAccount(int accNo,String accNm,float accBal,boolean isSalery);
}
