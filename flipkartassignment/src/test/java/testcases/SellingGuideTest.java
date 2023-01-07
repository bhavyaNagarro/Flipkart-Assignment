package testcases;

import org.testng.annotations.Test;
import org.apache.log4j.*;

import com.relevantcodes.extentreports.LogStatus;

import pages.sellingGuide;
import pages.basePage;

public class SellingGuideTest extends basePage {
	
	Logger log = LogManager.getLogger(SellingGuideTest.class);
	
	@Test
	public void sellingGuide() {
		
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
