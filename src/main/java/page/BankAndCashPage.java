package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BankAndCashPage extends BasePage {

	WebDriver driver;

	public BankAndCashPage(WebDriver driver) {
		this.driver = driver;

	}

	// Element Library
	@FindBy(xpath = "//span[text()='Bank & Cash']")
	WebElement Bank_Cash_Button_Button;
	@FindBy(xpath = "//a[text()='New Account']")
	WebElement New_Account_Button;
	@FindBy(xpath = "//input[@id='account']")
	WebElement Account_Field_Element;
	@FindBy(xpath = "//input[@id='description']")
	WebElement Description_Element;
	@FindBy(xpath = "//input[@id='balance']")
	WebElement Balance_Field_Element;
	@FindBy(xpath = "//input[@id='account_number']")
	WebElement Account_Number_Field_Element;
	@FindBy(xpath = "//input[@id='contact_person']")
	WebElement Contact_Parson_Field_Element;
	@FindBy(xpath = "//input[@id='contact_phone']")
	WebElement Contact_Phone_Field_Element;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement Submit_Button_Element;

	// Interactive Methods
	public void clickOnBankAndCashButton() {
		Bank_Cash_Button_Button.click();
		waitForElement(driver, 15, Bank_Cash_Button_Button);
	}

	public void clickOnNewAccountButton() {
		New_Account_Button.click();
		waitForElement(driver, 15, New_Account_Button);
	}

	public void inputInfo(String AccountName, String Description, String Balance, String AccountNumber,
			String ContactPerson, String ContactPhone) {
		int generateNumber = randomGenerator(999);
		waitForElement( driver, 5, Account_Field_Element);
		Account_Field_Element.sendKeys(AccountName + generateNumber);
		Description_Element.sendKeys(Description);
		Balance_Field_Element.sendKeys(Balance);
		Account_Number_Field_Element.sendKeys(AccountNumber + generateNumber);
		Contact_Parson_Field_Element.sendKeys(ContactPerson);
		Contact_Phone_Field_Element.sendKeys(ContactPhone + generateNumber);
	}

	public void clickSubmitButton() {
		Submit_Button_Element.click();
	}
	public void takeScreenshotAtEndOfTest(WebDriver driver) throws IOException {

		TakesScreenshot ts = ((TakesScreenshot) driver);
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String label = formatter.format(date);
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(sourceFile, new File(currentDir + "/screenshot/" + label + ".png"));
	}
}