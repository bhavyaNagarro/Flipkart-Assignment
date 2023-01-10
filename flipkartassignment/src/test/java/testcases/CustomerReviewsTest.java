package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;
import org.apache.log4j.*;


import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.customerReviews;
import pages.sellingGuide;

public class CustomerReviewsTest extends basePage {
	
	Logger log = LogManager.getLogger(CustomerReviewsTest.class);
	
	@Test(priority=15)
	public void customerReviews() throws Throwable {
		
		// ------------------------- Test Data from Excel File --------------------------------------
		if (ExcelData.isExecuteCase("customerreview").equalsIgnoreCase("no"))
            throw new SkipException("Skiped");
		
		
		//  ----------  Check if popup(login) appears automatically while running other tests, close the popup
		try {
			driver.findElement(customerReviews.close_popup).click();
			test.log(LogStatus.INFO, "Close Popup button got clicked");
		}catch(Exception e) { }

		
		driver.findElement(customerReviews.seller_page).click();
		test.log(LogStatus.INFO, "Seller Button got clicked");
		
		driver.findElement(customerReviews.seller_reviews).click();
		test.log(LogStatus.INFO, "Seller Reviews Button got clicked");
		
		// logged the result in console
		log.info("Customer Review on flipkart testcase passed successfully.");

	}

}
