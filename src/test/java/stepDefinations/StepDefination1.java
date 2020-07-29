package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination1 {
	WebDriver driver;
	String url="http://orangehrm.qedgetech.com";
	@When("^I open OrangeHRMS URL on \"([^\"]*)\"$")
	public void i_open_OrangeHRMS_URL_on(String brw) throws Throwable {
		if(brw.equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
		}
		else if(brw.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			driver.get(url);
		}
		else
		{
			System.out.println("Browser value is not matching");
		}
	}

	@When("^Enter \"([^\"]*)\" in username textbox$")
	public void enter_in_username_textbox(String username) throws Throwable {
		driver.findElement(By.name("txtUsername")).sendKeys(username);
	    
	}

	@When("^Enter \"([^\"]*)\" in password text box$")
	public void enter_in_password_text_box(String password) throws Throwable {
		driver.findElement(By.name("txtPassword")).sendKeys(password);  
	}

	@When("^clicking Login Button$")
	public void clicking_Login_Button() throws Throwable {
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
	    
	}

	@Then("^I Should see dashboard text in url$")
	public void i_Should_see_dashboard_text_in_url() throws Throwable {
		 String expected="dash";
		    String actual=driver.getCurrentUrl();
		    if(actual.contains(expected))
		    {
		    	System.out.println("Login Success::"+actual+" "+expected);
		    }
		    else
		    {
		    	System.out.println("Login Fail::"+actual+" "+expected);
		    }
	}

	@When("^Closingbrowser$")
	public void closingbrowser() throws Throwable {
	    driver.close();
	}

}
