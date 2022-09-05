package com.inetBankingV_2.testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass
{
	public String baseURL="https://demo.guru99.com/v4/";
	public String username="mngr436295";
	public String password="EtAhUqu";
	public static WebDriver driver;

	
	@BeforeMethod
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
        driver=new ChromeDriver();
    
	}
	
	@AfterMethod
	public void tearDown()
	{
		
		
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
