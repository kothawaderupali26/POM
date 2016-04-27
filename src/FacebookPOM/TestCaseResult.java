package Loancalulator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class TestCaseResult {
	
	public WebDriver driver;

	calculator calci;
	
	@BeforeClass
	public void setUp(){
     System.setProperty("webdriver.chrome.driver","/Users/Sagar/Desktop/Sagar/Tanvi/Academics/ChromeDriver/chromedriver.exe");
        
        driver = new ChromeDriver();
        driver.get("http://www.bankrate.com/calculators/auto/auto-loan-calculator.aspx?loanAmount=15000&years=4.00&terms=48&interestRate=3.000&loanStartDate=22+Apr+2016&show=false&showRt=true&monthlyAdditionalAmount=0&yearlyAdditionalAmount=0&yearlyPaymentMonth=+Apr+&oneTimeAdditionalPayment=0&oneTimeAdditionalPaymentInMY=+May+2016&ic_id=auto_loan_calc_calculate_btn");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        
	}
	
	@Test
	public void test() throws InterruptedException{
		calci= PageFactory.initElements(driver, calculator.class);
	     calci.validLoan("200000","5", "3", "14");
		
		
	}
	
	
	

}
