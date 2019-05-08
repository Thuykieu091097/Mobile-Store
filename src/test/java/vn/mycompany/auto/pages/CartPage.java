package vn.mycompany.auto.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartPage extends PageObject {

	@FindBy(xpath = "//a[contains(text(),'Chọn sản phẩm')]")
	private WebElementFacade buttonChooseProduct;

	public void click_button_choose_a_product() {
		buttonChooseProduct.click();
	}

	
	@FindBy(id="add_to-cart")
	private WebElementFacade buttonAddToCart;
	
	public void click_add_to_cart() {
		buttonAddToCart.click();		
	}

	@FindBy(css=".wrapper-mini-cart > a")
	private WebElementFacade buttonCart;
	
	public void click_button_cart() {
		buttonCart.click();
		
	}

	@FindBy(css=".btn-success")
	private WebElementFacade buttonGoToOrder;
	
	public void click_button_go_to_order_to_pay() {
		buttonGoToOrder.click();
		
	}

	@FindBy(css=".btn-secondary")
	private WebElementFacade buttonBack;
	
	public void click_button_back() {
		buttonBack.click();
		
	}

	@FindBy(linkText="Delete")
	private WebElementFacade buttonDelete;
	
	public void click_button_delete() {
		buttonDelete.click();
		
	}

	@FindBy(name="qty")
	private WebElementFacade inputAmount;
	
	public void input_amount_products_need_buying(String number) {
		inputAmount.type(number);
		
	}

	@FindBy(name="qty")
	private WebElementFacade buttonChangeAmount;
	
	public void click_button_change_amount_products() {
		buttonChangeAmount.click();
		
	}


}
