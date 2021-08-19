package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CasualDresses {
	
	WebDriver driver;
	
	public CasualDresses(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//img[@title='Printed Dress']")
	WebElement printedDress;
	
	@FindBy(xpath="//span[normalize-space()='Add to cart']")
	WebElement addToCart;
	public void CasualDressShop()
	{
		Actions act=new Actions(driver);
		act.moveToElement(printedDress).moveToElement(addToCart).click().perform();
	}
	
	@FindBy(xpath="//span[normalize-space()='Proceed to checkout']")
	WebElement checkOut;
	public void proceedCheckOut()
	{
		checkOut.click();
	}
	
	
	
	

}
