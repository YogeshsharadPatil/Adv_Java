package com.ysp.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ysp.Entity.Product;
import com.ysp.component.ProductInventory;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
		ProductInventory productInventory=(ProductInventory) ctx.getBean("productInventory");
//		Product product = new Product();
//		product.setName("iphone 13");
//		product.setQuantity(1);
//		product.setPrice(50000);
//		productInventory.add(product);
		
		List<Product> plist =productInventory.getAllproducts();
		for(Product p:plist) {
			System.out.println(p.toString());
			System.out.println("__________________________________");
		}
		
	}

}
