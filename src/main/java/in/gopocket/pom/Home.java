package in.gopocket.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.gopocket.generic.BaseClass;

public class Home extends BaseClass {

	@FindBy(id = "disclosure_submit_btn")
	private WebElement understand_Btn;

	@FindBy(xpath = "//div[contains(text(),'Good')]")
	private WebElement Welcome_txt;

	@FindBy(xpath = "//button[@class='user-details']/child::span")
	private WebElement profile_icon;

	@FindBy(id = "head_dropdown_logout")
	private WebElement logOut_link;

	@FindBy(id = "signout_modal_confirm_btn")
	private WebElement confirm_btn;

	@FindBy(id = "head_dropdown_username")
	private WebElement userName_txt;

	@FindBy(id = "head_navlink_settings")
	private WebElement profile_Setting;

	@FindBy(xpath = "//p[text()='Name']/following-sibling::p")
	private WebElement UserName_basicInfo;

	@FindBy(xpath = "//div[contains(@id,'scripMw')]/child::div/div[contains(@id,'mw_list_scripname')]")
	private List<WebElement> scriptNameList;

	@FindBy(id = "mw_search_input")
	private WebElement searchInput_TB;

	@FindBy(id = "mw_search_scripname")
	private WebElement searched_scriptName_tab;

	@FindBy(id = "Watchlist_order")
	private WebElement watchList_Link;

	@FindBy(xpath = "//span[text()='Orders']")
	private WebElement Orders_Link;

	public WebElement getWatchList_Link() {
		return watchList_Link;
	}

	public List<WebElement> getScriptNameList() {
		return scriptNameList;
	}

	public WebElement getSearchInput_TB() {
		return searchInput_TB;
	}

	public WebElement getOrders_Link() {
		return Orders_Link;
	}

	public WebElement getSearched_scriptName_tab() {
		return searched_scriptName_tab;
	}

	public WebElement getUserName_txt() {
		return userName_txt;
	}

	public WebElement getProfile_Setting() {
		return profile_Setting;
	}

	public WebElement getUserName_basicInfo() {
		return UserName_basicInfo;
	}

	public Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUnderstand_Btn() {
		return understand_Btn;
	}

	public WebElement getProfile_icon() {
		return profile_icon;
	}

	public WebElement getLogOut_link() {
		return logOut_link;
	}

	public WebElement getConfirm_btn() {
		return confirm_btn;
	}

	public WebElement getWelcome_txt() {
		return Welcome_txt;
	}

}
