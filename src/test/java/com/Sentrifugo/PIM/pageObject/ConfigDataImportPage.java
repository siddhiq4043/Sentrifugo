package com.Sentrifugo.PIM.pageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfigDataImportPage
{
	WebDriver driver;
	
	@FindBy(id="menu_admin_pimCsvImport")
	WebElement DataImport;
	
	@FindBy(id="pimCsvImport_csvFile")
	WebElement ChooseFile;
	
	@FindBy(id="btnSave")
	WebElement Upload;
	
	public void dataImport()
	{
		DataImport.click();
	}
	
	public void chooseFile() throws AWTException
	{
		ChooseFile.click();
		Robot rt=new Robot();
		StringSelection ss=new StringSelection("‪‪C:\\Users\\SIDDHU\\Downloads\\WP_20150519_011 (2).jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rt.delay(2000);
		rt.keyPress(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_V);
		rt.keyRelease(KeyEvent.VK_V);
		rt.keyRelease(KeyEvent.VK_CONTROL);	
	}
	
	public void upload()
	{
		Upload.click();
	}
	
	public ConfigDataImportPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
