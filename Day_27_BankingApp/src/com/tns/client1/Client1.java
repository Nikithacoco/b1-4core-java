package com.tns.client1;

import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.application.MMBankFactory;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class Client1 {
	
	public static void main(String[] args) {
		BankFactory obj=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(1001,"Nikitha",500.0f,true);
		CurrentAcc c=new MMCurrentAcc(1002,"Bharthi",5000.0f,50000.0f);
		System.out.println("Saving Account: ");
		s.withdraw(200.0f);
		System.out.println();
		System.out.println("Current Account: ");
		c.withdraw(200.0f);
		
		System.out.println(s);
		System.out.println();
		System.out.println(c);
	}
}

