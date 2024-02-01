package com.ysp.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ysp.Entity.Product;
import com.ysp.component.ProductRepository;

public class App2crud {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("my-spring-config.xml");
	ProductRepository productRepository	=ctx.getBean(ProductRepository.class);
	List<Product> plist	=(List<Product>) productRepository.findAll();
		for(Product p:plist) {
			System.out.println(p.toString());
		}
	}

}
