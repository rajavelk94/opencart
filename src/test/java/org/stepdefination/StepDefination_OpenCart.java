package org.stepdefination;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.Runner.Runner_OpenCart;
import org.base.BaseClass_OpenCart;
import org.openqa.selenium.WebDriver;
import org.pom.PomClass_OpenCart;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefination_OpenCart extends BaseClass_OpenCart {
	
	

	public static void tohold(WebDriver driver, int value) {
		
	}
	
	
	

	public static WebDriver driver = Runner_OpenCart.driver;
	public static PomClass_OpenCart open_app = new PomClass_OpenCart(driver);
	
     
	@Given("To enter the URL")
	public void to_enter_the_url() {
		get_url(driver, "https://www.opencart.com");
	}

	@Given("To maximize the window")
	public void to_maximize_the_window() {
		window_maximum(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}

	@When("user click an features")
	public void user_click_an_features() throws InterruptedException, IOException {
		open_app.getFeatures().click();
		scroll_down(driver, open_app.getScrolldownAffiliates1());
		screen_shot(driver, "img1") ;
		

		
	}

	@When("user click an unlimaited")
	public void user_click_an_unlimaited() throws InterruptedException {
		open_app.getUnlimited().click();
		scroll_Up(driver, open_app.getScrollUpFree1());
		
		scroll_down(driver, open_app.getScrolldownDownloadable2());

	}

	@When("user click an Customer")
	public void user_click_an_customer() throws InterruptedException, IOException {
		open_app.getCustomer().click();
		scroll_Up(driver, open_app.getScrollUpFilters2());
		screen_shot(driver, "img2");
		scroll_down(driver, open_app.getScrolldownTurn3());

	}

	@When("user click an ShippingPaymentsandReports")
	public void user_click_an_shipping_paymentsand_reports() throws InterruptedException {
		open_app.getShipping().click();
		scroll_Up(driver, open_app.getScrollUpPayment3());
		scroll_down(driver, open_app.getScrolldownSales4());
	}

	@When("user click an Extensions")
	public void user_click_an_extensions() throws InterruptedException, IOException {
		open_app.getExtensions().click();
		screen_shot(driver, "img3");
		scroll_Up(driver, open_app.getScrollUpExtensions4());
		scroll_down(driver, open_app.getScrollDownPartners5());
	}

	@When("user click an Mobile&SEO")
	public void user_click_an_mobile_seo() throws InterruptedException {
		open_app.getMobileandSEO().click();
		scroll_Up(driver, open_app.getScrollUpMobile5());
		scroll_down(driver, open_app.getScrollDownGuest6());
	}

	@When("user click an Developer")
	public void user_click_an_developer() throws IOException, InterruptedException {
		open_app.getDeveloper().click();
		scroll_down(driver, open_app.getScrolldown7());
		screen_shot(driver, "img4");
	}

	@When("user click an Admin")
	public void user_click_an_admin() throws IOException {
		open_app.getAdmin().click();
		scroll_Up(driver, open_app.getScrollUp7());
		screen_shot(driver, "image1");

	}

	@When("user click the homepage")
	public void user_click_the_homepage() throws InterruptedException {

		open_app.getHomepage().click();
	}


	@When("to click the demopage")
	public void to_click_the_demopage() {
		open_app.getDemopage1().click();
	}




	@When("user click the store")
	public void user_click_the_store() throws InterruptedException, IOException {
	
		open_app.getViewstorefront().click();
		screen_shot(driver, "img5");
	

	}

	@When("user navigate the desktop")
	public void user_navigate_the_desktop() throws InterruptedException, IOException {
	
		Set<String> setmethod =driver.getWindowHandles();
		Iterator<String> iteratorvalue =setmethod.iterator();
		String parent =iteratorvalue.next();
		String child =iteratorvalue.next();
		driver.switchTo().window(child);
		open_app.getDsp1().click();
		screen_shot(driver, "img6");

	
		

	}

	@When("user click the macbook")
	public void user_click_the_macbook() throws InterruptedException {
		open_app.getMaxselect().click();

	}

	@When("add the product to kart and scrollup")
	public void add_the_product_to_kart_and_scrollup() throws InterruptedException, IOException {
		open_app.getSelectcomputer().click();
		screen_shot(driver, "img7");
		scroll_down(driver, open_app.getAddtocart());
		open_app.getAddtocart().click();

	}

	@When("to click the item")
	public void to_click_the_item() throws InterruptedException {
		scroll_Up(driver, open_app.getClicktheitem());
		open_app.getClicktheitem().click();
		
		
	}
 

	@When("to click the component")
	public void to_click_the_component() {

		open_app.getComponent().click();
	}

	@When("use click the moniter")
	public void use_click_the_moniter() throws IOException {
		open_app.getMoniter().click();
		screen_shot(driver, "img8");
	}

	@When("to click apple")
	public void to_click_apple() {

		open_app.getApple().click();
	}

	@When("to click the avaliable option")
	public void to_click_the_avaliable_option() throws InterruptedException, IOException {
		scroll_down(driver, open_app.getAvaliableoption());
		screen_shot(driver, "img9");
		
	}

	@When("To click the radio button")
	public void to_click_the_radio_button() throws InterruptedException {
		open_app.getRadiobutton().click();
	}

	@When("To click the checkbox")
	public void to_click_the_checkbox() throws InterruptedException, IOException {
		open_app.getCheckbox1().click();
		open_app.getCheckbox2().click();
		screen_shot(driver, "img10");
		open_app.getCheckbox3().click();
	}

	@When("To click textarea")
	public void to_click_textarea() {
		//q.getRemove().clear();
		open_app.getTextremove().clear();
		open_app.getTextremove().sendKeys("rajavel");
	}

	@When("To click dropdownselect")
	public void to_click_dropdownselect() throws IOException {
		open_app.getDropdownselect().click();
		screen_shot(driver, "img11");
		open_app.getSelectgreen().click();
	}

	@When("To click bigtext")
	public void to_click_bigtext() {
		open_app.getTextarea().sendKeys("i known the concept of cucumber framework");
		scroll_down(driver, open_app.getQty());
		
	}

	@When("To click qty")
	public void to_click_qty() throws InterruptedException, IOException {

		open_app.getQty().clear();
		open_app.getQty().sendKeys("567");
		screen_shot(driver, "img12");
		scroll_Up(driver,open_app.getDesktop() );
		
	}
	

	@When("to click the tablet")
	public void to_click_the_tablet() {
		
		open_app.getTablet().click();
	}
	@When("to click the defaults")
	public void to_click_the_defaults() throws IOException {
		
		open_app.getDefaults().click();
		screen_shot(driver, "img13");
	}
	@When("to click the defaultvalue")
	public void to_click_the_defaultvalue() {
		open_app.getDefaultvalue().click();
	}
	@When("to click the show")
	public void to_click_the_show() throws IOException {
		open_app.getShow().click();
		screen_shot(driver, "img14");
	}
	@When("to click the show value")
	public void to_click_the_show_value() {
		open_app.getShowvalue().click();
	}
	@When("to click the phone and pda")
	public void to_click_the_phone_and_pda() {
		open_app.getPhoneandpda().click();
	}
	@When("to click the iphone")
	public void to_click_the_iphone() throws IOException {
		open_app.getClickiphone().click();
		screen_shot(driver, "img15");
	}
	@When("to click the camera")
	public void to_click_the_camera() {
		open_app.getClickcamera().click();
	}
	@When("to click the mp3")
	public void to_click_the_mp3() throws IOException {
		open_app.getMp3().click();
	screen_shot(driver, "img16");
	}
	@When("show the folder")
	public void show_the_folder() {
		open_app.getMp3folder().click();
		open_app.getClickeee().click();
		open_app.getContinueeee().click();
	}




}
