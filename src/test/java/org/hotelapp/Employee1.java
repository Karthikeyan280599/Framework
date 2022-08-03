package org.hotelapp;

import org.adactin.Baseclass1;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Employee1 extends Baseclass1{
	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	@AfterClass
	public static void afterClass() {
		driver.quit();
	}
	@Before
	public void beforeMethod() {
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);
    }
	@Test
	public void test() {

		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("KarthiKathiresan1999");
		
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("karthik9876");
		
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		
	}
	
	@After
	public void afterMethod() {
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);
    }

	
	


}
