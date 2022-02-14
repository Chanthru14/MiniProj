package com.selnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameEg {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chanthru\\eclipse-workspace\\SeleniumEg\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.switchTo().frame("singleframe");
		WebElement txt1 = driver.findElement(By.xpath("//input[@type='text']"));
		txt1.sendKeys("Chanthru");
		driver.switchTo().defaultContent();
		WebElement button = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
		button.click();
		WebElement oframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(oframe);
		WebElement iframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(iframe);
		WebElement txt2 = driver.findElement(By.xpath("//input[@type='text']"));
		txt2.sendKeys("RaviKannan");
		driver.switchTo().defaultContent();
		
				
	}

}
