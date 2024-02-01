package com.ysp;

import java.awt.Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.makemytrip.com/");
//		driver.close();
		
		driver.get("http://localhost:8080/MywebApp/login.html");
		try {Thread.sleep(2000);} catch (Exception e) {}
		driver.findElement(By.name("email")).sendKeys("ysp@gmail.com");
		try {Thread.sleep(2000);} catch (Exception e) {}
		driver.findElement(By.name("pwd")).sendKeys("ysp");
		try {Thread.sleep(2000);} catch (Exception e) {}
		driver.findElement(By.name("rememberme")).click();
		//driver.findElement(By.cssSelector("button[type='submit'])")).click();
		try {Thread.sleep(2000);} catch (Exception e) {}
		driver.findElement(By.tagName("button")).click();
		
	}

}
