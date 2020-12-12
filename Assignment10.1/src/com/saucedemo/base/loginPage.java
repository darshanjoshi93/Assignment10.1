package com.saucedemo.base;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	public static void login(WebDriver driver, String UserName, String Password) throws InterruptedException
	{
		WebElement usernameTF = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		usernameTF.sendKeys(UserName);
		Thread.sleep(1000);
		WebElement passwordTF = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		passwordTF.sendKeys(Password);
		Thread.sleep(1000);
		WebElement Loginbtn = driver.findElement(By.xpath("//input[@id='login-button']"));
		Loginbtn.click();
		Thread.sleep(1000);
	}
	
	
}
