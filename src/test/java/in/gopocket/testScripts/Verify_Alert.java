package in.gopocket.testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import in.gopocket.generic.BaseClass;
import in.gopocket.generic.FileLib;
import in.gopocket.generic.ListenersImplementation;
import in.gopocket.generic.WebDriver_Utility;
import in.gopocket.pom.Create_Alert;
import in.gopocket.pom.Home;
import in.gopocket.pom.Lets_Get_Started;

@Listeners(ListenersImplementation.class)
public class Verify_Alert extends BaseClass {

	@Test
	public void handel_Scrip_Alert() throws IOException, InterruptedException {
		Lets_Get_Started lg = new Lets_Get_Started(driver);
		FileLib f = new FileLib();
		Home h = new Home(driver);
		WebDriver_Utility wu = new WebDriver_Utility(driver);
		lg.getMobileNumbe_TB().sendKeys(f.getData_PropertyFile("MobileNumber"));
		lg.getMobile_next_Btn().click();
		lg.getPassword_tb().sendKeys(f.getData_PropertyFile("Password"));
		lg.getPasswordNxt_btn().click();
		wu.enterOtp(f.getData_PropertyFile("OTP"));
		h.getUnderstand_Btn().click();
		Thread.sleep(1000);
		h.getOrders_Link().click();
		Create_Alert ca = new Create_Alert(driver);
		Thread.sleep(1000);
		ca.getAlerts_Link().click();
		ca.getCreate_Alert_Btn().click();
		String scName = f.getData_PropertyFile("ScriptName");
		ca.getSearch_Input_Alert_TB().sendKeys(scName);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='" + scName + "']/ancestor::li")).click();
		ca.getAlertName_tb().sendKeys("High Priority");
		// select the drop dowmn
		ca.getCondition_dropdown().click();
		Select sec = new Select(ca.getCondition_dropdown());
		sec.selectByVisibleText("Less than (<)");
		ca.getValue_TxtBox().sendKeys("500");
		ca.getCreate_btn().click();
		String s = "Symbol";
		WebElement alert_Script = driver.findElement(By.xpath("//table//th[contains(text(), '" + s
				+ "')]/following::tr[1]/td[position() = count(//th[contains(text(), '" + s
				+ "')]/preceding-sibling::th) + 1]"));
		if (scName.equals(alert_Script.getText())) {
			System.out.println("Alert Created Successfully");
		}
		wu.moveMouseOnElement(alert_Script);
		ca.getCancel_btn().click();
		ca.getCancel_confirm_btn().click();
		Thread.sleep(1000);
		if (ca.getEmpty_Alert_txt().isDisplayed()) {
			System.out.println("Successfully Removed ");
		}

	}

}
