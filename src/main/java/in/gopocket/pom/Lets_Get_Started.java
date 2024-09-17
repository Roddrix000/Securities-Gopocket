package in.gopocket.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.gopocket.generic.BaseClass;

public class Lets_Get_Started extends BaseClass{

	@FindBy(id = "password_stage")
	private WebElement letsGetStarted_Txt;

	@FindBy(id = "mobileNo_input")
	private WebElement mobileNumbe_TB;

	@FindBy(id = "mobileNo_submit_btn")
	private WebElement Mobile_next_Btn;

	@FindBy(xpath = "//div[@id='password_stage']/../child::div[2]//div[contains(text(),'RAGHU')]")
	private WebElement AccOwnerName_txt;

	@FindBy(id = "password_input")
	private WebElement password_tb;

	@FindBy(id = "password_submit_btn")
	private WebElement passwordNxt_btn;

	@FindBy(xpath = "//div[@id='verifyWebAuthOtp_input']//input")
	private WebElement Otp_tb;

	@FindBy(id = "verifyWebAuthOtp_submit_btn")
	private WebElement OtpNext_Btn;
	
	@FindBy(id="login_errorMsg")
	private WebElement Invalid_UN_ErrorMessage;
	
	@FindBy(xpath="//label[text()='Enter OTP ']")
	private WebElement Enter_Otp_Txt; 

	public WebElement getEnter_Otp_Txt() {
		return Enter_Otp_Txt;
	}

	public WebElement getInvalid_UN_ErrorMessage() {
		return Invalid_UN_ErrorMessage;
	}

	public Lets_Get_Started(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLetsGetStarted_Txt() {
		return letsGetStarted_Txt;
	}

	public WebElement getMobileNumbe_TB() {
		return mobileNumbe_TB;
	}

	public WebElement getMobile_next_Btn() {
		return Mobile_next_Btn;
	}

	public WebElement getAccOwnerName_txt() {
		return AccOwnerName_txt;
	}

	public WebElement getPassword_tb() {
		return password_tb;
	}

	public WebElement getPasswordNxt_btn() {
		return passwordNxt_btn;
	}

	public WebElement getOtp_tb() {
		return Otp_tb;
	}

	public WebElement getOtpNext_Btn() {
		return OtpNext_Btn;
	}

}
