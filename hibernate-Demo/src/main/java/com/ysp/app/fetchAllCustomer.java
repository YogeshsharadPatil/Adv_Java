package com.ysp.app;

import java.util.List;

import com.ysp.Entity.Customer;
import com.ysp.dao.Customerdao;

public class fetchAllCustomer {

	public static void main(String[] args) {
		Customerdao dao = new Customerdao();
		List<Customer> allcustlist=dao.allCustomers();
		allcustlist.forEach(c->{
			System.out.println(c.getId());
			System.out.println(c.getName());
			System.out.println(c.getEmail());
			System.out.println(c.getDate_of_Birth());
			System.out.println(c.getCity());
			System.out.println("________________________");
		});
		

	}

}
