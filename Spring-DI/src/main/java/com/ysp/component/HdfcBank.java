package com.ysp.component;

import org.springframework.stereotype.Component;

@Component
public class HdfcBank implements Bank{

	@Override
	public void withdrawn(int atmId, int accNo, int amount) {
		System.out.println("Money Withdrawn from HDFC Bank");
	}

	@Override
	public boolean isAccountPresent(int accNo) {
		if(accNo==1000) {
			return true;
		}
		return false;
	}
}
