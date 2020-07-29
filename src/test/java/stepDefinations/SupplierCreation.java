package stepDefinations;

import org.openqa.selenium.WebDriver;

import commonFunctionLibrary.FunctionLibrary;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SupplierCreation {
	WebDriver driver;
	@When("^Open Browser$")
	public void open_Browser() throws Throwable {
	    driver=FunctionLibrary.startBrowser();
	}

	@When("^Open Application$")
	public void open_Application() throws Throwable {
	    FunctionLibrary.openApplication(driver);
	}

	@When("^Wait For Username$")
	public void wait_For_Username() throws Throwable {
	    FunctionLibrary.waitForElement(driver, "id", "username", "10");
	}

	@When("^Enter Username$")
	public void enter_Username() throws Throwable {
	    FunctionLibrary.typeAction(driver, "id", "username", "admin");
	}

	@When("^Wait For Password$")
	public void wait_For_Password() throws Throwable {
	    FunctionLibrary.waitForElement(driver, "name", "password", "10");
	}

	@When("^Enter Password$")
	public void enter_Password() throws Throwable {
	    FunctionLibrary.typeAction(driver, "Name", "password", "master");
	}

	@When("^Wait For Login$")
	public void wait_For_Login() throws Throwable {
	    FunctionLibrary.waitForElement(driver, "name", "btnsubmit", "10");
	}

	@When("^Click On Login$")
	public void click_On_Login() throws Throwable {
	   FunctionLibrary.clickAction(driver, "name", "btnsubmit");
	}

	@When("^Wait For Supplier$")
	public void wait_For_Supplier() throws Throwable {
	    FunctionLibrary.waitForElement(driver, "xpath", "//li[@id='mi_a_suppliers']//a[contains(text(),'Suppliers')]", "20");
	}

	@When("^Click On Supplier$")
	public void click_On_Supplier() throws Throwable {
	    FunctionLibrary.clickAction(driver, "xpath", "//li[@id='mi_a_suppliers']//a[contains(text(),'Suppliers')]");
	}

	@When("^Wait For AddButton$")
	public void wait_For_AddButton() throws Throwable {
	    FunctionLibrary.waitForElement(driver, "xpath", "/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]", "20");
	}

	@When("^Click On AddButton$")
	public void click_On_AddButton() throws Throwable {
	    FunctionLibrary.clickAction(driver, "xpath", "/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]");
	}

	@When("^Wait For SupplierNumber$")
	public void wait_For_SupplierNumber() throws Throwable {
	    FunctionLibrary.waitForElement(driver, "name", "x_Supplier_Number", "10");
	}

	@Then("^Capture Data$")
	public void capture_Data() throws Throwable {
		FunctionLibrary.captureData(driver, "id", "x_Supplier_Number");
	}

	@When("^Wait For SupplierName$")
	public void wait_For_SupplierName() throws Throwable {
	   FunctionLibrary.waitForElement(driver, "id", "x_Supplier_Name", "10");
	}

	@When("^Enter in \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_in_with_and(String testdata, String locatortype, String locatorvalue) throws Throwable {
		FunctionLibrary.typeAction(driver, locatortype, locatorvalue, testdata);
	}

	@When("^Wait For Add Button$")
	public void wait_For_Add_Button() throws Throwable {
		FunctionLibrary.waitForElement(driver, "id", "btnAction", "10");
	}

	@When("^Click On AddButton after adding notes$")
	public void click_On_AddButton_after_adding_notes() throws Throwable {
		FunctionLibrary.clickAction(driver, "id", "btnAction");
	}

	@When("^Wait For Ok Button$")
	public void wait_For_Ok_Button() throws Throwable {
		FunctionLibrary.waitForElement(driver, "xpath", "(//*[text()='OK!'])[1]", "20");
	}

	@When("^Click On Ok Button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_On_Ok_Button_with_and(String arg1, String arg2) throws Throwable {
		FunctionLibrary.clickAction(driver, arg1, arg2);
	}

	@When("^Wait For Alert$")
	public void wait_For_Alert() throws Throwable {
		FunctionLibrary.waitForElement(driver, "xpath", "(//*[text()='OK'])[6]", "10");
	}

	@When("^Click On Alert$")
	public void click_On_Alert() throws Throwable {
		FunctionLibrary.clickAction(driver, "xpath", "(//*[text()='OK'])[6]");
	}

	@Then("^user validate the supplier table$")
	public void user_validate_the_supplier_table() throws Throwable {
		FunctionLibrary.tableValidation(driver, "6");
	}


	@When("^user closes the browser$")
	public void user_closes_the_browser() throws Throwable {
		driver.close();
	}
}
