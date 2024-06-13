package com.staragile.seleniumproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver",
				"/Users/jaheera/Documents/Drivers/chromedriver-mac-x64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/tables");
		Thread.sleep(4000);
		// To find no.of rows
		List<WebElement> rowno = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		int rowsize = rowno.size();
		System.out.println(rowsize);
		// To find no.of columns
		List<WebElement> colno = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td"));
		int colsize = colno.size();
		System.out.println(colsize);
		WebElement CellData = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]/td[2]"));
		String Celltext = CellData.getText();
		System.out.println(Celltext);
		String ExpectedText = "John";
		if (Celltext.equals(ExpectedText)) {
			System.out.println("The cell data matches ");
		} else {
			System.out.println("The cell data does not matches");

		}
	}

}
