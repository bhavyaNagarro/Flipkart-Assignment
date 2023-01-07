package testcases;

import org.testng.annotations.Test;
import org.apache.log4j.*;

import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.newMobileLaunches;

public class NewMobileLaunchesTest extends basePage {
	
	Logger log = LogManager.getLogger(NewMobileLaunchesTest.class);
	
	@Test
	public void newMobileLaunchesTest() {
		
		driver.findElement(newMobileLaunches.mobile_page_link).click();
		test.log(LogStatus.INFO, "Redicrected to Mobile Page");
		
		driver.findElement(newMobileLaunches.shop_now).click();
		test.log(LogStatus.INFO, "Redicrected to selected Brand Page");
		
		driver.findElement(newMobileLaunches.new_mobile_launch).click();
		test.log(LogStatus.INFO, "Redicrected to selected Brand Page");
		
		// logged the result in console
		log.info("Sorted data of new mobiles arrival on flipkart testcase passed successfully.");
	}
	
}
