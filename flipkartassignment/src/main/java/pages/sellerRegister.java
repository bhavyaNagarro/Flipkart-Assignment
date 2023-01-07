package pages;

import org.openqa.selenium.By;

public class sellerRegister {
	
	public static By close_popup = By.xpath("//button[contains(text(),'✕')]");
	
	public static By seller_page_register = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/a[1]/span[1]");
	
	public static By seller_loginBtn = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]");
	
	public static By seller_registerBtn = By.xpath("//span[contains(text(),'Register for new account')]");
	
	public static By seller_mobile = By.xpath("//body/div[@id='app-container']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/input[1]");
	
	public static By seller_email = By.xpath("//body/div[@id='app-container']/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/input[1]");
	
	public static By seller_gst = By.xpath("//body/div[@id='app-container']/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/input[1]");
	
}
