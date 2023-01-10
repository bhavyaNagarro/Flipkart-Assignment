package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;
import org.apache.log4j.*;

import com.relevantcodes.extentreports.LogStatus;

import pages.sellingGuide;
import pages.basePage;

public class SellingGuideTest extends basePage {
	
	Logger log = LogManager.getLogger(SellingGuideTest.class);
	
	@Test(priority=14)
	public void sellingGuide() throws Throwable {
		
		// ------------------------- Test Data from Excel File --------------------------------------
		if (ExcelData.isExecuteCase("sellersguide").equalsIgnoreCase("no"))
            throw new SkipException("Skiped");
		
		//  ----------  Check if popup(login) appears automatically while running other tests, close the popup
		try {
			driver.findElement(sellingGuide.close_popup).click();
			test.log(LogStatus.INFO, "Close Popup button got clicked");
		}catch(Exception e) { }

		driver.findElement(sellingGuide.seller_page).click();
		test.log(LogStatus.INFO, "Seller Page Button got clicked");
		
		driver.findElement(sellingGuide.resources_link).click();
		test.log(LogStatus.INFO, "Seller Resources Button got clicked");
		
		driver.findElement(sellingGuide.selling_giude).click();
		test.log(LogStatus.INFO, "Selling Guide Button got clicked");
		
		// logged the result in console
		log.info("Guidance to sellers on flipkart testcase passed successfully.");
	}

}
