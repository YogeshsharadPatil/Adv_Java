package com.ysp.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ysp.component.SbiAtm;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring.xml");
		SbiAtm atm = (SbiAtm) ctx.getBean("sbiAtm");
		atm.withdrawn(1000, 10000);
		atm.withdrawn(1441, 5000);
	}

}
