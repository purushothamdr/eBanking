package com.inetBankingV_2.testcases;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetBankingV_2.pageobjects.LoginPage;

public class TC_LoginTest_001 extends Baseclass 
{
    @Test
	public void loginTest()
	{
	driver.get(baseURL);
	
	
	LoginPage lp=new LoginPage(driver);
	

	lp.setUserName(username);
	
	
	lp.setPassword(password);
	
	
	lp.clicksubmit();

	
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
    {
	Assert.assertTrue(true);
	
    }
	else
	{
		Assert.assertTrue(false);
		
	}
	
	
	}
	
	
	
}

	
	
	
	
	
	
	
	
