package com.tns.framework;

public abstract class SavingAcc extends BankAcc
{
   private static boolean isSalary;
   private static final float CreditLimit=0.0f;
  
public SavingAcc(int accNo,String accNm,float accBal,boolean isSalary) 
{
	super(accNo,accNm,accBal);
	//this.isSalary = isSalary;
	SavingAcc.isSalary=isSalary;
}

public static boolean getisSalary() {
	return isSalary;
}



public static float getCreditLimit() {
	return CreditLimit;
}

}