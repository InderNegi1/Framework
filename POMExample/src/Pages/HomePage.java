package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	By HomePageUserName= By.xpath("//table//tr[@class='heading3']");
	
	//This is new commit from inder
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		 
	}
	
	//Get the username from home page
	public String getHomePageUserName()
	{
		return driver.findElement(HomePageUserName).getText();
	}
	
}
