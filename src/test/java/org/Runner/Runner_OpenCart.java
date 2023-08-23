package org.Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\featurfile",glue = "org.stepdefination")
//@CucumberOptions(features = "src\\test\\java\\featurfile",glue = "org.stepdefination",dryRun=true,monochrome=false,tags="@Tag2")

public class Runner_OpenCart {

	public static WebDriver driver;

	@BeforeClass
	public static void start() {
	ChromeOptions chrome=new ChromeOptions();
	chrome.addArguments("--remote-allow-origns=*");
	driver=new ChromeDriver();
	
	}
}
