package com.saucedemo.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class verifyItemPage {
	public static boolean verifyItemInCart(WebDriver driver, String itemName, String ProductName)
	{
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
		boolean V = false;
		if(itemName.equals(ProductName))
		{
			System.out.println("Selected Product is added to cart");
			V=true;
			driver.findElement(By.xpath("//a[text()='CHECKOUT']")).click();
		}
		else
		{
			System.out.println("Selected Product is not added to cart");
		}
		return V;
	}
	

}
