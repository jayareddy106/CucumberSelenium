package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pages.RegistrationPage;

public class RegistrationStepDefination {

	WebDriver driver;

	@Before
	public void inIt() {
		driver = DriverUtility.getDriver("chrome");
		PageFactory.initElements(driver, RegistrationPage.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Given("url of DemoWebShop")
	public void url_of_DemoWebShop() {
		  driver.get("http://demowebshop.tricentis.com/register");
		
	}

	@When("user enter the data for registration")
	public void user_enter_the_data_for_registration()
	{
		RegistrationPage.gender.click();
		RegistrationPage.firstname.sendKeys("jayachandra");
		RegistrationPage.lastname.sendKeys("Reddy");
		RegistrationPage.email.sendKeys("jayachandrareddy3@gmail.com");
		RegistrationPage.password.sendKeys("reddy123");
		RegistrationPage.confirmpassword.sendKeys("reddy123");
		RegistrationPage.register.click();
	}

	@Then("user registration successful")
	public void user_registration_successful() {
	Assert.assertEquals("Your registration completed",RegistrationPage.message.getText().contains("completed"));

	}

}
