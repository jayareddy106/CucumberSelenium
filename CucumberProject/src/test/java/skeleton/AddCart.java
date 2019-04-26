package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pages.AddCartPage;

public class AddCart {

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
	public void user_enter_data_for_Addcart() {
		AddCartPage.username.sendKeys("admin");
		AddCartPage.Password.sendKeys("Password456");
		AddCartPage.login.click();
		AddCartPage.addproductbutton.click();
		AddCartPage.slect.click();
		AddCartPage.select();
		AddCartPage.subcart.click();
		AddCartPage.subselect();
		AddCartPage.product.sendKeys("Hp");
		AddCartPage.cost.sendKeys("22000");
		AddCartPage.quantity.sendKeys("1");
		AddCartPage.brand.sendKeys("hp");
		AddCartPage.discription.sendKeys("good product");
		AddCartPage.addproduct.click();

	}

	@Then("product add successfully")
	public void product_add_successfully() {

		Assert.assertTrue(AddCartPage.productadded.getText().contains("Succesfully"));

	}
}
