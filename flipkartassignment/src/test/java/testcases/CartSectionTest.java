package testcases;

import org.apache.log4j.*;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.cartSection;

public class CartSectionTest extends basePage {
	
	Logger log = LogManager.getLogger(CartSectionTest.class);
	
	@Test
	public void cartSectionTest() {
		
		driver.findElement(cartSection.cart_btn).click();
		test.log(LogStatus.INFO, "Cart Button got clicked");
		
		// logged the result in console
		log.info("Cart section on flipkart testcase passed successfully.");
	}

}
