package com.Sentrifugo.PIM.testCases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.Sentrifugo.PIM.pageObject.ConfigDataImportPage;
import com.Sentrifugo.PIM.pageObject.ConfigOptFieldsPage;
import com.Sentrifugo.PIM.pageObject.LoginPage;

public class ConfigDataImportTest extends BaseClass
{
	public ConfigDataImportTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	
	public void configDataImportTest() throws InterruptedException, AWTException
	{
		LoginPage LP=new LoginPage(driver);
		LP.setUsername(username);
		LP.setPassword(password);
		LP.clickLogin();
		
		ConfigOptFieldsPage COF=new ConfigOptFieldsPage(driver);
		COF.pim();
		COF.configuration();
		
		ConfigDataImportPage CDI=new ConfigDataImportPage(driver);
		CDI.dataImport();
		CDI.chooseFile();
		CDI.upload();
		
	}

}
