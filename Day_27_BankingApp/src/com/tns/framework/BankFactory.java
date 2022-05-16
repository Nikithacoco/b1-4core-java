package com.tns.framework;

public abstract class BankFactory
{
	 public abstract CurrentAcc getNewCurrentAccount(int accNo,String accNm,float accBal, float CreditLimit);
     public abstract SavingAcc  getNewSavingAccount(int accNo,String accNm,float accBal,boolean isSalery);
}
