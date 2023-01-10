package testcases;

import org.apache.log4j.*;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.topOffers;

public class TopOffersTest extends basePage {
	
	Logger log = LogManager.getLogger(TopOffersTest.class);
	
	@Test(priority=6)
	public void topOffers() throws Throwable {
		
		// ------------------------- Test Data from Excel File --------------------------------------
		if (ExcelData.isExecuteCase("topoffers").equalsIgnoreCase("no"))
            throw new SkipException("Skiped");
		
		//  ----------  Check if popup(login) appears automatically while running other tests, close the popup
		try {
			driver.findElement(topOffers.close_popup).click();
			test.log(LogStatus.INFO, "Close Popup button got clicked");
		}catch(Exception e) { }

		
		driver.findElement(topOffers.topoffer_link).click();
		test.log(LogStatus.INFO, "Redicrected to Top offers Page");
		
		
		// logged the result in console
		log.info("Top Offers on flipkart testcase passed successfully.");
	}

}
