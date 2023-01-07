package testcases;

import org.testng.annotations.Test;
import org.apache.log4j.*;

import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.mobileSection;

public class MobileSectionTest extends basePage {
	
	Logger log = LogManager.getLogger(MobileSectionTest.class);
	
	@Test
	public void mobileSection() {
		
		driver.findElement(mobileSection.mobile_page_link).click();
		test.log(LogStatus.INFO, "Redicrected to Mobile Page");
		
		driver.findElement(mobileSection.shop_now).click();
		test.log(LogStatus.INFO, "Redicrected to selected Brand Page");
		
		// logged the result in console
		log.info("Mobile Sections on flipkart testcase passed successfully.");
	}

}
