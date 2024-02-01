package com.ysp.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ysp.component.Car;
import com.ysp.component.CurrencyConverter;
import com.ysp.component.Door;
import com.ysp.component.HelloWorld;
import com.ysp.component.TextEditor;
import com.ysp.component.WelCome;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring.xml");
		//it will load all the beans we have entered into bean file
		//Option 1 for getting the created  beans 
		HelloWorld hw =(HelloWorld) ctx.getBean("hello");
		hw.sayHello("Yogesh");
		
		//get welcome bean present inside the Applicationcontext Container
		WelCome wc	=(WelCome) ctx.getBean("welcome");
		wc.welcome();
		
	CurrencyConverter cc	=(CurrencyConverter)ctx.getBean("currCnvrtr"); 
	//here You will get one error if u do not do component-Scan configuration inside .xml file
	//saying No bean named 'currCnvrtr' available //so do the configuration
		
	double conAmount =  cc.CurrConvert("USD", "INR", 1000);
	System.out.println(conAmount);
	
	Car mycar =(Car) ctx.getBean("verna");
	mycar.start();
	
	  TextEditor te  =	(TextEditor) ctx.getBean("textEditor");
	  te.load("abc.text");
	  
	
	  
	  Door d = 	(Door) ctx.getBean("door");
	  d.open();
	  d.close();
	  
	  
	}

}
