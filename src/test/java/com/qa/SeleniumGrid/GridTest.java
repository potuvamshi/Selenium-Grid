package com.qa.SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTest {
	@Test
	public void main() throws MalformedURLException, InterruptedException {
		System.out.println("hello");
		
		DesiredCapabilities capability = new DesiredCapabilities();
		
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.WINDOWS);
		
		ChromeOptions cop=new ChromeOptions();
		cop.merge(capability);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.137.1:4444/wd/hub"), cop);
		
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
	}

}
