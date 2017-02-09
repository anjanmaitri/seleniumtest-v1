package com.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestSignInToGmail {

	public static void main(String[] args) throws InterruptedException {
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		driver.get("https://mail.google.com");
		driver.manage().window().maximize();
		System.out.println("Title:" + driver.getTitle());

		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("your.gmailid@gmail.com");
		driver.findElement(By.xpath("//input[@id='next']")).click();
		
		System.out.println("Stay Signed In : " + driver.findElement(By.xpath("//input[@id='PersistentCookie']")).isSelected());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("your password");
		driver.findElement(By.xpath("//input[@id='signIn']")).click();
		
		Thread.sleep(5000);	
		//driver.findElement(By.xpath("id('gb')/x:div[1]/x:div[1]/x:div[2]/x:div[4]/x:div[1]/x:a/x:span")).click();
		
		driver.get("https://accounts.google.com/SignOutOptions?hl=en&continue=https://mail.google.com/mail&service=mail");
		driver.findElement(By.xpath("//button[@id='signout']")).click();
		
		//driver.findElement(By.xpath("id('gb_71')")).click();
		
		Thread.sleep(2000);	
		driver.quit();


	}

}
