package com.saucedemo.base;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Final {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	static String itemName=null;
	static String ProductName="Sauce Labs Fleece Jacket";
	static String UserName="standard_user";
	static String Password="secret_sauce";
	static String firstName="Megha";
	static String lastName="J";
	static String postalCode = "571401";
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		loginPage.login(driver, UserName, Password);
		Thread.sleep(2000);
	
		itemName=addToCartPage.addItemToCart(driver, ProductName);
		Thread.sleep(2000);//for wait
		
		boolean value=verifyItemPage.verifyItemInCart(driver, itemName, ProductName);
		if(value==true)
		{
			FillForm.fillDetails(driver, firstName, lastName, postalCode);
		}
		else 
		{
			System.out.println("Item not verified");
		}
		
		boolean covalue=Checkout.checkoutPage(driver, itemName);
		if(covalue==true)
		{
			ConfirmPage.confirmationPage(driver);
		}
		
		else
		{
			System.out.println("Order is not confirmed");
		}
		Thread.sleep(2000);
		driver.close();
	}

}
