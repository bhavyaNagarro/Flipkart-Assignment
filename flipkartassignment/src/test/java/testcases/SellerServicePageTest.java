package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;
import org.apache.log4j.*;

import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.sellerServicePage;

public class SellerServicePageTest extends basePage {
	
	Logger log = LogManager.getLogger(SellerServicePageTest.class);
	
	@Test(priority=4)
	public void sellerServicePageTest() throws Throwable {
		
		// ------------------------- Test Data from Excel File --------------------------------------
		if (ExcelData.isExecuteCase("sellerservice").equalsIgnoreCase("no"))
            throw new SkipException("Skiped");
		
		//  ----------  Check if popup(login) appears automatically while running other tests, close the popup
		try {
			driver.findElement(sellerServicePage.close_popup).click();
			test.log(LogStatus.INFO, "Close Popup button got clicked");
		}catch(Exception e) { }

		
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
