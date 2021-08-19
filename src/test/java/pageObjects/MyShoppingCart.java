package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyShoppingCart {
       WebDriver driver;
	
	public MyShoppingCart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//i[@class='icon-minus']")
	WebElement minusQty;
	public void minusQuantity()
	{
		minusQty.click();
	}
	
	@FindBy(xpath="//i[@class='icon-plus']")
	WebElement plusQty; 
	public void plusQuantity()
	{
		plusQty.click();
	}
	
	@FindBy(xpath="//i[@class='icon-trash']")
	WebElement toTrash;
	public void moveToTrash()
	{
		toTrash.click();		
	}	
	
	@FindBy(xpath="//p//a[@title='Proceed to checkout']//span[contains(text(),'Proceed to checkout')]")
	WebElement proceedToCheckout;
	public void clickCheckOut()
	{
		proceedToCheckout.click();
	}
	
}
