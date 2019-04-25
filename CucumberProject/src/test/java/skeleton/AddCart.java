package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AddCartPage;

public class AddCart 
{

	WebDriver driver;
	
	@Before
	public void inIt() {
		driver = DriverUtility.getDriver("chrome");
		PageFactory.initElements(driver, AddCartPage.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	
	
@Given("user enter url")
public void user_enter_url() {
	driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
}

@When("user enter data for Addcart")
public void user_enter_data_for_Addcart()
{
	AddCartPage.username.sendKeys("admin");
	AddCartPage.Password.sendKeys("Password456");
	AddCartPage.login.click();
}

@Then("product add successfully")
public void product_add_successfully() {
    
}

}
