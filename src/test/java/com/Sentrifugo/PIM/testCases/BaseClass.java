package com.Sentrifugo.PIM.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.Sentrifugo.PIM.utilites.ReadConfig;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class BaseClass

{
	public BaseClass() throws IOException{
		super();
	}

	
	ReadConfig readconfig=new ReadConfig();
	
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	
	@BeforeClass
	
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseURL);
	}
	
	@AfterClass
	public void tearDown()
	{
		//driver.close();
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	/*WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver",".\\DriverFiles\\chromedriver.exe"  );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	@AfterClass
	public void tearDown()
	{
		driver.close();
		driver.quit();
		
	}*/

}
