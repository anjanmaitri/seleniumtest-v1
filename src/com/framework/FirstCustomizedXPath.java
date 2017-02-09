package com.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirstCustomizedXPath {
	public static void main(String[] args) throws InterruptedException {
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		driver.get("http://techno-geek.co.uk/callmycab/");
		driver.manage().window().maximize();
		System.out.println("Title:" + driver.getTitle());
		driver.findElement(By.xpath(".//*[@id='navbar']/ul/li[1]/a/nav/span[2]")).click();
		// CUstomized XPath
		driver.findElement(By.xpath("//input[@id='signin-email']")).sendKeys("eCMS User");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("eCMS User");

		Thread.sleep(5000);
		driver.quit();

	}

}
