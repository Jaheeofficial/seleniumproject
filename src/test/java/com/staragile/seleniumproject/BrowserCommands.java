package com.staragile.seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "/Users/jaheera/Documents/Drivers/chromedriver-mac-x64//chromedriver.exe");
		//Invoke the chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		//get title
		String title = driver.getTitle();
		System.out.println(title);
		//current url
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		//get page source
		String PageSource = driver.getPageSource();
		System.out.println(PageSource);
		//driver.close();
		driver.close();
		//driver.quit
		//driver.quit();
		

	}




	}


