package com.selnew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EvnMonth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chanthru\\eclipse-workspace\\SeleniumEg\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement newac = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		newac.click();
		WebElement mon = driver.findElement(By.id("month"));
		Select s = new Select(mon);
		List<WebElement> options = s.getOptions();
		
		
		
		
		
		
		
		
		
		
	}
}
