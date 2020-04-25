package com.qa.SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AppTest 
{
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		System.out.println("hello");
		
	DesiredCapabilities capability = new DesiredCapabilities();
	
	capability.setBrowserName("chrome");
	capability.setPlatform(Platform.WIN10);
	capability.setVersion("81.0.4044.122");
	
//	ChromeOptions cop=new ChromeOptions();
//	cop.merge(capability);
	
	WebDriver driver = new RemoteWebDriver(new URL("http://192.168.137.1:4444/wd/hub"), capability);
	
	driver.get("https://www.google.co.in/");
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	driver.quit();
	}
}
