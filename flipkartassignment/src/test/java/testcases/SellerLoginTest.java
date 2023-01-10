package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;
import org.apache.log4j.*;

import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.sellerLogin;
import utilities.ReadingPropertiesFile;

public class SellerLoginTest extends basePage {
	
	Logger log = LogManager.getLogger(SellerLoginTest.class);
	
	@Test(priority=18)
	public void loginSeller() throws Throwable {
		
		// ------------------------- Test Data from Excel File --------------------------------------
		if (ExcelData.isExecuteCase("sellerlogin").equalsIgnoreCase("no"))
            throw new SkipException("Skiped");
		
		//  ----------  Check if popup(login) appears automatically while running other tests, close the popup
		try {
			driver.findElement(sellerLogin.close_popup).click();
			test.log(LogStatus.INFO, "Close Popup button got clicked");
		}catch(Exception e) { }
		
		driver.findElement(sellerLogin.seller_page_login).click();
		test.log(LogStatus.INFO, "Seller Login Page Button got clicked");
		
		driver.findElement(sellerLogin.seller_login_button).click();
		test.log(LogStatus.INFO, "Seller Login button got clicked");
		
		driver.findElement(sellerLogin.seller_mobile_number).sendKeys(ReadingPropertiesFile.getProperty("username"));
		test.log(LogStatus.INFO, "Seller Mobile number is input in the text box");
		
		// logged the result in console
		log.info("Login the seller on flipkart testcase passed successfully.");

	}

}
