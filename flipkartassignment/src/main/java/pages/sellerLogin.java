package pages;

import org.openqa.selenium.By;

public class sellerLogin {
	
	public static By close_popup = By.xpath("//button[contains(text(),'✕')]");
	
	public static By seller_page_login = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/a[1]/span[1]");
	
	public static By seller_login_button = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]");
	
	public static By seller_mobile_number = By.xpath("//body/div[@id='app']/div[3]/section[1]/section[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]");
	
}
