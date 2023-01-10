package testcases;

import org.apache.log4j.*;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.cartSection;

public class CartSectionTest extends basePage {
	
	Logger log = LogManager.getLogger(CartSectionTest.class);
	
	@Test(priority=17)
	public void cartSectionTest() throws Throwable {
		
		// ------------------------- Test Data from Excel File --------------------------------------
		if (ExcelData.isExecuteCase("cartsection").equalsIgnoreCase("no"))
            throw new SkipException("Skiped");
		
		
		//  ----------  Check if popup(login) appears automatically while running other tests, close the popup
		try {
			driver.findElement(cartSection.close_popup).click();
			test.log(LogStatus.INFO, "Close Popup button got clicked");
		}catch(Exception e) { }

		
		driver.findElement(cartSection.cart_btn).click();
		test.log(LogStatus.INFO, "Cart Button got clicked");
		
		// logged the result in console
		log.info("Cart section on flipkart testcase passed successfully.");
	}

}
