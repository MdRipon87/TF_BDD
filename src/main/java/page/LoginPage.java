package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}	
	
	// Element Library
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement Username_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password_Field;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement Signin_Button;
	
	

	// Interactive Methods
	public void enterCredentials(String userName ,String password) {
		Username_Field.sendKeys(userName);
		Password_Field.sendKeys(password);
	}

	public void clickSigninButton() {
		Signin_Button.click();
	}


	public void validateDashboardHeader() {
		
		Assert.assertEquals("Dashboard- iBilling", driver.getTitle());
	}
	
	public void takeScreenshotAtEndOfTest(WebDriver driver) throws IOException {
		
		TakesScreenshot ts = ((TakesScreenshot)driver);
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String label = formatter.format(date);
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(sourceFile, new File(currentDir+"/screenshot/"+label+".png"));
	}
	
	
	/*
	 * public void login(String userName ,String password) {
	 * Username_Field.sendKeys(userName); Password_Field.sendKeys(password);
	 * Signin_Button.click(); }
	 */ 
}