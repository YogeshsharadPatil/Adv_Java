package com.ysp;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelDemo2 {
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.name("firstname")).click();
//		driver.findElement(By.name("firstname")).sendKeys("yogesh");
//		driver.findElement(By.name("lastname")).click();
//		driver.findElement(By.name("lastname")).sendKeys("Patil");
//		driver.findElement(By.id("sex-0")).click();
//        // Select Experience
//        driver.findElement(By.id("exp-4")).click();
//        // Enter Date
//       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.findElement(By.id("datepicker")).click();
//        driver.findElement(By.id("datepicker")).sendKeys("16-11-2022");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.findElement(By.id("profssion-0")).click();
//		
	
		driver.get("https://demo.seleniumeasy.com/");
		driver.findElement(By.xpath("//*[@id=\"btn_basic_example\"]")).click();
		driver.findElement(By.linkText("Simple Form Demo")).click();
		driver.findElement(By.xpath("//*[@id=\"user-message\"]")).sendKeys("Have a great day");
		driver.findElement(By.xpath("//*[@id=\"get-input\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"value1\"]")).sendKeys("10");
		driver.findElement(By.xpath("//*[@id=\"value2\"]")).sendKeys("20");
		driver.findElement(By.xpath("//*[@id=\"gettotal\"]/button")).click();
		
		//try {Thread.sleep(2000);}catch (Exception e) {}
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"basic\"]/div/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"isAgeSelected\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label/input")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"basic\"]/div/a[3]")).click();
		//driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[1]/input")).click();
		//driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input")).click();
		driver.navigate().to("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		driver.findElement(By.xpath("//*[@id=\"select-demo\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"select-demo\"]/option[3]")).click();
	}
}