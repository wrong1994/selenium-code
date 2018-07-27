package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test2 {
	@Test
	
	public void testMercuryToursLogin()
	
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//a07208trng_b4b.04.24//Downloads//chromedriver_win32//chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://newtours.demoaut.com/");
				driver.manage().window().maximize();
				driver.findElement(By.name("username")).sendKeys("mercury");
				driver.findElement(By.name("password")).sendKeys("mercury");
				driver.findElement(By.name("login")).click();  
	}
	

}
