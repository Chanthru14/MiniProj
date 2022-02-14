package com.selnew;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screens1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chanthru\\eclipse-workspace\\SeleniumEg\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rcet.org.in/");
		driver.manage().window().maximize();
		TakesScreenshot s = (TakesScreenshot) driver;
		File sh = s.getScreenshotAs(OutputType.FILE);
		File loc = new File("C:\\Users\\Chanthru\\eclipse-workspace\\SeleniumEg\\Screenshot\\rcet.png");
		FileUtils.copyFile(sh, loc);
		
	
	}
}
