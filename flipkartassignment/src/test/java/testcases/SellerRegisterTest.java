package testcases;

import org.testng.annotations.Test;
import org.apache.log4j.*;

import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.searchProduct;
import pages.sellerRegister;
import utilities.ReadingPropertiesFile;

public class SellerRegisterTest extends basePage {
	
	Logger log = LogManager.getLogger(SellerRegisterTest.class);
	
	@Test
	public void registerSeller() {
		
		//driver.findElement(sellerRegister.close_popup).click();
		//test.log(LogStatus.INFO, "Close Popup button got clicked");
		
		driver.findElement(sellerRegister.seller_page_register).click();
		test.log(LogStatus.INFO, "Seller Register Page Button got clicked");
		
		driver.findElement(sellerRegister.seller_loginBtn).click();
		test.log(LogStatus.INFO, "Seller Login button got clicked");
		
		driver.findElement(sellerRegister.seller_registerBtn).click();
		test.log(LogStatus.INFO, "Seller Register button got clicked");
		
		driver.findElement(sellerRegister.seller_mobile).sendKeys(ReadingPropertiesFile.getProperty("sellermobile"));
		test.log(LogStatus.INFO, "Seller Mobile number is input in the text box");
		
		driver.findElement(sellerRegister.seller_email).sendKeys(ReadingPropertiesFile.getProperty("username"));
		test.log(LogStatus.INFO, "Seller Email is input in the text box");
		
		driver.findElement(sellerRegister.seller_gst).sendKeys(ReadingPropertiesFile.getProperty("sellergst"));
		test.log(LogStatus.INFO, "Seller Gst is input in the text box");
		
		// logged the result in console
		log.info("Register the seller on flipkart testcase passed successfully.");
	}

}
