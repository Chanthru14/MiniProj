package com.selnew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {
		static int totalIndex , newCaseIndex , deathIndex; 
		static String country = "usa";
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		driver.manage().window().maximize();
		 
		List<WebElement> headers = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));
		for (int i = 0; i < headers.size(); i++) {
			String text = headers.get(i).getText();
			String head = text.replaceAll("\n", " ");
			if (head.equalsIgnoreCase("Total Cases")) {
				totalIndex = i;
				System.out.println("Index of total cases = " + totalIndex);
			}
			else if (head.equalsIgnoreCase("New Cases")) {
				newCaseIndex = i;
				System.out.println("Index of New Cases = " + newCaseIndex);
			}
			else if (head.equalsIgnoreCase("Total Deaths")) {
				deathIndex = i;
				System.out.println("Index of total death = " + deathIndex);
			}
		}
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr"));
		for (int i = 0; i < rows.size(); i++) {
			List<WebElement> data = rows.get(i).findElements(By.tagName("td"));
			
			for (int j = 0; j < data.size(); j++) {
				if (data.get(j).getText().equalsIgnoreCase(country)) {
					System.out.println("Total Cases : " +data.get(totalIndex).getText());
					System.out.println("New Cases : " +data.get(newCaseIndex).getText());
					System.out.println("Total Death : " +data.get(deathIndex).getText());
					
				}
			}
		}
	
	}

}
