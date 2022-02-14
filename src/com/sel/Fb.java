package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chanthru\\eclipse-workspace\\SeleniumEg\\Driver\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement newac = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		newac.click();
		Thread.sleep(3000);
		WebElement d = driver.findElement(By.id("day"));
		Select ds = new Select(d);
		ds.selectByValue("14");
		WebElement m = driver.findElement(By.id("month"));
		Select ms = new Select(m);
		ms.selectByIndex(7);
		WebElement y = driver.findElement(By.id("year"));
		Select ys = new Select(y);
		ys.selectByVisibleText("1999");
	}

}
