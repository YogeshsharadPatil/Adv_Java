package com.ysp.component;

import org.springframework.stereotype.Component;

@Component
public class CityBank implements Bank{

	
	@Override
	public void withdrawn(int atmId, int accNo, int amount) {
		System.out.println("Money Withdrawn from CityBank");
	}

	@Override
	public boolean isAccountPresent(int accNo) {
		if(accNo==1441) {
			return true;
		}
		return false;
	}

}
