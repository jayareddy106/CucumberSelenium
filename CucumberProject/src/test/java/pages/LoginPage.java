package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage 
{

	@FindBy(how=How.ID,using="userName")
	public static WebElement username;
	
	@FindBy(how=How.ID,using="password")
	public static WebElement Password;
	
	@FindBy(how=How.CSS,using="input[value='Login']")
	public static WebElement login;
	
	
}
