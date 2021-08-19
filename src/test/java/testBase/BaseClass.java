package testBase;

import java.time.Duration;
import java.util.ResourceBundle;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public Logger logger; //class variable created for log4j file, for logging purpose
	public ResourceBundle rb;//class variable to load the property file
	
	@BeforeClass
	public void setup()
	{
		logger=LogManager.getLogger(this.getClass());//this will return logging msg for current class
		rb=ResourceBundle.getBundle("config"); //Load config.properties file
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));					
	}
		
	public String randomstring()
	{
		String generatedString= RandomStringUtils.randomAlphanumeric(5);
		return (generatedString);		
	}
	public String randomNumer()
	{
		String generatedNumber=RandomStringUtils.randomNumeric(10);
		return(generatedNumber);
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
}
