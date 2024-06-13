package com.staragile.seleniumproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver",
				"/Users/jaheera/Documents/Drivers/chromedriver-mac-x64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		Thread.sleep(4000);
		//get parent window handle
		WebElement click = driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
		click.click();
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		Iterator<String> iterator = windowhandles.iterator();
		while(iterator.hasNext()) {
			String childwindow = iterator.next();
			String parentwindow = driver.getWindowHandle();
			if (!parentwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				String text = driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText();
				System.out.println(text);
				driver.close();
				
				
			}
		}
		

	}

}
