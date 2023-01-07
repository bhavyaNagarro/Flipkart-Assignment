package testcases;

import org.testng.annotations.Test;
import org.apache.log4j.*;

import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.flipkartFlights;

public class FlipkartFlightTest extends basePage {
	
	Logger log = LogManager.getLogger(FlipkartFlightTest.class);
	
	@Test
	public void flipkartFlight() {
		
		driver.findElement(flipkartFlights.flight_page_link).click();
		test.log(LogStatus.INFO, "Redicrected to Flights Page");
		
		driver.findElement(flipkartFlights.flight_discount).click();
		test.log(LogStatus.INFO, "Discount Link got clicked");
		
		// logged the result in console
		log.info("Flights section on flipkart testcase failed successfully.");
	}

}
