package testcases;

import org.apache.log4j.*;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.topOffers;

public class TopOffersTest extends basePage {
	
	Logger log = LogManager.getLogger(TopOffersTest.class);
	
	@Test
	public void topOffers() {
		
		
		driver.findElement(topOffers.topoffer_link).click();
		test.log(LogStatus.INFO, "Redicrected to Top offers Page");
		
		
		// logged the result in console
		log.info("Top Offers on flipkart testcase passed successfully.");
	}

}
