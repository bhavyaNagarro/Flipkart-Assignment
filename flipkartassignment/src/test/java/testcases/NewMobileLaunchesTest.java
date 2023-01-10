package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;
import org.apache.log4j.*;

import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.newMobileLaunches;

public class NewMobileLaunchesTest extends basePage {
	
	Logger log = LogManager.getLogger(NewMobileLaunchesTest.class);
	
	@Test(priority=9)
	public void newMobileLaunchesTest() throws Throwable {
		
		// ------------------------- Test Data from Excel File --------------------------------------
		if (ExcelData.isExecuteCase("newmobiles").equalsIgnoreCase("no"))
            throw new SkipException("Skiped");
		
		
		//  ----------  Check if popup(login) appears automatically while running other tests, close the popup
		try {
			driver.findElement(newMobileLaunches.close_popup).click();
			test.log(LogStatus.INFO, "Close Popup button got clicked");
		}catch(Exception e) { }
		
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
