package com.ysp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
	@RequestMapping("/hello-rest.ysp")
	public String SayHello() {
		return "Hello from Spring RestController";
	}
	
	@GetMapping("/hello-rest-get.ysp")
	public String sayHello1() {
		return "Dealing with GetMapping guyf...";
	}
}
