package com.ysp.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class SbiAtm implements Atm {
	
	@Autowired //its like get the Created object
	List<Bank> banks;
	
	@Override
	public void withdrawn(int accNo, double amount) {
		System.out.println("Customer at SbiAtm to Withdrwan Money");
	
		Bank CurrentBank = null;
		for(Bank bank:banks) {
			if(bank.isAccountPresent(accNo)) {
				CurrentBank = bank;
			}
		}
		CurrentBank.withdrawn(accNo, accNo, accNo);
	}
	
}
