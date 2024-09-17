package in.gopocket.testScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import in.gopocket.generic.BaseClass;
import in.gopocket.generic.ListenersImplementation;
import in.gopocket.generic.WebDriver_Utility;
import in.gopocket.pom.Home;
import in.gopocket.pom.Lets_Get_Started;

@Listeners(ListenersImplementation.class)
public class Validate_Login_Functionality extends BaseClass {

	@Test(priority = 1)
	public void Login_with_InvalidCredentials() {
		Lets_Get_Started lg = new Lets_Get_Started(driver);
		lg.getMobileNumbe_TB().sendKeys("9944338062");
		lg.getMobile_next_Btn().click();
		lg.getPassword_tb().sendKeys("India@710");
		lg.getPasswordNxt_btn().click();
		boolean flag = lg.getInvalid_UN_ErrorMessage().isDisplayed();
		if (flag) {
			Reporter.log("Successfully validated Error_Message", true);
		}
	}

	@Test(priority = 2)
	public void Login_with_ValidCredentials() throws InterruptedException {
		Lets_Get_Started lg = new Lets_Get_Started(driver);
		lg.getPassword_tb().clear();
		lg.getPassword_tb().sendKeys("India@711");
		lg.getPasswordNxt_btn().click();
		boolean flag = lg.getEnter_Otp_Txt().isDisplayed();
		if (flag) {
			Reporter.log("Successfully Logined In", true);
		}
	}
}
