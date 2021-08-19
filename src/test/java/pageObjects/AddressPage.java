package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {
	
WebDriver driver;
	
	public AddressPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//button[@type='submit' and @name='processAddress']")
	WebElement btnProcessAddress;
	public void clickProcessAddCheckout()
	{
		btnProcessAddress.click();
	}
	
	@FindBy(xpath="//textarea[@name='message']")
	WebElement txtMsg;
	public void sendMessage(String msg)
	{
		txtMsg.sendKeys(msg);
	}
	
	@FindBy(xpath="//ul[@class='address item box']//a[@title='Update']")
	WebElement btnUpdateDeliveryAddress;
	public void updateDeliveryAddress()
	{
		btnUpdateDeliveryAddress.click();
	}
	
	@FindBy(xpath="//ul[@class='address alternate_item box']//a[@title='Update']")
	WebElement btnUpdateBillingAddress;
	public void updateBillingAddress()
	{
		btnUpdateBillingAddress.click();
	}
	@FindBy(xpath="//p[@class='address_add submit']/a[@title='Add']")
	WebElement btnAddNewAddress;
	public void addNewAddress()
	{
		btnAddNewAddress.click();
	}
	
	
}
