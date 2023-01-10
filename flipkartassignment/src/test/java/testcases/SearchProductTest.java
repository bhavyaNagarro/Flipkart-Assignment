package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;
import org.apache.log4j.*;

import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.loginPage;
import pages.searchProduct;
import utilities.ReadingPropertiesFile;

public class SearchProductTest extends basePage {
	
	Logger log = LogManager.getLogger(SearchProductTest.class);
	
	@Test(priority=2)
	public void search() throws Throwable {
		
		// ------------------------- Test Data from Excel File --------------------------------------
		if (ExcelData.isExecuteCase("searchproduct").equalsIgnoreCase("no"))
            throw new SkipException("Skiped");
		
		//  ----------  Check if popup(login) appears automatically while running other tests, close the popup
		try {
			driver.findElement(searchProduct.close_popup).click();
			test.log(LogStatus.INFO, "Close Popup button got clicked");
		}catch(Exception e) { }

		driver.findElement(searchProduct.close_popup).click();
		test.log(LogStatus.INFO, "Close Popup button got clicked");
		
		driver.findElement(searchProduct.txt_username).sendKeys(ReadingPropertiesFile.getProperty("productName"));
		test.log(LogStatus.INFO, "Text is input in the text box");
	
		driver.findElement(searchProduct.search_btn).click();
		test.log(LogStatus.INFO, "Search button got clicked");
		
		test.log(LogStatus.PASS, "Test case got passed");
		
		// logged the result in console
		log.info("Search a product on flipkart testcase passed successfully.");
	}

}
