package com.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirstTestwithTextbox {

	public static void main(String[] args) throws InterruptedException {
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		driver.get("https://mail.google.com");
		driver.manage().window().maximize();
		System.out.println("Title:" + driver.getTitle());
		

		Thread.sleep(5000);
		driver.quit();

	}

}
