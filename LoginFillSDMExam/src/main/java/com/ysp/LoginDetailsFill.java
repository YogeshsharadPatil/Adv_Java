package com.ysp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDetailsFill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("http://127.0.0.1:5500/Login.html");
		dr.findElement(By.xpath("/html/body/form/input[1]")).click();
		dr.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("yogesh@gmail.com");
		dr.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("Yogesh123");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dr.findElement(By.xpath("/html/body/form/button")).click();
		
	}

}