package com.minipt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Model {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chanthru\\eclipse-workspace\\SeleniumEg\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
		sign.click();
		WebElement mail = driver.findElement(By.id("email_create"));
		mail.sendKeys("chanthru148@gmail.com");
		WebElement createacnt = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		createacnt.click();
		WebElement mr = driver.findElement(By.id("id_gender1"));
		mr.click();
		WebElement fname = driver.findElement(By.id("customer_firstname"));
		fname.sendKeys("Chanthru");
		WebElement lname = driver.findElement(By.id("customer_lastname"));
		lname.sendKeys("R A");
		WebElement id = driver.findElement(By.id("email"));
		id.clear();
		id.sendKeys("chanthru148@gmail.com");
		WebElement pwd = driver.findElement(By.id("passwd"));
		pwd.sendKeys("chanthrura");
		WebElement date = driver.findElement(By.id("days"));
		Select s = new Select(date);
		s.selectByValue("14");
		WebElement month = driver.findElement(By.id("months"));
		Select s1 = new Select(month);
		s1.selectByValue("8");
		WebElement year = driver.findElement(By.id("years"));
		Select s2 = new Select(year);
		s2.selectByValue("1999");
		WebElement comp_name = driver.findElement(By.id("company"));
		comp_name.sendKeys("Texas Construction company");
		WebElement add1 = driver.findElement(By.id("address1"));
		add1.sendKeys("2601 West 7th St");
		WebElement add2 = driver.findElement(By.id("address2"));
		add2.sendKeys("AMLI 7th Street Station");
		WebElement add_city = driver.findElement(By.id("city"));
		add_city.sendKeys("Fort Worth");
		WebElement state = driver.findElement(By.id("id_state"));
		Select s3 = new Select(state);
		s3.selectByValue("43");
		WebElement zip = driver.findElement(By.id("postcode"));
		zip.sendKeys("76107");
		WebElement phnno = driver.findElement(By.id("phone_mobile"));
		phnno.sendKeys("(817)877-1977");
		WebElement alias = driver.findElement(By.id("alias"));
		alias.sendKeys("Fort Worth, Texas");
		WebElement reg = driver.findElement(By.id("submitAccount"));
		reg.click();
			
		
	}

}
