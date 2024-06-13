package com.staragile.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver",
				"/Users/jaheera/Documents/Drivers/chromedriver-mac-x64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
		Select dd = new Select(dropdown);
		dd.selectByIndex(1);
		Thread.sleep(2000);
		dd.selectByVisibleText("Option 2");
		Thread.sleep(2000);
		dd.selectByValue("1");
		dd.deselectByVisibleText("Option 1");

	}

}
