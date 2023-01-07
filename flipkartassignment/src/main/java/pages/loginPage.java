package pages;

import org.openqa.selenium.By;

public class loginPage {
	
	public static By txt_username = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]");
	
	public static By requestOtpBtn = By.xpath("//button[contains(text(),'Request OTP')]");
}
