package utilities;

import java.io.*;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShots {
	
	public static String takeScreenShot(WebDriver driver, String fileName) throws IOException {

		String screenshotFileName = System.getProperty("user.dir") + "\\screenshots\\"+fileName+System.currentTimeMillis()+".jpg";
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {

			FileUtils.copyFile(scrFile, new File(screenshotFileName));

		} catch (IOException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}
		return screenshotFileName;
	}
}
