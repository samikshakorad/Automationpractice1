package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChoosePaymentMethod {
	
WebDriver driver;
	
	public ChoosePaymentMethod(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='bankwire']")
	WebElement clickPayBankWire;
	public void payByBankWire()
	{
		clickPayBankWire.click();
	}
	
	@FindBy(xpath="//a[@class='cheque']")
	WebElement clickPayByCheque;
	public void payByCheque()
	{
		clickPayByCheque.click();
	}
	

}
