package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LaunchEmailCampaign  {

//public class LaunchEmailCampaign extends AutoResponseEmailCampaign {
	
	//@AfterMethod  
	//[for auto responses...comment @AfterTest annotation and use @Aftermethod , extends AutoResponsesEmail]

	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\Campaign.properties");
	
	@Test
			
	
	public void elaunch() throws InterruptedException, SQLException

	{
		Thread.sleep(4000);
		EmailCampaign e1=new EmailCampaign();
	 	e1.ecampaign();
	 	Thread.sleep(5000);
	 	 
		  //AutoResponseEmailCampaign ar_e=new AutoResponseEmailCampaign();
		  //ar_e.autoResponsesEmail();
		  
		 Thread.sleep(3000);
	 	
	 	
	driver.findElement(By.xpath(properties.getProperty("now_emailcampaign"))).click();			//click NOW
	Thread.sleep(5000);
	
	driver.findElement(By.xpath(properties.getProperty("now_emaillaunch"))).click();				//click LAUNCH
	
	Thread.sleep(8000);
	
	
	String e_launch = driver.findElement(By.xpath(properties.getProperty("e_response_msg"))).getText(); // response
	// message

	Thread.sleep(5000);

	


String expectedtitle = "Campaign launched successfully";

if (expectedtitle.equals(e_launch)) {
	Thread.sleep(2000);

	System.out.println(" Email Campaign launched successfully");
} else {
	Thread.sleep(2000);

	System.out.println(" Email Campaign launch failed");
}

	
	
	
	
	
	
	
	
	
	
	
	
}
}
