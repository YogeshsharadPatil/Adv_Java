package com.ysp.component;

public interface Bank {
	public boolean isAccountPresent(int accNo);
	public void withdrawn(int atmId , int accNo , int amount);
}
