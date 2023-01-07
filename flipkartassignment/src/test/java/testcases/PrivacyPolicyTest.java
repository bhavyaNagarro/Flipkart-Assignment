package testcases;

import org.testng.annotations.Test;
import org.apache.log4j.*;


import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.privacyPolicy;

public class PrivacyPolicyTest extends basePage {
	
	Logger log = LogManager.getLogger(PrivacyPolicyTest.class);
	
	@Test
	public void privacyPolicy() {
		
		driver.findElement(privacyPolicy.login_btn).click();
		test.log(LogStatus.INFO, "Redicrected to Login Popup");
		
		driver.findElement(privacyPolicy.privacy_policy).click();
		test.log(LogStatus.INFO, "Redicrected to privacy Policy Page");
		
		// logged the result in console
		log.info("Privacy Policy Section on flipkart testcase passed successfully.");
	}

}
