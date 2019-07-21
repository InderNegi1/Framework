package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Guru99Pages.Guru99Home;
import Guru99Pages.Guru99Login;

public class Test99GuruLogin {
	
	WebDriver driver;
	Guru99Home objHome;
	Guru99Login objLogin;
	String URL="http://demo.guru99.com/V4/";
	
    @BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\WebDriver\\WebDriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL);
	}
    
    /**This test case will login in http://demo.guru99.com/V4/
     * Verify login page title as guru99 bank
     * Login to application
     * Verify the home page using Dashboard message  */
    
    @Test()
    public void Test_Login_Page_Appear_Correctly()
    {
    	//Create Login Page Object
    	objLogin = new Guru99Login(driver);
    	
    	//Varify Login Page Title
    	String LoginPageTitle=objLogin.getLoginPageTitle();
    	Assert.assertTrue(LoginPageTitle.toLowerCase().contains("Guru99 Bank"));
    	
        //login to application
        objLogin.LoginToGuru99("mgr123", "mgr!23");
        
        // go the next page
        objHome =new Guru99Home(driver);

        //Verify home page
        Assert.assertTrue(objHome.getHomePageUserName().toLowerCase().contains("manger id : mgr123"));

    	
    }


}
