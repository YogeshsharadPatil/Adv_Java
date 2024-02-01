package com.ysp.component;

import org.springframework.stereotype.Component;

//2nd way to create a bean
@Component("currCnvrtr")
public class CurrencyConverter {
	public double CurrConvert(String from , String to, double amount) {
		if(from.equals("USD") && from.equals("INR")) {
			return amount * 83.34;
		}
		return 0;
		
	}
}
