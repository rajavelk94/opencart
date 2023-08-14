package org.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass_OpenCart {
	public static WebDriver driver;

	public static void url(WebDriver driver, String s) {
		driver.get(s);
	}
	public static void max(WebDriver driver) {
		driver.manage().window().maximize();

	}
	public static void Click(WebElement w) {
		w.click();
	}
	
	public static void pass(WebElement d, String e) {

		d.sendKeys(e);
	}
	
	public static void clear(WebElement e) {
		e.clear();
	}
	
	public static void movetoelement(WebElement a, WebDriver d) {
		Actions ac = new Actions(d);
		ac.moveToElement(a).build().perform();
	}
	
	public static void navigate(WebDriver d) {
		d.navigate();
	}

	public static void switchto(WebDriver driver) {
		TargetLocator switchTo = driver.switchTo();
		System.out.println(switchTo);
	}
	
	public static void DropDown(WebElement e, String s) {
		Select ob = new Select(e);
		ob.selectByValue(s);
	}
	public static void scrolldown(WebDriver driver,WebElement webele) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",webele);
		
	
	}
		
	public static void scrollUp(WebDriver driver,WebElement webele) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)",webele);
	}
	
	public static void screenshot(WebDriver driver, String picname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sr = ts.getScreenshotAs(OutputType.FILE);
		File destination =new File("C:\\Users\\rajav\\eclipse-workspace\\rajavel\\Java_Selinium\\OpenCart_Demo\\screenshot"+picname+".png");
		FileUtils.copyFile(sr,destination);
	}
	
	
}
