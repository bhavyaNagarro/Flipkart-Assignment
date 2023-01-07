package testcases;

import org.testng.annotations.Test;
import org.apache.log4j.*;


import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.grocerySection;
import utilities.ReadingPropertiesFile;

public class GrocerySectionTest extends basePage {
	
	Logger log = LogManager.getLogger(GrocerySectionTest.class);
	
	@Test
	public void grocerySectionTest() {
		
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
