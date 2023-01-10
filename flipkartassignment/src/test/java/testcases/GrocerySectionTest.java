package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;
import org.apache.log4j.*;


import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.grocerySection;
import utilities.ReadingPropertiesFile;

public class GrocerySectionTest extends basePage {
	
	Logger log = LogManager.getLogger(GrocerySectionTest.class);
	
	@Test(priority=3)
	public void grocerySectionTest() throws Throwable {
		
		// ------------------------- Test Data from Excel File --------------------------------------
		if (ExcelData.isExecuteCase("grocery").equalsIgnoreCase("no"))
            throw new SkipException("Skiped");
		
		
		//  ----------  Check if popup(login) appears automatically while running other tests, close the popup
		try {
			driver.findElement(grocerySection.close_popup).click();
			test.log(LogStatus.INFO, "Close Popup button got clicked");
		}catch(Exception e) { }
		
		driver.findElement(grocerySection.grocery_link).click();
		test.log(LogStatus.INFO, "Grocery button got clicked");
		
		driver.findElement(grocerySection.search_grocery).sendKeys(ReadingPropertiesFile.getProperty("groceryName"));
		test.log(LogStatus.INFO, "Text is input in the text box");
		
		driver.findElement(grocerySection.grocery_search_button).click();
		test.log(LogStatus.INFO, "Search button clicked");
		
		
		// logged the result in console
		log.info("Grocery Section on flipkart testcase passed successfully.");
	}
	
}
