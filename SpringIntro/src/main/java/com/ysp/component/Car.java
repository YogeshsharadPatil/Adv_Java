package com.ysp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("verna") //it is Similar <bean id="verna" class="">
public class Car {
	@Autowired   //it will similar to create object using getBeas
	public Engine engine;
	public void start() {
		engine.accelerate();
	}
	
}
