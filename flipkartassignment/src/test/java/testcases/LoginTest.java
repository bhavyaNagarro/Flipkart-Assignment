package testcases;

import org.testng.Assert;
import org.testng.SkipException;
import org.apache.log4j.*;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.homePage;
import pages.loginPage;
import utilities.ReadingPropertiesFile;

public class LoginTest extends basePage {
	
	Logger log = LogManager.getLogger(LoginTest.class);
	
	@Test(priority=1)
	public void login() throws Throwable {
		
		// ------------------------- Test Data from Excel File --------------------------------------
		if (ExcelData.isExecuteCase("logintest").equalsIgnoreCase("no"))
            throw new SkipException("Skiped");
		
		driver.findElement(loginPage.txt_username).sendKeys(ReadingPropertiesFile.getProperty("username"));
		test.log(LogStatus.INFO, "Username Input box popped up");
	
		driver.findElement(loginPage.requestOtpBtn).click();
		test.log(LogStatus.INFO, "Request OTP button got clicked");
		
		
		// logged the result in console
		log.info("User Login functionality on flipkart testcase passed successfully.");
	}
}
