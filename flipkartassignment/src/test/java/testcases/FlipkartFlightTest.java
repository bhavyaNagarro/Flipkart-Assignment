package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;
import org.apache.log4j.*;

import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.flipkartFlights;

public class FlipkartFlightTest extends basePage {
	
	Logger log = LogManager.getLogger(FlipkartFlightTest.class);
	
	@Test
	public void flipkartFlight() throws Throwable {
		
		// ------------------------- Test Data from Excel File --------------------------------------
		if (ExcelData.isExecuteCase("flipkartflights").equalsIgnoreCase("no"))
            throw new SkipException("Skiped");
		
		
		//  ----------  Check if popup(login) appears automatically while running other tests, close the popup
		try {
			driver.findElement(flipkartFlights.close_popup).click();
			test.log(LogStatus.INFO, "Close Popup button got clicked");
		}catch(Exception e) { }
		
		driver.findElement(flipkartFlights.flight_page_link).click();
		test.log(LogStatus.INFO, "Redicrected to Flights Page");
		
		driver.findElement(flipkartFlights.flight_discount).click();
		test.log(LogStatus.INFO, "Discount Link got clicked");
		
		// logged the result in console
		log.info("Flights section on flipkart testcase failed successfully.");
	}

}
