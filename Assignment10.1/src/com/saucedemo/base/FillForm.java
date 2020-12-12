package com.saucedemo.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FillForm {
	public static void fillDetails(WebDriver driver, String firstName, String lastName, String postalCode)
	{
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys(firstName);
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastName);
		
		driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']")).sendKeys(postalCode);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	
}
