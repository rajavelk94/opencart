package org.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass_OpenCart {
	public static WebDriver driver;

	public static void get_url(WebDriver driver, String value) {
		driver.get(value);
	}
	public static void window_maximum(WebDriver driver) {
		driver.manage().window().maximize();

	}
	public static void elementClick(WebElement element) {
		element.click();
	}
	
	public static void input_value(WebElement element, String value) {

		element.sendKeys(value);
	}
	
	public static void element_clear(WebElement element) {
		element.clear();
	}
	
	public static void move_to_element(WebElement element, WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	
	public static void element_navigate(WebDriver driver) {
		driver.navigate();
	}

	public static void element_switch_to(WebDriver driver) {
		TargetLocator switchToelement = driver.switchTo();
		System.out.println(switchToelement);
	}
	
	public static void Drop_Down(WebElement element, String value) {
		Select ob = new Select(element);
		ob.selectByValue(value);
	}
	public static void scroll_down(WebDriver driver,WebElement element) {
		JavascriptExecutor java_executor=(JavascriptExecutor)driver;
		java_executor.executeScript("arguments[0].scrollIntoView()",element);
		
	
	}
		
	public static void scroll_Up(WebDriver driver,WebElement element) {
		JavascriptExecutor java_executor=(JavascriptExecutor)driver;
		java_executor.executeScript("arguments[0].scrollIntoView(false)",element);
	}
	
	public static void screen_shot(WebDriver driver, String picname) throws IOException {
		TakesScreenshot snapshot = (TakesScreenshot) driver;
		File source = snapshot.getScreenshotAs(OutputType.FILE);
		File destination =new File("C:\\Users\\rajav\\git\\opencart_webApplication\\snapshot"+picname+".png");
		FileUtils.copyFile(source,destination);
	}
	
	public static void tohold(WebDriver driver, int value) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(value));
	}
	
	
	 public void explictwait() {
	        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); // Wait up to 10 seconds
	        WebElement welcomeMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("welcomeMessage")));
	    }
	
}
