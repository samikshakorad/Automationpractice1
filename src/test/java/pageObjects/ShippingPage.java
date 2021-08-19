package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage {
	
WebDriver driver;
	
	public ShippingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='cgv']")
	WebElement chkTermsCondition;
	public void clickTermsCondition()
	{
		chkTermsCondition.click();
	}
	
	@FindBy(xpath="//button[@name='processCarrier']")
	WebElement btnShippingCheckout;
	public void clickShippingCheckout()
	{
		btnShippingCheckout.click();
	}
	
	
	

}
