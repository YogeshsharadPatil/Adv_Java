package com.ysp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //created the Bean
public class Door {
	
	@Autowired // i am getting that bean by Autowired Annotation
	private Alarm alarm;
	
	public void open() {
		alarm.activate();
	}
	public void close() {
		alarm.deactivare();
	}
}
