package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chanthru\\eclipse-workspace\\SeleniumEg\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.name("username"));
		name.sendKeys("chanthru_ra");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("anusha14");
		WebElement lin = driver.findElement(By.xpath("//button[@type='submit']"));
		lin.click();
		String url = driver.getCurrentUrl();
		System.out.println("Current Url : " +url);
		
		
		
		
	}

}
