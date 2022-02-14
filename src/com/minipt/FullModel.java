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
import org.openqa.selenium.support.ui.Select;

public class FullModel {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chanthru\\eclipse-workspace\\SeleniumEg\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
		sign.click();
		WebElement mailid = driver.findElement(By.id("email"));
		mailid.sendKeys("chanthru148@gmail.com");
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("chanthrura");
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		login.click();
		WebElement dress = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		dress.click();
	    WebElement dressmod = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		dressmod.click();
		WebElement newframe = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(newframe);
		WebElement quantity = driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
		quantity.click();
		quantity.click();
		WebElement size = driver.findElement(By.id("group_1"));
		Select s = new Select(size);
		s.selectByValue("3");
		WebElement addcart = driver.findElement(By.name("Submit"));
		addcart.click();
		driver.switchTo().defaultContent();
		WebElement proceed1 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proceed1.click();
		driver.switchTo().defaultContent();
		WebElement proceed2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		proceed2.click();
		WebElement proceed3 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		proceed3.click();
		WebElement checkbox = driver.findElement(By.id("cgv"));
		checkbox.click();
		WebElement proceed4 = driver.findElement(By.name("processCarrier"));
		proceed4.click();
		WebElement pay = driver.findElement(By.xpath("//a[@class='bankwire']"));
		pay.click();
		WebElement confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confirm.click();
		TakesScreenshot sc = (TakesScreenshot) driver;
		File screenshot = sc.getScreenshotAs(OutputType.FILE);
		File ssloc = new File("C:\\Users\\Chanthru\\eclipse-workspace\\SeleniumEg\\Screenshot\\MiniProject.png");
		FileUtils.copyFile(screenshot, ssloc);
		
	}

}
