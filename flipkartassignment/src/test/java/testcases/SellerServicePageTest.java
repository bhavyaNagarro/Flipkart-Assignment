package testcases;

import org.testng.annotations.Test;
import org.apache.log4j.*;

import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.sellerServicePage;

public class SellerServicePageTest extends basePage {
	
	Logger log = LogManager.getLogger(SellerServicePageTest.class);
	
	@Test
	public void sellerServicePageTest() {
		
		driver.findElement(sellerServicePage.seller_page).click();
		test.log(LogStatus.INFO, "Service Page link got clicked");
		
		driver.findElement(sellerServicePage.seller_service).click();
		test.log(LogStatus.INFO, "Service button got clicked");
		
		driver.findElement(sellerServicePage.seller_fulfilment).click();
		test.log(LogStatus.INFO, "Fulfilment button got clicked");
		
		// logged the result in console
		log.info("Services offered by flipkart to sellers testcase passed successfully.");
	}
	
}
