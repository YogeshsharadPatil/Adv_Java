package com.ysp.component;

import org.springframework.stereotype.Component;

@Component("fireEngine")
public class Engine {
	public void accelerate() {
		System.out.println("vroom vroom...");
	
	}
}
