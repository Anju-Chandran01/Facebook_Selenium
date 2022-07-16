package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FbSignUpLogin {

	@Test
	public void fbSignup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Anju");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Chandran");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("anjuchandran153@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email_confirmation_")).sendKeys("anjuchandran153@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("Anju123@123");
		Thread.sleep(2000);
		driver.findElement(By.id("day")).sendKeys("23");
		Thread.sleep(2000);
		driver.findElement(By.id("month")).sendKeys("01");
		Thread.sleep(2000);
		driver.findElement(By.id("year")).sendKeys("1998");
		Thread.sleep(2000);
		driver.findElement(By.name("sex")).sendKeys("Female");
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();
		driver.close();
	}
	
	@Test
	public void fbLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("anjuchandrancs01@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Anju123@123");
		driver.findElement(By.name("login")).click();
	}
}











