package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElemnt {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chanthru\\eclipse-workspace\\SeleniumEg\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("VKC cut shoe");
		WebElement txt = driver.findElement(By.xpath("//h2[contains(text(),'your')]"));
		String text = txt.getText();
		System.out.println(text);
		WebElement sh = driver.findElement(By.xpath("//input[@type='submit']"));
		sh.click();
		String ul = driver.getCurrentUrl();
		System.out.println("The current url is : " + ul);
	}

}
