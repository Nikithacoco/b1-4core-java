package com.tns.framework;

public abstract class SavingAcc extends BankAcc
{
    private  static boolean isSalary;
    private static final float creditLimit=0.0f;
   

	
    public SavingAcc(int accNo,String accNm,float accBal,boolean isSalery) 
    {

	super(accNo,accNm,accBal);
	//this.isSalary = isSalary;
	SavingAcc.isSalary=isSalary;
}
public void withdraw (float Charges)
{
	  
}



@Override
public String toString() {
	return String.format("SavingAcc [isSalary=%s]", isSalary);
}
   
}