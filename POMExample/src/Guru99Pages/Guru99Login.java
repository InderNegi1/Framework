package Guru99Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99Login {
	
	WebDriver driver;
	
	By UserName= By.name("uid");
	By Password=By.name("password");
	
	By Title=By.className("barone");
	By BtnLogin=By.name("btnLogin");
	
	public Guru99Login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Set User Name in the text box
	public void setUserName(String strUsrName)
	{
		driver.findElement(UserName).sendKeys(strUsrName);
	}
	
	//Set Password in the text box
	public void setPassword(String strPassword)
	{
		driver.findElement(Password).sendKeys(strPassword);
	}
	
	//Click login button
	public void clickLogin()
	{
		driver.findElement(BtnLogin).click();
	}
	
	//Get the Title of the login page
	public String getLoginPageTitle()
	{
		return driver.findElement(Title).getText();
	}
	
    /** This POM method will be exposed in test case to login in the application

     * @param strUserName

     * @param strPasword

     * @return  */

	public void LoginToGuru99(String UsrName,String Password)
	{
		//Fill User Name
		this.setUserName(UsrName);
		
		//Fill Password
		this.setPassword(Password);
		
		//Click Login Button
		this.clickLogin();
	}
	

}
