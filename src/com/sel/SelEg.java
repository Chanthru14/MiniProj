package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelEg {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chanthru\\eclipse-workspace\\SeleniumEg\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("9543927630");
		boolean ds = mail.isDisplayed();
		System.out.println("Mail id visible : " + ds);
		WebElement pw = driver.findElement(By.name("pass"));
		pw.sendKeys("chanthu14");
		String att1 = mail.getAttribute("value");
		System.out.println(att1);
		String att2 = pw.getAttribute("name");
		System.out.println(att2);
		WebElement lin = driver.findElement(By.name("login"));
		lin.click();
		/*boolean en = lin.isEnabled();
		System.out.println("The login button works : " + en);
		pw.clear();*/
		
		
	}

}
