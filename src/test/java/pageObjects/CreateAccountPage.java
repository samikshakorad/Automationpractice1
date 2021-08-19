package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
	WebDriver driver;
	
	public CreateAccountPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//----------------------------------------------------------------
	@FindBy(name="email_create")
	WebElement txtemail_create;
	
	@FindBy(xpath="//span[normalize-space()='Create an account']")
	WebElement btnClickAccount;
	
	public void setCreateEmailId(String createemail)
	{
		txtemail_create.sendKeys(createemail);
	}
	public void clickCreateAccount()
	{
		btnClickAccount.click();
	}
	//------------------------------------------------------------------------------------------
	@FindBy(xpath="//input[@id='email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	WebElement clickSignIn;
	
	//@FindBy(xpath="//span[@class='navigation_page']")
	//WebElement authenticationmsg;
		
	public void setEmail(String email)
	{
		//if(authenticationmsg.getText().equalsIgnoreCase("Authentication"))
		txtEmail.sendKeys(email);
		//else
		//txtEmail.sendKeys(email);
	}

	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	public void btnSignin()
	{
		clickSignIn.click();
	}
	
	@FindBy(xpath="//p[@class='info-account']")
	WebElement msgConfirmation;
	public String getConfirmationMsg()
	{
		try
		{
			return (msgConfirmation.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
	
}
