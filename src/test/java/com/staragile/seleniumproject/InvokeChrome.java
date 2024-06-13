package com.staragile.seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeChrome {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "/Users/jaheera/Documents/Drivers/chromedriver-mac-x64//chromedriver.exe");
		//Invoke the chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.google.com/document/d/1skNaZKx6-onGmBqKaSuPWpM7cH2jizM3_SnpJ6vHUPo/edit");
		

	}

}
