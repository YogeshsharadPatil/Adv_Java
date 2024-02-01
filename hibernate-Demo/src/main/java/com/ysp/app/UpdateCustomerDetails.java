package com.ysp.app;

import java.time.LocalDate;

import com.ysp.Entity.Customer;
import com.ysp.dao.Customerdao;

public class UpdateCustomerDetails {

	public static void main(String[] args) {
		Customerdao dao = new Customerdao();
		Customer customer =dao.fetchbyid(8);
		customer.setDate_of_Birth(LocalDate.of(1955, 12, 13));
		dao.Update(customer);
	}

}
