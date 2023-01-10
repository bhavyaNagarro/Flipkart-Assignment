package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;
import org.apache.log4j.*;

import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.sortMobilePrice;
import pages.termsOfUse;

public class TermsofuseTest extends basePage {
	
	Logger log = LogManager.getLogger(TermsofuseTest.class);
	
	@Test(priority=11)
	public void termsofuseTest() throws Throwable {
		
		// ------------------------- Test Data from Excel File --------------------------------------
		if (ExcelData.isExecuteCase("termsofuse").equalsIgnoreCase("no"))
            throw new SkipException("Skiped");
		
		//  ----------  Check if popup(login) appears automatically while running other tests, close the popup
		try {
			driver.findElement(termsOfUse.close_popup).click();
			test.log(LogStatus.INFO, "Close Popup button got clicked");
		}catch(Exception e) { }

		
		driver.findElement(termsOfUse.login_btn).click();
		test.log(LogStatus.INFO, "Redicrected to Login Popup");
		
		driver.findElement(termsOfUse.terms_use).click();
		test.log(LogStatus.INFO, "Redicrected to terms of use Page");
		
		// logged the result in console
		log.info("Terms of use section on flipkart testcase passed successfully.");
	}

}
