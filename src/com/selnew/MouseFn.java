package com.selnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseFn {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chanthru\\eclipse-workspace\\SeleniumEg\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		WebElement dclk = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		Actions a = new Actions(driver);
		a.doubleClick(dclk).build().perform();
		WebElement rclk = driver.findElement(By.id("rightClickBtn"));
		a.contextClick(rclk).build().perform();
		WebElement clk = driver.findElement(By.xpath("//button[text()='Click Me']"));
		a.click(clk).build().perform();
		driver.navigate().to("https://www.rcet.org.in/");
		WebElement fnd = driver.findElement(By.xpath("//a[@href='events']"));
		a.moveToElement(fnd).build().perform();
		driver.navigate().to("http://www.leafground.com/pages/drop.html");
		WebElement dg = driver.findElement(By.id("draggable"));
		WebElement dp = driver.findElement(By.id("droppable"));
		a.dragAndDrop(dg, dp).build().perform();
	}

}
