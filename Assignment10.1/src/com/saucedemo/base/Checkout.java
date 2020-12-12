package com.saucedemo.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout {

	public static boolean checkoutPage(WebDriver driver,String itemName )
	{
		String itemInCheckoutPage = driver.findElement(By.xpath("//div[@class=\"inventory_item_name\"]")).getText();
		boolean cov=false;
		if(itemInCheckoutPage.equals(itemName))
		{
			System.out.println("Product is displayed");
			cov=true;
			driver.findElement(By.xpath("//a[text()='FINISH']")).click();
		}
		else
		{
			System.out.println("item is not in checkout page");
		}
		return cov;
			
	}

	
}
