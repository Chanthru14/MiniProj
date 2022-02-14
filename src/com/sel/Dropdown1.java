package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chanthru\\eclipse-workspace\\SeleniumEg\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		//Single DropDown
		WebElement drop = driver.findElement(By.id("dropdown1"));
		Select s = new Select(drop);
		boolean mul = s.isMultiple();
		System.out.println("Is Multiple : " + mul);
		s.selectByIndex(1);
		List<WebElement> options = s.getOptions();
		for (WebElement opts : options) {
			String txt = opts.getText();
			System.out.println(txt);
		}
		System.out.println();
		List<WebElement> options2 = s.getAllSelectedOptions();
		for (WebElement opt2 : options2) {
			String text = opt2.getText();
			System.out.println("All Selected options : " + text);
		}
		System.out.println();
		WebElement fso = s.getFirstSelectedOption();
		String fs = fso.getText();
		System.out.println("First Selected Option : " + fs);
		
		
		
		
		
		
	}

}
