package com.minipt;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcntScreenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chanthru\\eclipse-workspace\\SeleniumEg\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
		sign.click();
		WebElement mailid = driver.findElement(By.id("email"));
		mailid.sendKeys("chanthru148@gmail.com");
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("chanthrura");
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		login.click();
		TakesScreenshot sc = (TakesScreenshot) driver;
		File source = sc.getScreenshotAs(OutputType.FILE);
		File Dest = new File("C:\\Users\\Chanthru\\eclipse-workspace\\SeleniumEg\\Screenshot\\Loginpage.png");
		FileUtils.copyFile(source, Dest);	
		
		
	}

}
