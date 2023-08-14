package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass_OpenCart {
	public static WebDriver driver;

	@FindBy(xpath = "(//a[text()='Features'])[1]")
	private WebElement Features;

	@FindBy(xpath = "//h3[text()='Affiliates']")
	private WebElement ScrolldownAffiliates1;

	@FindBy(xpath = "//h2[normalize-space()='Free to download and use']")
	private WebElement ScrollUpFree1;

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Unlimited everything']")
	private WebElement Unlimited;

	@FindBy(xpath = "//h3[normalize-space()='Downloadable Products Ready']")
	private WebElement ScrolldownDownloadable2;

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Customer']")
	private WebElement Customer;

	@FindBy(xpath = "//h2[normalize-space()='Filters']")
	private WebElement ScrollUpFilters2;

	@FindBy(xpath = "//h2[normalize-space()='Turn mail to your advantage']")
	private WebElement ScrolldownTurn3;

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Shipping, Payments and Reports']")
	private WebElement Shipping;

	@FindBy(xpath = "//h2[normalize-space()='Payment Gateways']")
	private WebElement ScrollUpPayment3;

	@FindBy(xpath = "//h2[normalize-space()='Sales reports']")
	private WebElement scrolldownSales4;

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Extensions']")
	private WebElement Extensions;

	@FindBy(xpath = "//h2[normalize-space()='OpenCart Extensions']")
	private WebElement scrollUpExtensions4;

	@FindBy(xpath = "//h2[normalize-space()='Partners around the world']")
	private WebElement scrollDownPartners5;

	@FindBy(xpath = "//a[normalize-space()='Mobile and SEO']")
	private WebElement MobileandSEO;

	@FindBy(xpath = "//h2[normalize-space()='Mobile/Tablet']")
	private WebElement ScrollUpMobile5;

	@FindBy(xpath = "//h2[normalize-space()='Guest and Registered user Checkout']")
	private WebElement scrollDownGuest6;

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Developer']")
	private WebElement Developer;

	@FindBy(xpath = "//h2[normalize-space()='Marketplace for third-party extensions']")
	private WebElement scrollUp6;

	@FindBy(xpath = "//h2[normalize-space()='Open-Source']")
	private WebElement scrolldown7;

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Admin']")
	private WebElement Admin;

	@FindBy(xpath = "//h2[normalize-space()='Administrator Dashboard']")
	private WebElement scrollUp7;

	@FindBy(xpath = "//img[@title='OpenCart - Features']")
	private WebElement homepage;
	
	
	@FindBy(xpath = "//ul[@class='nav navbar-nav']//a[normalize-space()='Demo']")
	private WebElement demopage;
	
	@FindBy(xpath = "//a[@href='http://demo.opencart.com/']")
	private WebElement viewstorefront;
	
	
	

	@FindBy(xpath = "//*[@id=\"narbar-menu\"]/ul/li[1]/a")
	private WebElement desktop;

	@FindBy(xpath = "//a[normalize-space()='Mac (1)']")
	private WebElement maxselect;

	@FindBy(xpath = "//div[@class='image']//img[@title='iMac']")
	private WebElement selectcomputer;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addtocart;

	@FindBy(xpath = "//div[@id='alert']")
	private WebElement clicktheitem;

	@FindBy(xpath = "//strong[normalize-space()='View Cart']") 
	private WebElement viewcart;
	
	
	@FindBy(xpath = "//button[@formaction='https://demo.opencart.com/index.php?route=checkout/cart|remove&language=en-gb']")
	private WebElement remove ;
	
	

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement continues;
	
	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle show']")
	private WebElement lapnotebook;
	

	@FindBy(xpath = "//*[@id=\"narbar-menu\"]/ul/li[3]/a")
	private WebElement component;

	@FindBy(xpath = "//a[normalize-space()='Monitors (2)']")
	private WebElement moniter;

	@FindBy(xpath = "//img[@title='Apple Cinema 30\"']")
	private WebElement apple;

	@FindBy(xpath = "//h3[normalize-space()='Available Options']")
	private WebElement avaliableoption;

	@FindBy(xpath = "//input[@id='input-option-value-5']")
	private WebElement radiobutton;

	@FindBy(xpath = "//input[@id='input-option-value-8']")
	private WebElement checkbox1;
	
	@FindBy(xpath = "//input[@id='input-option-value-9']")
	private WebElement checkbox2;
	
	@FindBy(xpath = "//input[@id='input-option-value-11']")
	private WebElement checkbox3;

	@FindBy(xpath = "//input[@id='input-option-208']")
	private WebElement textremove;

	@FindBy(xpath = "//*[@id=\"input-option-217\"]")
	private WebElement dropdownselect;

	@FindBy(xpath = "//*[@id=\"input-option-217\"]/option[4]")
	private WebElement selectgreen;

	@FindBy(xpath = "//textarea[@id='input-option-209']")
	private WebElement textarea;

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement qty;
	
	@FindBy(xpath = "//a[normalize-space()='Desktops']")
	private WebElement dsp1;
	
	
	//nxt
	
	@FindBy(xpath = "//*[@id=\"narbar-menu\"]/ul/li[4]/a")
	private WebElement tablet;
	
	@FindBy(xpath = "//select[@id='input-sort']")
	private WebElement defaults;
	
	@FindBy(xpath = "//*[@id=\"input-sort\"]/option[8]")
	private WebElement defaultvalue;
	
	@FindBy(xpath = "//*[@id=\"input-limit\"]")
	private WebElement show ;
	
	@FindBy(xpath = "//*[@id=\"input-limit\"]/option[4]")
	private WebElement showvalue;
	
	@FindBy(xpath = "//a[@class='nav-link'][normalize-space()='Phones & PDAs']")
	private WebElement phoneandpda ;
	
	
	@FindBy(xpath = "//img[@title='iPhone']")
	private WebElement clickiphone ;
	
	@FindBy(xpath = "//a[normalize-space()='Cameras']")
	private WebElement clickcamera ;
	

	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle'][normalize-space()='MP3 Players']")
	private WebElement mp3 ;
	

	@FindBy(xpath = "//a[normalize-space()='Show All MP3 Players']")
	private WebElement mp3folder ;
	
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/ul/li[1]/a")
	private WebElement clickeee ;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div/a")
	private WebElement continueeee  ;
	
	
	
	
	
	

	

	public PomClass_OpenCart(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getClickeee() {
		return clickeee;
	}


	public WebElement getContinueeee() {
		return continueeee;
	}


	public WebElement getMp3() {
		return mp3;
	}


	public WebElement getMp3folder() {
		return mp3folder;
	}


	public WebElement getTablet() {
		return tablet;
	}


	public WebElement getDefaults() {
		return defaults;
	}


	public WebElement getDefaultvalue() {
		return defaultvalue;
	}


	public WebElement getShow() {
		return show;
	}


	public WebElement getShowvalue() {
		return showvalue;
	}


	public WebElement getPhoneandpda() {
		return phoneandpda;
	}


	public WebElement getClickiphone() {
		return clickiphone;
	}


	public WebElement getClickcamera() {
		return clickcamera;
	}


	public WebElement getStore() {
		return getStore();
	}

	public WebElement getDemopage() {
		return getDemopage();
	}

	public WebElement getHomepage() {
		return homepage;
	}

	public WebElement getFeatures() {
		return Features;
	}

	
	public WebElement getViewstorefront() {
		return viewstorefront;
	}

	public WebElement getScrolldownAffiliates1() {
		return ScrolldownAffiliates1;
	}

	public WebElement getScrollUpFree1() {
		return ScrollUpFree1;
	}

	public WebElement getUnlimited() {
		return Unlimited;
	}

	public WebElement getScrolldownDownloadable2() {
		return ScrolldownDownloadable2;
	}

	public WebElement getCustomer() {
		return Customer;
	}

	public WebElement getScrollUpFilters2() {
		return ScrollUpFilters2;
	}

	public WebElement getScrolldownTurn3() {
		return ScrolldownTurn3;
	}

	public WebElement getShipping() {
		return Shipping;
	}

	public WebElement getScrollUpPayment3() {
		return ScrollUpPayment3;
	}

	public WebElement getScrolldownSales4() {
		return scrolldownSales4;
	}

	public WebElement getExtensions() {
		return Extensions;
	}

	public WebElement getScrollUpExtensions4() {
		return scrollUpExtensions4;
	}

	public WebElement getScrollDownPartners5() {
		return scrollDownPartners5;
	}

	public WebElement getMobileandSEO() {
		return MobileandSEO;
	}

	public WebElement getScrollUpMobile5() {
		return ScrollUpMobile5;
	}

	public WebElement getScrollDownGuest6() {
		return scrollDownGuest6;
	}

	public WebElement getDeveloper() {
		return Developer;
	}

	public WebElement getScrollUp6() {
		return scrollUp6;
	}

	public WebElement getScrolldown7() {
		return scrolldown7;
	}

	public WebElement getAdmin() {
		return Admin;
	}

	public WebElement getScrollUp7() {
		return scrollUp7;
	}
	public WebElement getLapnotebook() {
		return lapnotebook;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	

	public WebElement getDemopage1() {
		return demopage;
	}

	public WebElement getDesktop() {
		return desktop;
	}

	public WebElement getMaxselect() {
		return maxselect;
	}

	public WebElement getSelectcomputer() {
		return selectcomputer;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getClicktheitem() {
		return clicktheitem;
	}

	public WebElement getViewcart() {
		return viewcart;
	}

	public WebElement getContinues() {
		return continues;
	}

	public WebElement getComponent() {
		return component;
	}

	public WebElement getMoniter() {
		return moniter;
	}

	public WebElement getApple() {
		return apple;
	}

	public WebElement getAvaliableoption() {
		return avaliableoption;
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getCheckbox1() {
		return checkbox1;
	}

	public WebElement getCheckbox2() {
		return checkbox2;
	}

	public WebElement getCheckbox3() {
		return checkbox3;
	}

	public WebElement getTextremove() {
		return textremove;
	}

	public WebElement getDropdownselect() {
		return dropdownselect;
	}

	public WebElement getSelectgreen() {
		return selectgreen;
	}

	public WebElement getTextarea() {
		return textarea;
	}

	public WebElement getQty() {
		return qty;
	}
	public WebElement getRemove() {
		return remove;
	}


	public WebElement getDsp1() {
		return dsp1;
	}


}
