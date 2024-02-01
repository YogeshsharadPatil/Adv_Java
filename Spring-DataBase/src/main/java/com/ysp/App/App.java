package com.ysp.App;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ysp.component.Product;
import com.ysp.component.ProductInventory;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
		ProductInventory productInventory	=(ProductInventory) ctx.getBean("productInventoryImpl1");
//		Product product = new Product();
//		product.setName("Redmi 3");
//		product.setQuantity(1);
//		product.setPrice(14000);
//		productInventory.add(product);

		long ms1  = System.currentTimeMillis();
		List<Product> plist = productInventory.getAllProducts();
		long ms2  = System.currentTimeMillis();
		System.out.println("approx time taken " + (ms2-ms1)+"ms");
	System.out.println("_______________________________________________________");
		for(Product p:plist) {
			System.out.println(p.toString());
		}
		System.out.println("__________________________________________________");
		ProductInventory productInventory3	=	(ProductInventory) ctx.getBean("productInventory3");
		List<Product> list3	=	productInventory3.getAllProducts();
		for(Product pl3:list3) {
			System.out.println(pl3.toString());
		}
		System.out.println("__________________________________________________");
		
	}
}
