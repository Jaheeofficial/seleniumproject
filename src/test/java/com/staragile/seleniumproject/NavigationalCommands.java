package com.staragile.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver",
				"/Users/jaheera/Documents/Drivers/chromedriver-mac-x64//chromedriver.exe");
		// Invoke the chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Launching of browser- url passing as parameter
		driver.navigate().to("https://www.selenium.dev/");
		//back()
		//driver.navigate().back();
		//Thread.sleep(2000);
		//forward()
		//driver.navigate().forward();
		//Thread.sleep(2000);
		//driver.navigate().refresh();
		WebElement register = driver.findElement(By.xpath("//a[contains(text(),'Register now!')]")) ;
		register.click();

	}	

}
