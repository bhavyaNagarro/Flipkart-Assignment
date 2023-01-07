package testcases;

import org.testng.annotations.Test;
import org.apache.log4j.*;

import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.sortMobilePrice;
import pages.termsOfUse;

public class TermsofuseTest extends basePage {
	
	Logger log = LogManager.getLogger(TermsofuseTest.class);
	
	@Test
	public void termsofuseTest() {
		
		driver.findElement(termsOfUse.login_btn).click();
		test.log(LogStatus.INFO, "Redicrected to Login Popup");
		
		driver.findElement(termsOfUse.terms_use).click();
		test.log(LogStatus.INFO, "Redicrected to terms of use Page");
		
		// logged the result in console
		log.info("Terms of use section on flipkart testcase passed successfully.");
	}

}
