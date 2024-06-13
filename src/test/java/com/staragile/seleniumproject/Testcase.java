package com.staragile.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver",
				"/Users/jaheera/Documents/Drivers/chromedriver-mac-x64//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		// login with incorrect password and correct email address
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("zaheera.jahee@gmail.com");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("Password@24");
		WebElement login = driver.findElement(By.xpath("//button[@value='1']"));
		login.click();
		if ("password is incorrect" != null) {
			System.out.println("Registratin test is not passed");
		}
		// login with correct password and incorrect email address
		WebElement email1 = driver.findElement(By.xpath("//input[@id='email']"));
		email1.sendKeys("zaheera.jaheera@gmail.com");
		Thread.sleep(2000);
		WebElement password1 = driver.findElement(By.xpath("//input[@id='pass']"));
		password1.sendKeys("Password@25");
		WebElement login1 = driver.findElement(By.xpath("//button[@value='1']"));
		login1.click();
		if ("email is incorrect" != null) {
			System.out.println("Registratin test is not passed");
		}
		// login with correct password and correct email address
		WebElement email2 = driver.findElement(By.xpath("//input[@id='email']"));
		email2.sendKeys("zaheera.zaheera@gmail.com");
		Thread.sleep(2000);
		WebElement password2 = driver.findElement(By.xpath("//input[@id='pass']"));
		password2.sendKeys("Password@25");
		WebElement login2 = driver.findElement(By.xpath("//button[@value='1']"));
		login2.click();
		System.out.println("Registratin test is passed");
	}
}
