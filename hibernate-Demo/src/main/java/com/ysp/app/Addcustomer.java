package com.ysp.app;

import java.time.LocalDate;

import com.ysp.Entity.Customer;
import com.ysp.dao.Customerdao;

public class Addcustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customerdao dao = new Customerdao();
		
//		Customer customer = new Customer();
//		customer.setName("Rohit");
//		customer.setEmail("rohit@gmail.com");
//		customer.setCity("Mumbai");
//		LocalDate dtr = LocalDate.of(1990,12, 13);
//		customer.setDate_of_Birth(dtr);
//		
//		dao.add(customer);
		
//		Customer customer2 = new Customer();
//		
//		customer2.setName("Virat");
//		customer2.setEmail("virat@gmail.com");
//		customer2.setCity("Mumbai");
//		LocalDate dtv = LocalDate.of(1988,11, 5);
//		customer2.setDate_of_Birth(dtv);
//		dao.add(customer2);
		
//		Customer customer3 = new Customer();
//		
//		customer3.setName("Shubman");
//		customer3.setEmail("Shubman@gmail.com");
//		customer3.setCity("Gujrat");
//		LocalDate dts = LocalDate.of(1995,11, 28);
//		customer3.setDate_of_Birth(dts);
//		dao.add(customer3);
		
//		Customer customer4 = new Customer();
//		
//		customer4.setName("Ruturaj");
//		customer4.setEmail("ruturaj@gmail.com");
//		customer4.setCity("chennai");
//		LocalDate dtr = LocalDate.of(1995,12, 13);
//		customer4.setDate_of_Birth(dtr);
//		dao.add(customer4);
		
	Customer customer5 = new Customer();
		
		customer5.setName("yogesh");
		customer5.setEmail("yogesh@gmail.com");
		customer5.setCity("Latur");
		LocalDate dtr = LocalDate.of(2000,8, 9);
		customer5.setDate_of_Birth(dtr);
		dao.add(customer5);
		
		
//		do {
//			String choice="yes";
//		}while(choice.equals(""));
		
	}

}
