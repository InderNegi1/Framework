package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;

public class TestLogin {
	
	WebDriver driver;
	HomePage objHome;
	LoginPage objLogin;
	String URL="";
	
    @BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\WebDriver\\WebDriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL);
	}
    
    /**This test case will login in http://demo.com/V4/
     * Verify login page title as 99 bank
     * Login to application
     * Verify the home page using Dashboard message  */
    
    @Test()
    public void Test_Login_Page_Appear_Correctly()
    {
    	//Create Login Page Object
    	objLogin = new LoginPage(driver);
    	
    	//Varify Login Page Title
    	String LoginPageTitle=objLogin.getLoginPageTitle();
    	Assert.assertTrue(LoginPageTitle.toLowerCase().contains("Bank"));
    	
        //login to application
        objLogin.LoginToApp("mgr123", "mgr!23");
        
        // go the next page
        objHome =new HomePage(driver);

        //Verify home page
        Assert.assertTrue(objHome.getHomePageUserName().toLowerCase().contains("manger id : mgr123"));

    	
    }


}
