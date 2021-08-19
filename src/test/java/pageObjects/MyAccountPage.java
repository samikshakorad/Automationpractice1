package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyAccountPage {
	
	WebDriver driver;
	
	public MyAccountPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='id_gender1']")
	WebElement btnmale;
	public void setMale()
	{
		btnmale.click();
	}
	
	@FindBy(xpath="//input[@id='id_gender2']")
	WebElement btnfemale;
	public void setfeMale()
	{
		btnfemale.click();
	}
	
	@FindBy(xpath="//input[@id='customer_firstname']")
	WebElement txtfname;
	
	public void setCust_Firstname(String fname)
	{
		txtfname.sendKeys(fname);
	}
	
	@FindBy(xpath="//input[@id='customer_lastname']")
	WebElement txtlname;
	
	public void setCust_Lastname(String lname)
	{
		txtlname.sendKeys(lname);
	}
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement txtpassword;
	
	public void setCust_Password(String pswd)
	{
		txtpassword.sendKeys(pswd);
	}
	
	@FindBy(xpath="//select[@id='days']")
	WebElement selectDay;
	public void setDays()
	{
		Select selectday=new Select(selectDay);
		selectday.selectByValue("4");
		//selectDay.click();
	}
	
	
	@FindBy(xpath="//select[@id='months']")
	WebElement selectMonth;
	public void setMonths()
	{
		Select selectmth=new Select(selectMonth);
		selectmth.selectByValue("1");
		//selectMonth.click();
	}
	
	@FindBy(xpath="//select[@id='years']")
	WebElement selectYear;
	public void setYear()
	{
		 Select selectyear=new Select(selectYear);
		selectyear.selectByValue("1995");
		//selectYear.click();
	}
	
	@FindBy(xpath="//input[@id='newsletter']")
	WebElement newsletter;
	public void setnewsletter()
	{
		newsletter.click();
	}
	
	@FindBy(xpath="//input[@id='optin']")
	WebElement offers;
	public void setoffers()
	{
		offers.click();
	}
	
	@FindBy(xpath="//input[@id='firstname']")
	WebElement first_nm;
	public void setFirstName(String fnm)
	{
		first_nm.sendKeys(fnm);
	}
	
	@FindBy(xpath=" //input[@id='lastname']")
	WebElement last_nm;
	public void setLastName(String lnm)
	{
		last_nm.sendKeys(lnm);
	}
	
	@FindBy(xpath=" //input[@id='company']")
	WebElement companynm;
	public void setCompany_nm(String cnm)
	{
		companynm.sendKeys(cnm);
	}
	
	@FindBy(xpath="//input[@id='address1']")
	WebElement txtAddress;
	public void setAddress(String adr1)
	{
		txtAddress.sendKeys(adr1);
	}
	
	@FindBy(xpath="//input[@id='address2']")
	WebElement txtAddress2;	
	public void setAddress2(String adr2)
	{
		txtAddress2.sendKeys(adr2);
	}
	
	@FindBy(xpath="//input[@id='city']")
	WebElement txtCity;
	public void setCity(String cty)
	{
		txtCity.sendKeys(cty);
	}
	
	@FindBy(xpath="//select[@id='id_state']")
	WebElement setState;
	public void setState()
	{
		Select select=new Select(setState);
		select.selectByValue("10");		
	}
	
	@FindBy(xpath="//input[@id='postcode']")
	WebElement txtPostcode;
	public void setPostcode(String pcode)
	{
		txtPostcode.sendKeys(pcode);
	}
	
	@FindBy(xpath="//select[@id='id_country']")
	WebElement selectCountry;
	public void setCountry()
	{
		Select slecountry=new Select(selectCountry);
		slecountry.selectByValue("21");		
	}
	
	@FindBy(xpath="//textarea[@id='other']")
	WebElement txtOthers;
	public void setOtherInfo(String othertxt)
	{
		txtOthers.sendKeys(othertxt);
	}
	
	@FindBy(xpath="//input[@id='phone']")
	WebElement homephone;
	public void setHomePhone(String hphone)
	{
		homephone.sendKeys(hphone);
	}
	
	@FindBy(xpath="//input[@id='phone_mobile']")
	WebElement mobileno;
	public void setMobileNo(String mno)
	{
		mobileno.sendKeys(mno);
	}
	
	@FindBy(xpath="//input[@id='alias']")
	WebElement txtReference;
	public void setReference(String refer)
	{
		txtReference.clear();
		txtReference.sendKeys(refer);
	}
	
	@FindBy(xpath="//span[normalize-space()='Register']")
	WebElement btnRegister;
	public void clickRegister()
	{
		btnRegister.click();
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
