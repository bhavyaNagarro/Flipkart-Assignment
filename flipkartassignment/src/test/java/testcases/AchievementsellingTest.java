package testcases;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.basePage;
import pages.achievementSelling;

public class AchievementsellingTest extends basePage {
	
	Logger log = LogManager.getLogger(AchievementsellingTest.class);
	
	@Test
	public void achievementSelling() {
		
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
