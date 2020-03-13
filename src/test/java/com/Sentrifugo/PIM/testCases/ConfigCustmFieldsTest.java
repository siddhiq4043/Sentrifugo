package com.Sentrifugo.PIM.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Sentrifugo.PIM.pageObject.ConfigCustmFeildsPage;
import com.Sentrifugo.PIM.pageObject.ConfigOptFieldsPage;
import com.Sentrifugo.PIM.pageObject.LoginPage;

public class ConfigCustmFieldsTest extends BaseClass 
{

	public ConfigCustmFieldsTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	
	public void loginPage() throws InterruptedException
	{
		LoginPage LP=new LoginPage(driver);
		LP.setUsername(username);
		LP.setPassword(password);
		LP.clickLogin();
		
		ConfigOptFieldsPage COF=new ConfigOptFieldsPage(driver);
		COF.pim();
		COF.configuration();
		
		
		ConfigCustmFeildsPage CCF=new ConfigCustmFeildsPage(driver);
		CCF.customFields();
		CCF.fieldName();
		CCF.screenDropDown();
		CCF.typeDropDown();
		CCF.saveButton();
		
		
	}
	

}
