package in.gopocket.testScripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import in.gopocket.generic.BaseClass;
import in.gopocket.generic.FileLib;
import in.gopocket.generic.ListenersImplementation;
import in.gopocket.generic.WebDriver_Utility;
import in.gopocket.pom.Home;
import in.gopocket.pom.Lets_Get_Started;
import in.gopocket.pom.Orders;

@Listeners(ListenersImplementation.class)
public class Verify_Basket_Functionality extends BaseClass {

	@Test
	public void create_Basket() throws IOException, InterruptedException {
		Lets_Get_Started lg = new Lets_Get_Started(driver);
		Home h = new Home(driver);
		Orders o = new Orders(driver);
		FileLib f = new FileLib();
		WebDriver_Utility wu = new WebDriver_Utility(driver);
		lg.getMobileNumbe_TB().sendKeys(f.getData_PropertyFile("MobileNumber"));
		lg.getMobile_next_Btn().click();
		lg.getPassword_tb().sendKeys(f.getData_PropertyFile("Password"));
		lg.getPasswordNxt_btn().click();
		wu.enterOtp(f.getData_PropertyFile("OTP"));
		Thread.sleep(3000);
		wu.wait_Until("visible", h.getUnderstand_Btn());
		h.getUnderstand_Btn().click();
		wu.wait_Until("visible", o.getOrders_Link());
		o.getOrders_Link().click();
		wu.wait_Until("visible", o.getBasket_link());
		o.getBasket_link().click();
		wu.wait_Until("visible", o.getCreate_basket_link());
		o.getCreate_basket_link().click();
		wu.wait_Until("visible", o.getCreate_btn());
		o.getCreate_btn().click();
		Thread.sleep(1000);
		o.getEnter_basket_name_TB().sendKeys(f.getData_PropertyFile("ScriptName"));
		o.getCreate_btn().click();
		wu.wait_Until("visible", o.getCreate_Confirm_Notification());
		assertTrue(o.getCreate_Confirm_Notification().isDisplayed(), "Failed to create");
		WebElement scripName = driver
				.findElement(By.xpath("//span[@name='" + f.getData_PropertyFile("ScriptName") + "']"));
		wu.moveMouseOnElement(scripName);
		o.getDelete_Redbtn().click();
		Thread.sleep(1000);
		o.getDelete_confirm_BTN().click();
		wu.wait_Until("visible", o.getDelete_Confirm_Notification());
		assertTrue(o.getDelete_Confirm_Notification().isDisplayed(), "Failed to Delete");
	}
}
