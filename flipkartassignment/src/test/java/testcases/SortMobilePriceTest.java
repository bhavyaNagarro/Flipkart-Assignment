package testcases;

import org.testng.annotations.Test;
import org.apache.log4j.*;

import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.sortMobilePrice;

public class SortMobilePriceTest extends basePage {
	
	Logger log = LogManager.getLogger(SortMobilePriceTest.class);
	
	@Test
	public void sortMobilePriceTest() {
		
		driver.findElement(sortMobilePrice.mobile_page_link).click();
		test.log(LogStatus.INFO, "Redicrected to Mobile Page");
		
		driver.findElement(sortMobilePrice.shop_now).click();
		test.log(LogStatus.INFO, "Redicrected to selected Brand Page");
		
		driver.findElement(sortMobilePrice.sort_price_link).click();
		test.log(LogStatus.INFO, "Redicrected to selected Brand Page");
		
		// logged the result in console
		log.info("Mobile Price filtered on flipkart testcase passed successfully.");
		
	}
}
