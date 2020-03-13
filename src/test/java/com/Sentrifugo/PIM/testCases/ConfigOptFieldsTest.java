package com.Sentrifugo.PIM.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Sentrifugo.PIM.pageObject.ConfigOptFieldsPage;
import com.Sentrifugo.PIM.pageObject.LoginPage;

public class ConfigOptFieldsTest extends BaseClass
{

	public ConfigOptFieldsTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void configOptFieldsTest() throws InterruptedException
	
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickLogin();
		ConfigOptFieldsPage CFT=new ConfigOptFieldsPage(driver);
		
		CFT.pim();
		CFT.configuration();
		CFT.optionalFields();
		CFT.editButton();
		CFT.checkbox1();
		CFT.checkbox2();
		CFT.checkbox3();
		CFT.checkbox4();
		CFT.clickOnSave();
		String str=driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div")).getText();
		System.out.println(str);
		if(driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div")).getText().equals(str))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
