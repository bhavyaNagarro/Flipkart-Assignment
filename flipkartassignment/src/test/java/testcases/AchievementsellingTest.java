package testcases;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.achievementSelling;

public class AchievementsellingTest extends basePage {
	
	Logger log = LogManager.getLogger(AchievementsellingTest.class);
	
	@Test(priority=13)
	public void achievementSelling() throws Throwable {
		
		// ------------------------- Test Data from Excel File --------------------------------------
		if (ExcelData.isExecuteCase("achievements").equalsIgnoreCase("no"))
            throw new SkipException("Skiped");
		
		//  ----------  Check if popup(login) appears automatically while running other tests, close the popup
		try {
			driver.findElement(achievementSelling.close_popup).click();
			test.log(LogStatus.INFO, "Close Popup button got clicked");
		}catch(Exception e) { }
		
		
		driver.findElement(achievementSelling.seller_page).click();
		test.log(LogStatus.INFO, "Seller Button got clicked");
		
		driver.findElement(achievementSelling.resources_link).click();
		test.log(LogStatus.INFO, "Resources Button got clicked");
		
		driver.findElement(achievementSelling.achievement_selling).click();
		test.log(LogStatus.INFO, "Achievements Button got clicked");
		
		// logged the result in console
		log.info("Sellers achievements section on flipkart testcase passed successfully.");
	}
	
}
