package in.gopocket.testScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import in.gopocket.generic.BaseClass;
import in.gopocket.generic.ListenersImplementation;
import in.gopocket.generic.WebDriver_Utility;
import in.gopocket.pom.Home;
import in.gopocket.pom.Lets_Get_Started;

@Listeners(ListenersImplementation.class)

public class Validate_UserName_In_Home_And_ProfilePage extends BaseClass {

	@Test
	public void validateUserName() throws InterruptedException {
		Lets_Get_Started lg = new Lets_Get_Started(driver);
		lg.getMobileNumbe_TB().sendKeys("9944338062");
		lg.getMobile_next_Btn().click();
		lg.getPassword_tb().sendKeys("India@711");
		lg.getPasswordNxt_btn().click();
		WebDriver_Utility wu = new WebDriver_Utility(driver);
		wu.enterOtp("123789");
		Home h = new Home(driver);
		h.getUnderstand_Btn().click();
		Thread.sleep(1000);
		h.getProfile_icon().click();
		String HomePage_Name = h.getUserName_txt().getText();
		h.getProfile_Setting().click();
		String BasicPage_Name = h.getUserName_basicInfo().getText();
		if (HomePage_Name.equals(BasicPage_Name)) {
			System.out.println("Same Name is Validate");
		}

	}

}
