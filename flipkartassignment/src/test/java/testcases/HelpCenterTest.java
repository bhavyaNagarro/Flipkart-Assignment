package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;
import org.apache.log4j.*;

import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.helpCenter;

public class HelpCenterTest extends basePage {
	
	Logger log = LogManager.getLogger(HelpCenterTest.class);
	
	@Test(priority=20)
	public void cartSectionTest() throws Throwable {
		
		// ------------------------- Test Data from Excel File --------------------------------------
		if (ExcelData.isExecuteCase("helpcenter").equalsIgnoreCase("no"))
            throw new SkipException("Skiped");
		
		
		//  ----------  Check if popup(login) appears automatically while running other tests, close the popup
		try {
			driver.findElement(helpCenter.close_popup).click();
			test.log(LogStatus.INFO, "Close Popup button got clicked");
		}catch(Exception e) { }
		
		driver.findElement(helpCenter.cart_btn).click();
		test.log(LogStatus.INFO, "Cart Button got clicked");
		
		driver.findElement(helpCenter.help_center).click();
		test.log(LogStatus.INFO, "Help Center Link got clicked");
		
		// logged the result in console
		log.info("Help Center section on flipkart testcase passed successfully.");
	}
}
