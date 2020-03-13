package com.Sentrifugo.PIM.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfigOptFieldsPage
{
	WebDriver driver;
	
	@FindBy(id="menu_pim_viewPimModule")
	WebElement PIM;
	
	@FindBy(id="menu_pim_Configuration")
	WebElement Configuration;
	
	@FindBy(linkText="Optional Fields")
	WebElement OptionalFields;
	
	@FindBy(id="btnSave")
	WebElement EditButton;
	
	@FindBy(id="configPim_chkDeprecateFields")
	WebElement Checkbox1;
	
	@FindBy(id="configPim_chkShowSSN")
	WebElement Checkbox2;
	
	@FindBy(id="configPim_chkShowSIN")
	WebElement Checkbox3;
	
	@FindBy(id="configPim_chkShowTax")
	WebElement Checkbox4;
	
	@FindBy(id="btnSave")
	WebElement Savebtn;
	
	//Action act=new Action(driver);
	
	
	
	public ConfigOptFieldsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void pim() throws InterruptedException
	{
		
		// Actions act=new Actions(driver);
		 PIM.click();
	    // act.moveToElement(driver.findElement(By.linkText("PIM"))).build().perform();
	    
	}
	public void configuration() throws InterruptedException
	{	
		Configuration.click();	
	}
	
	public void optionalFields()
	{
		OptionalFields.click();
	}
	
	public void editButton()
	{
		EditButton.click();
	}
	
	public void checkbox1()
	{
		Checkbox1.click();
	}
	
	public void checkbox2()
	{
		Checkbox2.click();
	}
	
	public void checkbox3()
	{
		Checkbox3.click();
	}
	
	public void checkbox4()
	{
		Checkbox4.click();
	}
	
	public void clickOnSave()
	{
		Savebtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
