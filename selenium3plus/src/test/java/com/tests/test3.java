package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class test3 
{
	@Test
	
	public void testhdfcLogin()
	{
	System.setProperty("webdriver.chrome.driver", "C://Users//a07208trng_b4b.04.24//Downloads//chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://hdfcbank.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	Actions act1= new Actions(driver);
	act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products']"))).perform();
	act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat']"))).perform();
	act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat-account']"))).click().perform();

}
	
}