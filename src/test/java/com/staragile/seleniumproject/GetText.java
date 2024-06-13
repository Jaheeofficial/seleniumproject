package com.staragile.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver",
				"/Users/jaheera/Documents/Drivers/chromedriver-mac-x64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		// get text
		WebElement Checkboxes = driver.findElement(By.xpath("//h3[contains(text(),'Checkboxes')]"));
		System.out.println(Checkboxes.getText());
		// get attribute
		WebElement Checkbox1 = driver.findElement(By.xpath("(//input[@ type = 'checkbox'])[1]"));
		System.out.println(Checkbox1.getAttribute("type"));
		// get css value
		WebElement Checkbox2 = driver.findElement(By.xpath("(//input[@ type = 'checkbox'])[2]"));
		System.out.println(Checkbox2.getCssValue("color"));
		// is displayed
		WebElement Checkboxes1 = driver.findElement(By.xpath("//h3[contains(text(),'Checkboxes')]"));
		if (Checkboxes1.isDisplayed()) {
			System.out.println(Checkboxes1.getText());

		}
		// is enabled
		WebElement Checkboxes2 = driver.findElement(By.xpath("//h3[contains(text(),'Checkboxes')]"));
		if (Checkboxes2.isEnabled()) {
			System.out.println(Checkboxes2.getText());

		}
		// is selected
		WebElement Checkbox3 = driver.findElement(By.xpath("(//input[@ type = 'checkbox'])[2]"));
		if (Checkbox3.isSelected()) {
			Checkbox3.click();
		//get location
		WebElement Checkbox4 = driver.findElement(By.xpath("(//input[@ type = 'checkbox'])[2]"));
		System.out.println(Checkbox4.getLocation());
		//get size
		WebElement Checkbox5 = driver.findElement(By.xpath("(//input[@ type = 'checkbox'])[2]"));
		System.out.println(Checkbox5.getSize());
		driver.quit();
		

		

		}

	}

}
