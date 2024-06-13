package com.staragile.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "/Users/jaheera/Documents/Drivers/chromedriver-mac-x64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement username  = driver.findElement(By.id("email"));
		username.sendKeys("zaheera.jahee@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Jaheera");
		//WebElement login = driver.findElement(By.name("login"));
		//login.click();
		//WebElement forgetpassword = driver.findElement(By.linkText("Forgotten password?"));
		//forgetpassword.click();
		//WebElement button1 = driver.findElement(By.xpath("//button[@id='u_0_5_m2']"));
		WebElement button1 = driver.findElement(By.name("login"));
		button1.click();
		Thread.sleep(2000);
//		driver.close();
	}
}


