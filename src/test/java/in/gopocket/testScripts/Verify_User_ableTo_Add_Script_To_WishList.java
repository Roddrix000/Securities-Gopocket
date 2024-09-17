package in.gopocket.testScripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import in.gopocket.generic.BaseClass;
import in.gopocket.generic.FileLib;
import in.gopocket.generic.WebDriver_Utility;
import in.gopocket.pom.Home;
import in.gopocket.pom.Lets_Get_Started;

public class Verify_User_ableTo_Add_Script_To_WishList extends BaseClass {
	String scriptName;
	WebDriver_Utility wu;
	Lets_Get_Started lb;
	Home h;

	@Test(priority = 1)
	public void addTo_WishList() throws IOException, Exception {
		lb = new Lets_Get_Started(driver);
		FileLib fl = new FileLib();
		wu = new WebDriver_Utility(driver);
		lb.getMobileNumbe_TB().sendKeys(fl.getData_PropertyFile("MobileNumber"));
		lb.getMobile_next_Btn().click();
		lb.getPassword_tb().sendKeys(fl.getData_PropertyFile("Password"));
		lb.getPasswordNxt_btn().click();
		wu.enterOtp(fl.getData_PropertyFile("OTP"));
		h = new Home(driver);
		h.getUnderstand_Btn().click();
		Thread.sleep(2000);
		List<WebElement> pre_scriptList = h.getScriptNameList();
		scriptName = fl.getData_PropertyFile("ScriptName");
		for (WebElement ele : pre_scriptList) {
			if (ele.getText().equals(scriptName)) {
				System.out.println("Script Already Present");
				break;
			}
		}
		h.getSearchInput_TB().sendKeys(scriptName);
		h.getSearched_scriptName_tab().click();
		wu.moveMouseOnElement(h.getWatchList_Link());
		Thread.sleep(2000);
		List<WebElement> post_scriptList = h.getScriptNameList();
		for (WebElement ele : post_scriptList) {
			if (ele.getText().equals(scriptName)) {
				System.out.println(scriptName + " Script Added Successfully");
				break;
			}
		}

	}

	@Test(priority = 2)
	public void remove_From_WatchList() throws InterruptedException {
		Thread.sleep(2000);
		WebElement deleteScript = driver.findElement(By.xpath("(//div[text()='" + scriptName
				+ "']/..//following-sibling::div)[last()]//child::button[contains(@id,'delete')]"));
		WebElement firstScriptTab = driver.findElement(By.id("mw_list_scripname_0"));
		wu.moveMouseOnElement(firstScriptTab);
		deleteScript.click();
		List<WebElement> post_scriptList = h.getScriptNameList();
		int i = 0;
		wu.moveMouseOnElement(h.getWatchList_Link());
		Thread.sleep(2000);
		for (WebElement ele : post_scriptList) {
			if (ele.getText().equals(scriptName)) {
				i++;
			}
		}
		if (i == 0) {

			System.out.println(scriptName + " Deleted Successfully");

		} else {
			System.out.println("Element is not deleted");
		}

	}

}
