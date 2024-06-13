package com.staragile.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver",
				"/Users/jaheera/Documents/Drivers/chromedriver-mac-x64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		WebElement Checkbox1 = driver.findElement(By.xpath("(//input[@ type = 'checkbox'])[1]"));
		WebElement Checkbox2 = driver.findElement(By.xpath("(//input[@ type = 'checkbox'])[2]"));
		

	}

}
