package testcases;

import org.testng.annotations.Test;
import org.apache.log4j.*;


import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.customerReviews;
import pages.sellingGuide;

public class CustomerReviewsTest extends basePage {
	
	Logger log = LogManager.getLogger(CustomerReviewsTest.class);
	
	@Test
	public void customerReviews() {
		
		driver.findElement(customerReviews.seller_page).click();
		test.log(LogStatus.INFO, "Seller Button got clicked");
		
		driver.findElement(customerReviews.seller_reviews).click();
		test.log(LogStatus.INFO, "Seller Reviews Button got clicked");
		
		// logged the result in console
		log.info("Customer Review on flipkart testcase passed successfully.");

	}

}
