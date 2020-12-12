package com.saucedemo.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addToCartPage {
	
	public static String addItemToCart(WebDriver driver, String ProductName) {
		// TODO Auto-generated method stub
		WebElement selectedItem = driver.findElement(By.xpath("//div[text()='"+ProductName+"']"));
		String itemName = selectedItem.getText();
		System.out.println(itemName);
		selectedItem.click();
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		return itemName;
		
	}

	
	

}
