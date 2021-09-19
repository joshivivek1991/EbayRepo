package com.ebay.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ebay.qa.util.Testutil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		prop= new Properties();
		try {
			FileInputStream ip = new FileInputStream("E:\\Shammi Sir Class\\JavaWorkspace\\EbayTest\\src\\main\\java\\com\\ebay\\qa\\config\\config.properties");
		
			prop.load(ip);
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
	public static void initialization()
	{
		String browsername=prop.getProperty("browser");
		if (browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Shammi Sir Class\\Software\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}else
		{
			System.out.println("Wrong Data");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Testutil.Page_load_Time, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Testutil.Implicit_wait, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
	
	
	
	}


