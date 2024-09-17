package in.gopocket.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriver_Utility {
WebDriver driver;
	public WebDriver_Utility(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterOtp(String otp) throws InterruptedException
	{
		for (int i = 0; i < 6; i++) {
			char data = otp.charAt(i);
			String value = Character.toString(data);
			int j = i + 1;
			driver.findElement(By.xpath("(//div[@id='verifyWebAuthOtp_input']//input)[" + j + "]")).sendKeys(value);
		}
	}
	
	public void moveMouseOnElement(WebElement elementName)
	{
		Actions act = new Actions(driver);
		act.moveToElement(elementName).build().perform();
	}
	
}
