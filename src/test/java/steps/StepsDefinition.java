package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.BankAndCashPage;
import page.LoginPage;
import util.BrowserFactory;

public class StepsDefinition {
	WebDriver driver;
	LoginPage loginpage;
	BankAndCashPage bankpage;

	@Before
	public void beforeRun() {
		driver = BrowserFactory.init();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		bankpage = PageFactory.initElements(driver, BankAndCashPage.class);
	}

	@Given("^User is  on the Techfios login page$")
	public void user_is_on_the_Techfios_login_page() {
		driver.get("https://techfios.com/billing/?ng=login/");
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String userName, String password) {
		loginpage.enterCredentials(userName, password);
	}

	@When("^User clicks on signin button$")
	public void user_clicks_on_signin_button() {
		loginpage.clickSigninButton();
	}

	@Then("^User should able to land on dashboard page$")
	public void user_should_able_to_land_on_dashboard_page() {
		loginpage.validateDashboardHeader();
	}

	@When("^User clicks on bank and cash$")
	public void user_clicks_on_bank_and_cash() {
		bankpage.clickOnBankAndCashButton();
	}

	@When("^User clicks on new account$")
	public void user_clicks_on_new_account() {
		bankpage.clickOnNewAccountButton();
	}

	@When("^User fill up the form entering \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_fill_up_the_form_entering_and_and_and_and_and(String AccountName, String Description,
			String Balance, String AccountNumber, String ContactPerson, String ContactPhone) {
		bankpage.inputInfo(AccountName, Description, Balance, AccountNumber, ContactPerson, ContactPhone);
	}

	@Then("^User clicks on submit button$")
	public void user_clicks_on_submit_button() throws IOException {
		bankpage.clickSubmitButton();
		bankpage.takeScreenshotAtEndOfTest(driver);
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
