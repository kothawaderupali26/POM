package Loancalulator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class calculator {
	
	public WebDriver driver;
	
	@FindBy(id="loanAmount")
	public WebElement LoanAmount;
	
	@FindBy(id="years")
	public WebElement Years;
	
	@FindBy(id="interestRate")
	public WebElement Rate;
	
	@FindBy(id="loanStartDate")
	public WebElement Date;
	
	@FindBy(id="calcButton")
	public WebElement Calculate;
	
	public void validLoan(String amount, String yrs, String rate, String day) throws InterruptedException{
		LoanAmount.clear();
		LoanAmount.sendKeys(amount);
		Years.clear();
		Years.sendKeys(yrs);
		Rate.clear();
		Rate.sendKeys(rate);
		Date.click();
		
		
		System.out.println(day);
		//dayPick(day);
		
		sagar(day);
		
		//Calculate.click();
		
	}
	
	
	public void sagar(String num) throws InterruptedException{
		
		System.out.println(num);
		Thread.sleep(3000);
		Thread.sleep(3000);
		List<WebElement> calendar=driver.findElements(By.xpath("//*[@id='autocalc']/div[7]/div[1]/table//td"));
		int total_days =calendar.size();
		  
		   for(int i=0; i<total_days; i++)
		   {
			   String day_element= calendar.get(i).getText();
			   System.out.println(day_element);
			     
			     if(day_element.equals(num))
			     {
			    	 calendar.get(i).click();
			    	 break;
			     }
		   }
	}
	
	public void dayPick(String selectday){
		
	List<WebElement> days=driver.findElements(By.xpath("//*[@id='autocalc']/div[7]/div[1]/table//td"));
	  
	System.out.println(selectday);
	  int total_days =days.size();
	  
	   for(int i=0; i<total_days; i++)
	   {
		   String day_element= days.get(i).getText();
		   System.out.println(day_element);
		     
		     if(day_element.equals(selectday))
		     {
		    	 days.get(i).click();
		    	 break;
		     }
	   }
	}
}
