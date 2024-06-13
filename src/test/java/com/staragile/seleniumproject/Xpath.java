package com.staragile.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver",
				"/Users/jaheera/Documents/Drivers/chromedriver-mac-x64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		//WebElement practiceAlert = driver.findElement(By.xpath("//div[@class='card-header']"));
		WebElement Alert = driver.findElement(By.xpath("//input[@onclick='alertbox();']"));
		Alert.click();
		Thread.sleep(3000);
		WebElement ConfirmationBox = driver.findElement(By.xpath("//input[@value= 'Confirmation Box']"));
		ConfirmationBox.click();
		Thread.sleep(3000);
	}

}
