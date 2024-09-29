package in.gopocket.pom;

import java.awt.print.PageFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Alert {

	@FindBy(id = "Alerts_order")
	private WebElement Alerts_Link;

	@FindBy(id = "create_alert_btn")
	private WebElement create_Alert_Btn;

	@FindBy(xpath = "//div[text()='Create Alert']/..//input[contains(@placeholder,'Search ')]")
	private WebElement search_Input_Alert_TB;

	@FindBy(xpath = "//select[@id='condition']")
	private WebElement condition_dropdown;

	@FindBy(xpath = "//button[text()='Create']")
	private WebElement create_btn;

	@FindBy(xpath = "//input[@id='alertName']")
	private WebElement alertName_tb;

	@FindBy(xpath = "//button[text()='Cancel']")
	private WebElement cancel_btn;

	@FindBy(id = "calcel_alert_confirm_btn")
	private WebElement Cancel_confirm_btn;

	@FindBy(id = "create_alert_text")
	private WebElement empty_Alert_txt;
	
	
	@FindBy(xpath="//input[@id='value']")
	private WebElement Value_TxtBox;
	
	
	public WebElement getValue_TxtBox() {
		return Value_TxtBox;
	}

	public Create_Alert(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAlerts_Link() {
		return Alerts_Link;
	}

	public WebElement getCreate_Alert_Btn() {
		return create_Alert_Btn;
	}

	public WebElement getSearch_Input_Alert_TB() {
		return search_Input_Alert_TB;
	}

	public WebElement getCondition_dropdown() {
		return condition_dropdown;
	}

	public WebElement getCreate_btn() {
		return create_btn;
	}

	public WebElement getAlertName_tb() {
		return alertName_tb;
	}

	public WebElement getCancel_btn() {
		return cancel_btn;
	}

	public WebElement getCancel_confirm_btn() {
		return Cancel_confirm_btn;
	}

	public WebElement getEmpty_Alert_txt() {
		return empty_Alert_txt;
	}
}
