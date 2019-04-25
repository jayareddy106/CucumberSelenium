package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AddCartPage;
import pages.LoginPage;

public class CucumberCaseStudy1 
{
	WebDriver driver;

	//@Before
	public void inIt() {
		driver = DriverUtility.getDriver("chrome");
		PageFactory.initElements(driver, LoginPage.class);
		PageFactory.initElements(driver, AddCartPage.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	
	@Given("url of TestMe")
	public void url_of_TestMe() {
		  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
			
	}

	@When("user enter the data for Login")
	public void user_enter_the_data_for_Login() {
		LoginPage.username.sendKeys("admin");
		LoginPage .Password.sendKeys("Password456");
		LoginPage.login.click();
	}
	@Then("user Login successful")
	public void user_Login_successful()
	{
	    
	}
	
	@Given("AddCart page")
	public void addcart_page() {
	    
		
	}

	@When("user enters the data for AddProduct")
	public void user_enters_the_data_for_AddProduct() 
	{
		AddCartPage.addproductbutton.click();
		AddCartPage.slect.click();
		
		
	}

	@Then("user get product successfully")
	public void user_get_product_successfully() {
	   
	}

	
	
	
	
	
	
	
}
