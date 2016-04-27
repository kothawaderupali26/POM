package FacebookPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage {

	public WebDriver driver;
	
	@FindBy(id="email")
	public WebElement Email;
	@FindBy(id="pass")
	public WebElement Password;
	@FindBy(xpath="//input[@id='u_0_y']")
	public WebElement LogIn;
	
	public boolean VerifyLoginTitle(){
		try{
			Assert.assertEquals("Facebook - Log In or Sign Up", driver.getTitle());
			
		}catch(Exception e){
			return false;
		}return true;
		
	}
	
	public void validLogin(String email, String password){
		Email.sendKeys(email);
		Password.sendKeys(password);
		LogIn.click();
		
	}
}
