package pages;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utilities.ExtentManager;
import utilities.ReadingPropertiesFile;
import utilities.ScreenShots;

public class basePage {
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	ChromeOptions option = new ChromeOptions();
	FirefoxOptions option1 = new FirefoxOptions();
	EdgeOptions option2 = new EdgeOptions();
	
	Logger log = LogManager.getLogger(basePage.class);
	
	
	@BeforeSuite
	public void setup() {
		
		String browserName = ReadingPropertiesFile.getProperty("browser");
		
		// --------------------  mode on which testcase run ie. headless and non-headless  ----------------------------
		option.addArguments(ReadingPropertiesFile.getProperty("mode"));
				
		
		// -----------------------  setting path for drivers  -----------------------------------------------------
		if(browserName.toLowerCase().equals("chrome")) {
			System.setProperty(ReadingPropertiesFile.getProperty("chromeProperty"), System.getProperty("user.dir") + ReadingPropertiesFile.getProperty("chromePath"));
			driver = new ChromeDriver(option);
		} else if(browserName.toLowerCase().equals("firefox")) {
			System.setProperty(ReadingPropertiesFile.getProperty("firefoxProperty"), System.getProperty("user.dir") + ReadingPropertiesFile.getProperty("firefoxPath"));
			driver = new FirefoxDriver(option1);
		} else if(browserName.toLowerCase().equals("edge")) {
			System.setProperty(ReadingPropertiesFile.getProperty("edgeProperty"), System.getProperty("user.dir") + ReadingPropertiesFile.getProperty("edgePath"));
			driver = new EdgeDriver(option2);
		} else {
			System.out.println("No browser name is provided.");
		}

		
		// ---------------------  Maximize the window and use implicit wait ------------------------------------------------
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		
		
		// ------------------------------------  Extent Report  ---------------------------------------------
		extent = ExtentManager.getInstance("reports//Extent_Report.html");
	}

	
	// ------------------------------------- Reading Properties file ----------------------------------------- 
	@BeforeTest
	public void navigateToURL() {
		// navigating to application
		driver.get(ReadingPropertiesFile.getProperty("url"));
	}
	
	
	@BeforeMethod
	public void startTest(Method method) {
		test = extent.startTest(method.getName());
	}
	
	@AfterMethod
	public void status(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.SUCCESS)
			test.log(LogStatus.PASS, "Test case got passed");
		else if (result.getStatus()==ITestResult.FAILURE) {
			String str = ScreenShots.takeScreenShot(driver, result.getTestContext().getName());
			test.log(LogStatus.ERROR, result.getThrowable());
			test.log(LogStatus.FAIL, test.addScreenCapture(str));
			log.info("Screenshot capured on Failure");
		}
		extent.flush();
	}
	
	
	@AfterSuite
	public void tearDown() {
		// quitting the driver
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.quit();
	}
}
