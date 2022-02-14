package com.selnew;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEg {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chanthru\\eclipse-workspace\\SeleniumEg\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement b1 = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		b1.click();
		Alert simple = driver.switchTo().alert();
		simple.accept();
		WebElement s = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
		s.click();
		WebElement b2 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		b2.click();
		Thread.sleep(1000);
		Alert conform = driver.switchTo().alert();
		conform.dismiss();
		WebElement s1 = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]"));
		s1.click();
		WebElement b3 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		b3.click();
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Chanthru");
		String text = prompt.getText();
		System.out.println(text);
		prompt.accept();	
	}

}
