package testCases;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pageObjects.CreateAccountPage;
import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_001_CreateAccountPage extends BaseClass {	
		
	@Test
	public void test_Create_Account() throws InterruptedException
	{
		driver.get(rb.getString("appURL"));
		driver.manage().window().maximize();
		
		HomePage hp=new HomePage(driver);
		hp.clickSingIn();
		
		CreateAccountPage cap= new CreateAccountPage(driver);
		Thread.sleep(10);
		cap.setCreateEmailId(randomstring()+"@gmail.com");
		
		Thread.sleep(10);
		cap.clickCreateAccount();
		
		MyAccountPage map=new MyAccountPage(driver);
		map.setMale();
		map.setCust_Firstname("Swapnil");
		map.setCust_Lastname("Sharma");
		map.setCust_Password("test1234");
		map.setDays();
		map.setMonths();
		map.setYear();
		map.setnewsletter();
		map.setFirstName("Swapnil");
		map.setLastName("Sharma");
		map.setCompany_nm("Xyz");
		map.setAddress("5 Foxleigh court");
		map.setAddress2("New Road");
		map.setCity("Staine");		
		map.setState();
		map.setPostcode("12345");
		map.setOtherInfo("Leaving next to Debhenhams");
		map.setHomePhone("909090876");
		map.setMobileNo(randomNumer());
		
		map.setReference("R209876");
		map.clickRegister();		
		
		String confmsg=map.getConfirmationMsg();
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
