package FacebookPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {
	
	public WebDriver driver;
	
	@FindBy(id="userNavigationLabel")
	public WebElement DropdownArrow;
	
	@FindBy(xpath="//span[@class='_54nh']")
	public WebElement logOut;
	
	@FindBy(xpath="//div[@class='_586i']")
	public WebElement VerifySearch;
	
	public void logOut(){
		DropdownArrow.click();
		logOut.click();	
	}

	public boolean verifyTitle(){
		try{
			Assert.assertEquals("Facebook", driver.getTitle());
			
		}catch (Exception e){
			return false;
		}return true;
	//	System.out.println(Title);
	}
}
