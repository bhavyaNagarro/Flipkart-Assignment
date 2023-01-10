package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;
import org.apache.log4j.*;

import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.productDetail;
import utilities.ReadingPropertiesFile;

public class ProductDetail extends basePage {
	
	Logger log = LogManager.getLogger(ProductDetail.class);
	
	@Test(priority=16)
	public void productDetail() throws Throwable {
		
		// ------------------------- Test Data from Excel File --------------------------------------
		if (ExcelData.isExecuteCase("productdetail").equalsIgnoreCase("no"))
            throw new SkipException("Skiped");
		
		//  ----------  Check if popup(login) appears automatically while running other tests, close the popup
		try {
			driver.findElement(productDetail.close_popup).click();
			test.log(LogStatus.INFO, "Close Popup button got clicked");
		}catch(Exception e) { }

		
		driver.findElement(productDetail.txt_username).sendKeys(ReadingPropertiesFile.getProperty("productName"));
		test.log(LogStatus.INFO, "Text is input in the text box");
		
		driver.findElement(productDetail.search_btn).click();
		test.log(LogStatus.INFO, "Search button got clicked");
		
		driver.findElement(productDetail.iphone_link).click();
		test.log(LogStatus.INFO, "Product detail link got clicked");
		
		// logged the result in console
		log.info("Search and then complete description of product on flipkart testcase passed successfully.");
	}

}
