package com.selnew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelEg1 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chanthru\\eclipse-workspace\\SeleniumEg\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/automation-practice-form/");
		WebElement fin = driver.findElement(By.xpath("//div[text()='Select State']"));
		Select s = new Select(fin);
		List<WebElement> options = s.getOptions();
		for (WebElement opts : options) {
			String text = opts.getText();
			System.out.println(text);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
