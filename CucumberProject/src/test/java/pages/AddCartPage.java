package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddCartPage
{

	@FindBy(how=How.ID,using="userName")
	public static WebElement username;
	
	@FindBy(how=How.ID,using="password")
	public static WebElement Password;
	
	@FindBy(how=How.CSS,using="input[value='Login']")
	public static WebElement login;

	
	@FindBy(how=How.XPATH,using="//div/div[1]/button")
	public static WebElement addproductbutton;
	
	@FindBy(how=How.ID,using="categorydropid")
	public static WebElement slect;
	
	public static void select() {
		Select s=new Select(slect);
		s.selectByIndex(1);
	}
	
	@FindBy(how=How.ID,using="subcategorydropid")
	public static WebElement subcart;
	public static void subselect() {
		Select s=new Select(subcart);
		s.selectByIndex(2);
	}
	@FindBy(how=How.ID,using="prodid")
	public static WebElement product;
	
	@FindBy(how=How.ID,using="priceid")
	public static WebElement cost;
	
	
	@FindBy(how=How.ID,using="quantityid")
	public static WebElement quantity;
	
	
	@FindBy(how=How.ID,using="brandid")
	public static WebElement brand;
	

	@FindBy(how=How.ID,using="description")
	public static WebElement discription;
	
	@FindBy(how=How.CLASS_NAME,using="input-group image-preview")
	public static WebElement file;
	
	@FindBy(how=How.CSS,using="input[value='Add Product']")
	public static WebElement addproduct;
	
	@FindBy(how=How.XPATH,using="/html/body/main/div/div/div/form/b/i")
	public static WebElement productadded;
	
	
}
