package com.staragile.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParameters {
	@Test
	@Parameters("browser")
	public void invokechrome(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("Webdriver.chrome.driver", "/Users/jaheera/Documents/Drivers/chromedriver-mac-x64//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		WebElement register = driver.findElement(By.xpath("//a[contains(text(),'Register now!')]")) ;
		register.click();
		}
	}
	

}
		
		
	


