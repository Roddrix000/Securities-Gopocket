package in.gopocket.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orders {

	@FindBy(id = "order_header")
	private WebElement orders_Link;

	@FindBy(id = "Basket_order")
	private WebElement basket_link;

	@FindBy(id = "create_Basket")
	private WebElement create_basket_link;

	@FindBy(id = "create_bas_basketname_input")
	private WebElement Enter_basket_name_TB;

	@FindBy(id = "create_bas_create_btn")
	private WebElement create_btn;

	@FindBy(id = "Hellp_view_btn")
	private WebElement view_button;

	@FindBy(id = "basket_search_input")
	private WebElement search_for_script_and_in_this_basket_TB;

	@FindBy(id = "ow_place_order_btn")
	private WebElement add_button;

	@FindBy(id = "//button[contains(@id,'basket_m_td_0_deletescrip')]")
	private WebElement delete_btn;

	@FindBy(id = "basket_close_btn")
	private WebElement close_btn;

	@FindBy(id = "Del_scrip_confirm_btn")
	private WebElement delete_confirm_BTN;

	public Orders(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrders_Link() {
		return orders_Link;
	}

	public WebElement getBasket_link() {
		return basket_link;
	}

	public WebElement getCreate_basket_link() {
		return create_basket_link;
	}

	public WebElement getEnter_basket_name_TB() {
		return Enter_basket_name_TB;
	}

	public WebElement getCreate_btn() {
		return create_btn;
	}

	public WebElement getView_button() {
		return view_button;
	}

	public WebElement getSearch_for_script_and_in_this_basket_TB() {
		return search_for_script_and_in_this_basket_TB;
	}

	public WebElement getAdd_button() {
		return add_button;
	}

	public WebElement getDelete_btn() {
		return delete_btn;
	}

	public WebElement getClose_btn() {
		return close_btn;
	}

	public WebElement getDelete_confirm_BTN() {
		return delete_confirm_BTN;
	}

}
