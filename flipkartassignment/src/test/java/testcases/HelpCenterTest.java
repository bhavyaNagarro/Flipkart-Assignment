package testcases;

import org.testng.annotations.Test;
import org.apache.log4j.*;

import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.helpCenter;

public class HelpCenterTest extends basePage {
	
	Logger log = LogManager.getLogger(HelpCenterTest.class);
	
	@Test
	public void cartSectionTest() {
		
		driver.findElement(helpCenter.cart_btn).click();
		test.log(LogStatus.INFO, "Cart Button got clicked");
		
		driver.findElement(helpCenter.help_center).click();
		test.log(LogStatus.INFO, "Help Center Link got clicked");
		
		// logged the result in console
		log.info("Help Center section on flipkart testcase passed successfully.");
	}
}
