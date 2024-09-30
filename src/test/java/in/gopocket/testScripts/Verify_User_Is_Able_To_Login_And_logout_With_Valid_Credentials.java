package in.gopocket.testScripts;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import in.gopocket.generic.BaseClass;
import in.gopocket.generic.ListenersImplementation;
import in.gopocket.pom.Home;
import in.gopocket.pom.Lets_Get_Started;

@Listeners(ListenersImplementation.class)

public class Verify_User_Is_Able_To_Login_And_logout_With_Valid_Credentials extends BaseClass {

	Lets_Get_Started lg;
	Home h;

	@Test(priority = 1)
	public void login_With_Valid_Credentials() throws Exception {
		lg = new Lets_Get_Started(driver);
		h = new Home(driver);
		lg.getMobileNumbe_TB().sendKeys("9944338062");
		lg.getMobile_next_Btn().click();
		lg.getPassword_tb().sendKeys("India@711");
		lg.getPasswordNxt_btn().click();
		// enter otp
		String otp = "123789";
		for (int i = 0; i < 6; i++) {
			char data = otp.charAt(i);
			String value = Character.toString(data);
			int j = i + 1;
			driver.findElement(By.xpath("(//div[@id='verifyWebAuthOtp_input']//input)[" + j + "]")).sendKeys(value);
			Thread.sleep(1000);
		}
		// lg.getOtpNext_Btn().click();
		Thread.sleep(1000);
		h.getUnderstand_Btn().click();
		Thread.sleep(2000);
		boolean flag = h.getWelcome_txt().isDisplayed();
		if (flag) {
			Reporter.log("Successfully Logged In", flag);
		}
	}

	@Test(priority = 2)
	public void verify_LogOut() throws InterruptedException {
		h = new Home(driver);
		h.getProfile_icon().click();
		Thread.sleep(1000);
		h.getLogOut_link().click();
		Thread.sleep(1000);
		h.getConfirm_btn().click();
		Thread.sleep(2000);
		boolean flag = lg.getLetsGetStarted_Txt().isDisplayed();
		if (flag) {
			Reporter.log("Successfully Logged Out", flag);
		}
	}

}
