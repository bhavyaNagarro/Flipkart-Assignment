package testcases;

import org.testng.annotations.Test;
import org.apache.log4j.*;

import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.customerCare;

public class CustomerCareTest extends basePage {
	
	Logger log = LogManager.getLogger(CustomerCareTest.class);
	
	@Test
	public void customerCareTest() {
		
		driver.findElement(customerCare.seller_page).click();
		test.log(LogStatus.INFO, "Seller Page Button got clicked");
		
		driver.findElement(customerCare.customer_faq).click();
		test.log(LogStatus.INFO, "Customer Care Page link got clicked");
		
		
		// logged the result in console
		log.info("Customer Care Section on flipkart testcase passed successfully.");

	}

}
