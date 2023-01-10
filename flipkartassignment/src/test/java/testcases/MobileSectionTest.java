package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;
import org.apache.log4j.*;

import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.mobileSection;

public class MobileSectionTest extends basePage {
	
	Logger log = LogManager.getLogger(MobileSectionTest.class);
	
	@Test(priority=7)
	public void mobileSection() throws Throwable {
		
		// ------------------------- Test Data from Excel File --------------------------------------
		if (ExcelData.isExecuteCase("mobilesection").equalsIgnoreCase("no"))
            throw new SkipException("Skiped");
		
		
		//  ----------  Check if popup(login) appears automatically while running other tests, close the popup
		try {
			driver.findElement(mobileSection.close_popup).click();
			test.log(LogStatus.INFO, "Close Popup button got clicked");
		}catch(Exception e) { }

		
		driver.findElement(mobileSection.mobile_page_link).click();
		test.log(LogStatus.INFO, "Redicrected to Mobile Page");
		
		driver.findElement(mobileSection.shop_now).click();
		test.log(LogStatus.INFO, "Redicrected to selected Brand Page");
		
		// logged the result in console
		log.info("Mobile Sections on flipkart testcase passed successfully.");
	}

}
