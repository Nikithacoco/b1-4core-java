package com.tns.application;

import com.tns.framework.SavingAcc;
import com.tns.framework.BankAcc;

public class MMSavingAcc extends SavingAcc 
{
    private static float CreditLimit;
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalery) {
		super(accNo, accNm, accBal, isSalery);
		MMSavingAcc.CreditLimit=CreditLimit;
	}
	
@Override
public void withdraw(float withdraw) {
	System.out.println("Account No: "+SavingAcc.getAccNo()+"\n"+"Account Name: "+SavingAcc.getAccNm()+"\n"+"Account Balance: "+SavingAcc.getAccBal()+"\n"+"Credit Limits: "+SavingAcc.getCreditLimit());
	
}


public static float getCreditLimit() {
	return MMSavingAcc.CreditLimit;
}

@Override
public void deposite(float deposite_id) {
}
	@Override
	public String toString() {
		return String.format("MMSavingAcc [toString()=%s]", super.toString());
	}
	
}


