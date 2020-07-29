package stepDefinations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class StepDeination {
	WebDriver driver;
	@When("^I launch url in a browser$")
	public void i_launch_url_in_a_browser() throws Throwable {
	   driver= new ChromeDriver();
	   driver.get("http://orangehrm.qedgetech.com/");
	   driver.manage().window().maximize();
	}

	@When("^i enter username and i enter password$")
	public void i_enter_username_and_i_enter_password() throws Throwable {
	  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
	}
	@When("^I click Login Button$")
	public void i_click_Login_Button() throws Throwable {
	    driver.findElement(By.name("Submit")).click();
	    Thread.sleep(5000);
	}
	@Then("^I Should see dashboard in url$")
	public void i_Should_see_dashboard_in_url() throws Throwable {
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

	@When("^i close browser$")
	public void i_close_browser() throws Throwable {
	  driver.close(); 
	}

}
