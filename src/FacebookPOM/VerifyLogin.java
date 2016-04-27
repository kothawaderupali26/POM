package FacebookPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;



public class VerifyLogin {
	
	public WebDriver driver;
	
	LoginPage loginpage;
	HomePage homepage;
	
	@BeforeClass
	public void setUp(){
		System.setProperty("webdriver.chrome.driver","/Users/Sagar/Desktop/Sagar/Tanvi/Academics/ChromeDriver/chromedriver.exe");
        
        driver = new ChromeDriver();

	//	driver= new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void loginFacebook() throws InterruptedException{
		
		loginpage= PageFactory.initElements(driver, LoginPage.class);
		
		loginpage.VerifyLoginTitle();
		
		loginpage.validLogin("kothawaderupali26@gmail.com", "kothawade26");
		
		homepage= PageFactory.initElements(driver, HomePage.class);
		
		if(homepage.VerifySearch.isDisplayed()){
			System.out.println("Login is successful");
		}
		
		WebDriverWait wait=new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='_586i']")));
		
	//	Thread.sleep(2000);
		
		homepage.verifyTitle();
		
	//	homepage.logOut();
		
	}

	

}
