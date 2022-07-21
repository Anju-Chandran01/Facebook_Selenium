package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FbSignUpLogin {

	@Test
	public void fbSignup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Anju");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Chandran");
		Thread.sleep(2000);
		
		driver.findElement(By.name("reg_email__")).sendKeys("anjuchandran153@gmail.com");
		Thread.sleep(2000);
//		driver.findElement(By.name("reg_email_confirmation_")).sendKeys("anjuchandran153@gmail.com");
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"u_3_j_Ps\"]")).sendKeys("anjuchandran153@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("Anju123@123");
		Thread.sleep(2000);
		
		Select day =new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("23");
		Thread.sleep(2000);
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("01");
		Thread.sleep(2000);
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1998");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"u_4_2_v9\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\\\"u_4_s_od\\\"]")).click();
		driver.close();
	}
	
	@Test
	public void fbLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("anjuchandrancs01@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Anju123@123");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		driver.close();
	}
}











