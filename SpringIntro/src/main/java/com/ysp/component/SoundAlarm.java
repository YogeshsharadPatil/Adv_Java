package com.ysp.component;

import org.springframework.stereotype.Component;

@Component
public class SoundAlarm implements Alarm{

	@Override
	public void activate() {
		System.out.println("Sound Alarm is Activated...");
		
	}
	@Override
	public void deactivare() {
		System.out.println("Sound Alarm is Deactivated...");
	}

}
