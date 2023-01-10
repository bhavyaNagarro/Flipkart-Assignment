package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;
import org.apache.log4j.*;


import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.privacyPolicy;

public class PrivacyPolicyTest extends basePage {
	
	Logger log = LogManager.getLogger(PrivacyPolicyTest.class);
	
	@Test(priority=12)
	public void privacyPolicy() throws Throwable {
		
		// ------------------------- Test Data from Excel File --------------------------------------
		if (ExcelData.isExecuteCase("privacypolicy").equalsIgnoreCase("no"))
            throw new SkipException("Skiped");
		
		//  ----------  Check if popup(login) appears automatically while running other tests, close the popup
		try {
			driver.findElement(privacyPolicy.close_popup).click();
			test.log(LogStatus.INFO, "Close Popup button got clicked");
		}catch(Exception e) { }
		
		driver.findElement(privacyPolicy.login_btn).click();
		test.log(LogStatus.INFO, "Redicrected to Login Popup");
		
		driver.findElement(privacyPolicy.privacy_policy).click();
		test.log(LogStatus.INFO, "Redicrected to privacy Policy Page");
		
		// logged the result in console
		log.info("Privacy Policy Section on flipkart testcase passed successfully.");
	}

}
