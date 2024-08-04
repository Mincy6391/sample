package org.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bank {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avila Theresa\\Desktop\\Java Selenium Course\\selenium\\Java\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();   
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	findElement=driver.findElements(By.tagname("frame"));
	
	
	
	
	
	
}


	
}

