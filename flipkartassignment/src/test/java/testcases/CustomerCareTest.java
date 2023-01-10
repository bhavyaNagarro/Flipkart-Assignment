package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;
import org.apache.log4j.*;

import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.customerCare;

public class CustomerCareTest extends basePage {
	
	Logger log = LogManager.getLogger(CustomerCareTest.class);
	
	@Test(priority=5)
	public void customerCareTest() throws Throwable {
		
		// ------------------------- Test Data from Excel File --------------------------------------
		if (ExcelData.isExecuteCase("customercare").equalsIgnoreCase("no"))
            throw new SkipException("Skiped");
		
		//  ----------  Check if popup(login) appears automatically while running other tests, close the popup
		try {
			driver.findElement(customerCare.close_popup).click();
			test.log(LogStatus.INFO, "Close Popup button got clicked");
		}catch(Exception e) { }

		
		driver.findElement(customerCare.seller_page).click();
		test.log(LogStatus.INFO, "Seller Page Button got clicked");
		
		driver.findElement(customerCare.customer_faq).click();
		test.log(LogStatus.INFO, "Customer Care Page link got clicked");
		
		
		// logged the result in console
		log.info("Customer Care Section on flipkart testcase passed successfully.");

	}

}
