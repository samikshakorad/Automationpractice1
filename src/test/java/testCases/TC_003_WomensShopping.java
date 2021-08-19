package testCases;

import java.time.Duration;

import org.testng.annotations.Test;

import pageObjects.AddressPage;
import pageObjects.CasualDresses;
import pageObjects.CheckOrderSummary;
import pageObjects.ChoosePaymentMethod;
import pageObjects.CreateAccountPage;
import pageObjects.HomePage;
import pageObjects.MyShoppingCart;
import pageObjects.ShippingPage;
import testBase.BaseClass;

public class TC_003_WomensShopping extends BaseClass{
	
	@Test
	public void test_WomensTshirtShopping()
	{
		driver.get(rb.getString("appURL"));
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		HomePage hp= new HomePage(driver);
		//hp.click_Womens_TShirt();
		hp.click_Womens_CasualDresses();
		
		CasualDresses cd=new CasualDresses(driver);
		cd.CasualDressShop();
		cd.proceedCheckOut();
		
		MyShoppingCart msc=new MyShoppingCart(driver);
		msc.clickCheckOut();
		
		CreateAccountPage cap=new CreateAccountPage(driver);
		cap.setEmail(rb.getString("login_email"));
		cap.setPassword(rb.getString("login_password"));
		cap.btnSignin();
		
		AddressPage ap=new AddressPage(driver);
		//ap.addNewAddress();
		ap.sendMessage("Please leave in house door");
		ap.clickProcessAddCheckout();
		
		ShippingPage sp=new ShippingPage(driver);
		sp.clickTermsCondition();
		sp.clickShippingCheckout();
		
		ChoosePaymentMethod cpm=new ChoosePaymentMethod(driver);
		cpm.payByBankWire();
		
		CheckOrderSummary cos=new CheckOrderSummary(driver);
		cos.confirmMyOrder();
		
	}

}
