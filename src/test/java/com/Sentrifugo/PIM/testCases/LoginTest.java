package com.Sentrifugo.PIM.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Sentrifugo.PIM.pageObject.LoginPage;

public class LoginTest extends BaseClass
{
	public LoginTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void loginTest()
	{
		LoginPage LP=new LoginPage(driver);
		LP.setUsername(username);
		LP.setPassword(password);
		LP.clickLogin();
		
		if(driver.getTitle().equals("OrangeHRM"))
		{
		System.out.println("Login test is Pass");	
		}
		else
		{
			System.out.println("Login test is Fail");
		}
	}

}
