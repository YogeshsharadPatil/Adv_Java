package com.ysp.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ysp.component.Customer;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
		Customer basecustomer=(Customer) ctx.getBean("baseCustomer");
		System.out.println(basecustomer.toString());
		
		
		Customer customer =	(Customer)ctx.getBean("customer");
		System.out.println(customer.toString());
		
		/*Parent bean is having value only for Country property.
			Child bean has the values for all 3 properties even though we have added only 2 properties for Child.
		*/
	}
}
