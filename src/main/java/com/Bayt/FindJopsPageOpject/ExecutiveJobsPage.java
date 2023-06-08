package com.Bayt.FindJopsPageOpject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.Bayt.ActionDriver.Action;

public class ExecutiveJobsPage {
	public WebDriver driver;
	Action action = new Action();
	SoftAssert mysoft = new SoftAssert();

	public ExecutiveJobsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"yw0\"]/li[2]")
	private WebElement FindJops; 
	
	@FindBy(xpath = "//*[@id=\"yw0\"]/li[2]/ul/li[6]/a")
	private WebElement ExecutiveJobs; 
	
	@FindBy( xpath = "//input[@id='text_search']")
	private WebElement jobTitle;

	@FindBy(xpath = "//button[@id='search_icon_submit']")
	private WebElement ButtonSearch;

	@FindBy(xpath = "//a[normalize-space()='Quality Assurance Team Lead']")
	private List<WebElement> Search ;

	public void SearchJobs() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.mouseover(driver, ExecutiveJobs);
		action.typestring(jobTitle, "quality assurance");
		action.JSClick(driver, ButtonSearch);
		for (int i = 0; i < Search.size(); i++) {
			String result = Search.get(i).getText();
			System.out.println( result);
			boolean checkSearch = result.contains("quality assurance")|| result.contains("quality")||result.contains("Quality Assurance")||result.contains("Assurance");
			mysoft.assertEquals(checkSearch, true, "check Search successfully");
			mysoft.assertAll();
		}

	}
}
