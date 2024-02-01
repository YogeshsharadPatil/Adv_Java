package com.ysp.app;

import com.ysp.Entity.Customer;
import com.ysp.dao.Customerdao;

public class FetchbyId {
	public static void main(String[] args) {
		//create dao class object and use their method
		Customerdao dao = new Customerdao();
		Customer customer = dao.fetchbyid(1);
		System.out.println(customer.getId());
		System.out.println(customer.getName());
		System.out.println(customer.getDate_of_Birth());
		System.out.println(customer.getEmail());
		System.out.println(customer.getCity());
	}
}
