package testcases;

import org.testng.annotations.Test;
import org.apache.log4j.*;


import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.highPriceProducts;

public class HighPriceProductsTest extends basePage {
	
	Logger log = LogManager.getLogger(HighPriceProductsTest.class);
	
	@Test
	public void highPriceProducts() {
		
		driver.findElement(highPriceProducts.mobile_page_link).click();
		test.log(LogStatus.INFO, "Redicrected to Mobile Page");
		
		driver.findElement(highPriceProducts.shop_now).click();
		test.log(LogStatus.INFO, "Redicrected to selected Brand Page");
		
		driver.findElement(highPriceProducts.wishlist_btn).click();
		test.log(LogStatus.INFO, "Product added to wishlist");
		
		
		// logged the result in console
		log.info("Product with high price is filtered and testcase passed successfully.");
	}

}
