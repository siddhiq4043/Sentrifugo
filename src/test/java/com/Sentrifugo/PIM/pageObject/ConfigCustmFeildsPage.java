package com.Sentrifugo.PIM.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ConfigCustmFeildsPage
{
	WebDriver driver;
	
	@FindBy(id="customField_name")
	WebElement FieldName;
	
	@FindBy(id="customField_screen")
	WebElement ScreenDropDown;
	
	@FindBy(id="menu_pim_listCustomFields")
	WebElement CustomFields;
	
	@FindBy(id="customField_type")
	WebElement TypeDropDown;
	
	@FindBy(id="btnSave")
	WebElement SaveBtn;

	public ConfigCustmFeildsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void customFields()
	{
		CustomFields.click();
	}
	
	public void fieldName()
	{
		FieldName.sendKeys("abc");
	}
	
	public void screenDropDown()
	{
		Select sel=new Select(ScreenDropDown);
		sel.selectByValue("personal");
	}
	
	public void typeDropDown()
	{
		Select sel=new Select(TypeDropDown);
		sel.selectByValue("0");
	}
	
	public void saveButton()
	{
		SaveBtn.click();
	} 
}
