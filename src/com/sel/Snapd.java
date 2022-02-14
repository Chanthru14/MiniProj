package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapd {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chanthru\\eclipse-workspace\\SeleniumEg\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement sgin = driver.findElement(By.xpath("//div[@class='accountInner']"));
		sgin.click();
		WebElement reg = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		reg.click();
		Thread.sleep(1000);
		WebElement name = driver.findElement(By.id("googleUserLogin"));
		name.click();
		
		
	}

}
