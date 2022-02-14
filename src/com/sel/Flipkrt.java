package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkrt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chanthru\\eclipse-workspace\\SeleniumEg\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement no = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		no.sendKeys("example@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("5432109");
		WebElement log = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		log.click();
		
		
		
		
	}
}
