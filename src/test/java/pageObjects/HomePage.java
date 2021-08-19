package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[normalize-space()='Sign in']")
	WebElement linkSingin;
	
	@FindBy(xpath=" //a[@title='Contact Us']")
	WebElement linkContactUs;
	
	public void clickSingIn()
	{
		linkSingin.click();
	}
	public void clickContactUs()
	{
		linkContactUs.click();
	}
	//----------------------------------------Elements On Home Page-----------------------------------
	
	@FindBy(xpath="//a[@class='sf-with-ul'][normalize-space()='Women']")
	WebElement linkWomen;
	
	@FindBy(xpath="//li[@class='sfHover']//a[@title='T-shirts'][normalize-space()='T-shirts']")
	WebElement linkTshirt;
	
	@FindBy(xpath="//a[@title='Blouses']")
	WebElement linkBlouses;
	
	@FindBy(xpath="//ul[@class='submenu-container clearfix first-in-line-xs']//ul//li//a[@title='Casual Dresses'][normalize-space()='Casual Dresses']")
	WebElement linkCasualDresses;
	
	public void click_Womens_TShirt() 
	{	
		Actions act=new Actions(driver);
		act.moveToElement(linkWomen).moveToElement(linkBlouses).click().perform();
	}
	
	public void click_Womens_Blouses() 
	{	
		Actions act=new Actions(driver);
		act.moveToElement(linkWomen).moveToElement(linkTshirt).click().perform();
	}
	public void click_Womens_CasualDresses() 
	{	
		Actions act=new Actions(driver);
		act.moveToElement(linkWomen).moveToElement(linkCasualDresses).click().perform();
	}
	
	
}
