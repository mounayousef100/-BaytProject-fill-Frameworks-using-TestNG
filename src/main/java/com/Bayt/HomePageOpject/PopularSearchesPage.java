											package com.Bayt.HomePageOpject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Bayt.ActionDriver.Action;

public class PopularSearchesPage {

	public WebDriver driver ;
	Action action = new Action();
	
	
	public  PopularSearchesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "")
	private WebElement  Driver;
	
	
	
	public void header() {
		
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		
	
	}
	
	
	
	
	
	
	
	
}
