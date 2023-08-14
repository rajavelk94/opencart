//package org.pom;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class Demopom_openkart {
//	public static WebDriver driver;
//
//	@FindBy(xpath = "//ul[@class='nav navbar-nav']//a[normalize-space()='Demo']")
//	private WebElement demopage;
//
//	@FindBy(xpath = "//a[normalize-space()='Desktops']")
//	private WebElement desktop;
//
//	@FindBy(xpath = "//a[normalize-space()='Mac (1)']")
//	private WebElement maxselect;
//
//	@FindBy(xpath = "//div[@class='image']//img[@title='iMac']")
//	private WebElement selectcomputer;
//
//	@FindBy(xpath = "//button[@id='button-cart']")
//	private WebElement addtocart;
//
//	@FindBy(xpath = "//div[@id='alert']")
//	private WebElement clicktheitem;
//
//	@FindBy(xpath = "//strong[normalize-space()='View Cart']") 
//	private WebElement viewcart;
//	
//	
//	@FindBy(xpath = "//button[@formaction='https://demo.opencart.com/index.php?route=checkout/cart|remove&language=en-gb']")
//	private WebElement remove ;
//	
//	
//
//	@FindBy(xpath = "//a[@class='btn btn-primary']")
//	private WebElement continues;
//	
//	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle show']")
//	private WebElement lapnotebook;
//	
//
//	@FindBy(xpath = "//a[normalize-space()='Components']")
//	private WebElement component;
//
//	@FindBy(xpath = "//a[normalize-space()='Monitors (2)']")
//	private WebElement moniter;
//
//	@FindBy(xpath = "//img[@title='Apple Cinema 30\"']")
//	private WebElement apple;
//
//	@FindBy(xpath = "//h3[normalize-space()='Available Options']")
//	private WebElement avaliableoption;
//
//	@FindBy(xpath = "[@id='input-option-value-6']")
//	private WebElement radiobutton;
//
//	@FindBy(xpath = "//input[@id='input-option-value-8']")
//	private WebElement checkbox1;
//	
//	@FindBy(xpath = "//input[@id='input-option-value-9']")
//	private WebElement checkbox2;
//	
//	@FindBy(xpath = "//input[@id='input-option-value-11']")
//	private WebElement checkbox3;
//
//	@FindBy(xpath = "//input[@id='input-option-208']")
//	private WebElement textremove;
//
//	@FindBy(xpath = "//select[@id='input-option-217']")
//	private WebElement dropdownselect;
//
//	@FindBy(xpath = "//*[@id=\"input-option-217\"]/option[4]")
//	private WebElement selectgreen;
//
//	@FindBy(xpath = "//textarea[@id='input-option-209']")
//	private WebElement textarea;
//
//	@FindBy(xpath = "//input[@id='input-quantity']")
//	private WebElement qty;
//	
//	
//
//	public Demopom_openkart(WebDriver driver1) {
//		this.driver = driver1;
//		PageFactory.initElements(driver, this);
//	}
//
//	public WebElement getLapnotebook() {
//		return lapnotebook;
//	}
//
//	public static WebDriver getDriver() {
//		return driver;
//	}
//
//	public static void setDriver(WebDriver driver) {
//		Demopom_openkart.driver = driver;
//	}
//
//	public WebElement getDemopage() {
//		return demopage;
//	}
//
//	public WebElement getDesktop() {
//		return desktop;
//	}
//
//	public WebElement getMaxselect() {
//		return maxselect;
//	}
//
//	public WebElement getSelectcomputer() {
//		return selectcomputer;
//	}
//
//	public WebElement getAddtocart() {
//		return addtocart;
//	}
//
//	public WebElement getClicktheitem() {
//		return clicktheitem;
//	}
//
//	public WebElement getViewcart() {
//		return viewcart;
//	}
//
//	public WebElement getContinues() {
//		return continues;
//	}
//
//	public WebElement getComponent() {
//		return component;
//	}
//
//	public WebElement getMoniter() {
//		return moniter;
//	}
//
//	public WebElement getApple() {
//		return apple;
//	}
//
//	public WebElement getAvaliableoption() {
//		return avaliableoption;
//	}
//
//	public WebElement getRadiobutton() {
//		return radiobutton;
//	}
//
//	public WebElement getCheckbox1() {
//		return checkbox1;
//	}
//
//	public WebElement getCheckbox2() {
//		return checkbox2;
//	}
//
//	public WebElement getCheckbox3() {
//		return checkbox3;
//	}
//
//	public WebElement getTextremove() {
//		return textremove;
//	}
//
//	public WebElement getDropdownselect() {
//		return dropdownselect;
//	}
//
//	public WebElement getSelectgreen() {
//		return selectgreen;
//	}
//
//	public WebElement getTextarea() {
//		return textarea;
//	}
//
//	public WebElement getQty() {
//		return qty;
//	}
//	public WebElement getRemove() {
//		return remove;
//	}
//
//
//}
