package testCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pageObjects.CreateAccountPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_002_LoginPage extends BaseClass {
	
	
	@Test
	public void test_Login_Page()
	{
		driver.get(rb.getString("appURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		HomePage hp= new HomePage(driver);
		hp.clickSingIn();
		
		CreateAccountPage cap=new CreateAccountPage(driver);
		cap.setEmail(rb.getString("login_email"));
		cap.setPassword(rb.getString("login_password"));
		cap.btnSignin();
		
		String confmsg=cap.getConfirmationMsg();
		if(confmsg.equals("Welcome to your account. Here you can manage all of your personal information and orders."))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
				
	}
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

}
