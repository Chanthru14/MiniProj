package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chanthru\\eclipse-workspace\\SeleniumEg\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement box = driver.findElement(By.xpath("(//select)[6]"));
		Select s = new Select(box);
		boolean multiple = s.isMultiple();
		System.out.println("Is Multiple : " + multiple);
		System.out.println();
		s.selectByValue("1");
		s.selectByValue("4");
		List<WebElement> opts = s.getOptions();
		System.out.println("All options here : ");
		for (WebElement ops : opts) {
			String txt = ops.getText();
			System.out.println(txt);
		}
		System.out.println();
		List<WebElement> selops = s.getAllSelectedOptions();
		System.out.println("Selected Options Are : ");
		for (WebElement sel : selops) {
			String selected = sel.getText();
			System.out.println(selected);
		}
		System.out.println();
		WebElement fso = s.getFirstSelectedOption();
		String fs = fso.getText();
		System.out.println("First selected option is : ");
		System.out.println(fs);
		System.out.println();
		
		
		
		
		
	}

}
