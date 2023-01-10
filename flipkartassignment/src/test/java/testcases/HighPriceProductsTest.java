package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;
import org.apache.log4j.*;


import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.highPriceProducts;

public class HighPriceProductsTest extends basePage {
	
	Logger log = LogManager.getLogger(HighPriceProductsTest.class);
	
	@Test(priority=10)
	public void highPriceProducts() throws Throwable {
		
		// ------------------------- Test Data from Excel File --------------------------------------
		if (ExcelData.isExecuteCase("highprice").equalsIgnoreCase("no"))
            throw new SkipException("Skiped");
		
		//  ----------  Check if popup(login) appears automatically while running other tests, close the popup
		try {
			driver.findElement(highPriceProducts.close_popup).click();
			test.log(LogStatus.INFO, "Close Popup button got clicked");
		}catch(Exception e) { }
		
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
