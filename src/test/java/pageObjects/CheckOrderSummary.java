package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOrderSummary {
	
WebDriver driver;
	
	public CheckOrderSummary(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//p//button[@type='submit']")
	WebElement btnConfirmOrder;
	public void confirmMyOrder()
	{
		btnConfirmOrder.click();
	}
	

}
