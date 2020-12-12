package com.saucedemo.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmPage {
	public static void confirmationPage(WebDriver driver)
	{
		WebElement confirmationPage = driver.findElement(By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']"));
		String confirmationText = confirmationPage.getText();
		
		if(confirmationText.equals("THANK YOU FOR YOUR ORDER"))
		{
			System.out.println("Order is confirmed");
		}
	}

	


}
