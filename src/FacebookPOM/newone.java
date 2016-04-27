package FacebookPOM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class newone {
	
	public static void main (String[] args) throws InterruptedException{
		
		WebDriver driver;
		//driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","/Users/Sagar/Desktop/Sagar/Tanvi/Academics/ChromeDriver/chromedriver.exe");
        
        driver = new ChromeDriver();

		
		driver.get("http://www.bankrate.com/calculators/auto/auto-loan-calculator.aspx?loanAmount=200000&years=5.000&terms=60&interestRate=3.000&loanStartDate=22+Apr+2016&show=false&showRt=true&monthlyAdditionalAmount=0&yearlyAdditionalAmount=0&yearlyPaymentMonth=+Apr+&oneTimeAdditionalPayment=0&oneTimeAdditionalPaymentInMY=+May+2016&ic_id=auto_loan_calc_calculate_btn");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*driver.findElement(By.id("email")).sendKeys("kothawaderupali26@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("kothawade26");
		driver.findElement(By.xpath("//input[@id='u_0_y']")).click();*/
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='loanAmount']")).clear();
		driver.findElement(By.xpath("//input[@id='loanAmount']")).sendKeys("300000");
	//	driver.findElement(By.xpath("//input[@id='loanStartDate']")).clear();
		driver.findElement(By.xpath("//input[@id='loanStartDate']")).click();
		
		
	//	driver.findElement(By.linkText("28")).click();
		//id('autocalc')/x:div[7]/x:div[1]/x:table/x:tbody/x:tr[3]/x:td[5]
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id='autocalc']/div[7]/div[1]/table/tbody/tr[3]/td[5]")).click();
				
		Thread.sleep(2000);
		List<WebElement> dates=driver.findElements(By.xpath("//*[@id='autocalc']/div[7]/div[1]/table//td"));
		  
		  int total_dates =dates.size();
		  
		   for(int i=0; i<total_dates; i++)
		   {
			   String date= dates.get(i).getText();
			     
			     if(date.equals("21"))
			     {
			    	 dates.get(i).click();
			    	 break;
			     }
		   }
		}
		
	

}
