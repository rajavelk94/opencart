package org.stepdefination;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.Runner.Runner_OpenCart;
import org.base.BaseClass_OpenCart;
import org.openqa.selenium.WebDriver;
import org.pom.PomClass_OpenCart;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefination_OpenCart extends BaseClass_OpenCart {

	public static WebDriver driver = Runner_OpenCart.driver;
	public static PomClass_OpenCart q = new PomClass_OpenCart(driver);
	// public static Demopom_openkart l = new Demopom_openkart(driver);

	@Given("To enter the URL")
	public void to_enter_the_url() {
		url(driver, "https://www.opencart.com");
	}

	@Given("To maximize the window")
	public void to_maximize_the_window() {
		max(driver);
	}

	@When("user click an features")
	public void user_click_an_features() throws InterruptedException, IOException {
		q.getFeatures().click();
		scrolldown(driver, q.getScrolldownAffiliates1());
		screenshot(driver, "img1");
		Thread.sleep(2000);
	}

	@When("user click an unlimaited")
	public void user_click_an_unlimaited() throws InterruptedException {
		q.getUnlimited().click();
		scrollUp(driver, q.getScrollUpFree1());
		
		scrolldown(driver, q.getScrolldownDownloadable2());
		Thread.sleep(2000);

	}

	@When("user click an Customer")
	public void user_click_an_customer() throws InterruptedException, IOException {
		q.getCustomer().click();
		scrollUp(driver, q.getScrollUpFilters2());
		screenshot(driver, "img2");
		scrolldown(driver, q.getScrolldownTurn3());
		Thread.sleep(2000);

	}

	@When("user click an ShippingPaymentsandReports")
	public void user_click_an_shipping_paymentsand_reports() throws InterruptedException {
		q.getShipping().click();
		scrollUp(driver, q.getScrollUpPayment3());
		scrolldown(driver, q.getScrolldownSales4());
		Thread.sleep(2000);
	}

	@When("user click an Extensions")
	public void user_click_an_extensions() throws InterruptedException, IOException {
		q.getExtensions().click();
		screenshot(driver, "img3");
		scrollUp(driver, q.getScrollUpExtensions4());
		scrolldown(driver, q.getScrollDownPartners5());
		Thread.sleep(2000);
	}

	@When("user click an Mobile&SEO")
	public void user_click_an_mobile_seo() throws InterruptedException {
		q.getMobileandSEO().click();
		scrollUp(driver, q.getScrollUpMobile5());
		scrolldown(driver, q.getScrollDownGuest6());
		Thread.sleep(2000);
	}

	@When("user click an Developer")
	public void user_click_an_developer() throws IOException, InterruptedException {
		q.getDeveloper().click();
		scrolldown(driver, q.getScrolldown7());
		screenshot(driver, "img4");
		Thread.sleep(2000);
	}

	@When("user click an Admin")
	public void user_click_an_admin() throws IOException {
		q.getAdmin().click();
		scrollUp(driver, q.getScrollUp7());
		screenshot(driver, "image1");

	}

	@When("user click the homepage")
	public void user_click_the_homepage() throws InterruptedException {

		q.getHomepage().click();
		Thread.sleep(5000);
	}


	@When("to click the demopage")
	public void to_click_the_demopage() {
		q.getDemopage1().click();
	}




	@When("user click the store")
	public void user_click_the_store() throws InterruptedException, IOException {
	
		q.getViewstorefront().click();
		screenshot(driver, "img5");
	

	}

	@When("user navigate the desktop")
	public void user_navigate_the_desktop() throws InterruptedException, IOException {
	
		Set<String> ji =driver.getWindowHandles();
		Iterator<String> ite =ji.iterator();
		String parent =ite.next();
		String child =ite.next();
		driver.switchTo().window(child);
		q.getDsp1().click();
		Thread.sleep(3000);
		screenshot(driver, "img6");

	
		

	}

	@When("user click the macbook")
	public void user_click_the_macbook() throws InterruptedException {
		q.getMaxselect().click();
		Thread.sleep(3000);

	}

	@When("add the product to kart and scrollup")
	public void add_the_product_to_kart_and_scrollup() throws InterruptedException, IOException {
		q.getSelectcomputer().click();
		Thread.sleep(3000);
		screenshot(driver, "img7");
		scrolldown(driver, q.getAddtocart());
		q.getAddtocart().click();
		Thread.sleep(3000);

	}

	@When("to click the item")
	public void to_click_the_item() throws InterruptedException {
		scrollUp(driver, q.getClicktheitem());
		q.getClicktheitem().click();
		Thread.sleep(2000);
		
		
	}
 

	@When("to click the component")
	public void to_click_the_component() {

		q.getComponent().click();
	}

	@When("use click the moniter")
	public void use_click_the_moniter() throws IOException {
		q.getMoniter().click();
		screenshot(driver, "img8");
	}

	@When("to click apple")
	public void to_click_apple() {

		q.getApple().click();
	}

	@When("to click the avaliable option")
	public void to_click_the_avaliable_option() throws InterruptedException, IOException {
		scrolldown(driver, q.getAvaliableoption());
		screenshot(driver, "img9");
		Thread.sleep(3000);
		
	}

	@When("To click the radio button")
	public void to_click_the_radio_button() throws InterruptedException {
		q.getRadiobutton().click();
		Thread.sleep(3000);
	}

	@When("To click the checkbox")
	public void to_click_the_checkbox() throws InterruptedException, IOException {
		q.getCheckbox1().click();
		q.getCheckbox2().click();
		screenshot(driver, "img10");
		q.getCheckbox3().click();
		Thread.sleep(2000);
	}

	@When("To click textarea")
	public void to_click_textarea() {
		//q.getRemove().clear();
		q.getTextremove().clear();
		q.getTextremove().sendKeys("rajavel");
	}

	@When("To click dropdownselect")
	public void to_click_dropdownselect() throws IOException {
		q.getDropdownselect().click();
		screenshot(driver, "img11");
		q.getSelectgreen().click();
	}

	@When("To click bigtext")
	public void to_click_bigtext() {
		q.getTextarea().sendKeys("i known the concept of cucumber framework");
		scrolldown(driver, q.getQty());
		
	}

	@When("To click qty")
	public void to_click_qty() throws InterruptedException, IOException {

		q.getQty().clear();
		q.getQty().sendKeys("567");
		screenshot(driver, "img12");
		scrollUp(driver,q.getDesktop() );
		Thread.sleep(5000);
		
	}
	

	@When("to click the tablet")
	public void to_click_the_tablet() {
		
		q.getTablet().click();
	}
	@When("to click the defaults")
	public void to_click_the_defaults() throws IOException {
		
		q.getDefaults().click();
		screenshot(driver, "img13");
	}
	@When("to click the defaultvalue")
	public void to_click_the_defaultvalue() {
		q.getDefaultvalue().click();
	}
	@When("to click the show")
	public void to_click_the_show() throws IOException {
		q.getShow().click();
		screenshot(driver, "img14");
	}
	@When("to click the show value")
	public void to_click_the_show_value() {
		q.getShowvalue().click();
	}
	@When("to click the phone and pda")
	public void to_click_the_phone_and_pda() {
		q.getPhoneandpda().click();
	}
	@When("to click the iphone")
	public void to_click_the_iphone() throws IOException {
		q.getClickiphone().click();
		screenshot(driver, "img15");
	}
	@When("to click the camera")
	public void to_click_the_camera() {
		q.getClickcamera().click();
	}
	@When("to click the mp3")
	public void to_click_the_mp3() throws IOException {
	q.getMp3().click();
	screenshot(driver, "img16");
	}
	@When("show the folder")
	public void show_the_folder() {
		q.getMp3folder().click();
		q.getClickeee().click();
		q.getContinueeee().click();
	}




}
