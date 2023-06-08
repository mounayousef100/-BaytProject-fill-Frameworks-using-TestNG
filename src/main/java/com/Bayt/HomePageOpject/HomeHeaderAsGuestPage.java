package com.Bayt.HomePageOpject;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Bayt.ActionDriver.Action;

public class HomeHeaderAsGuestPage {
	public WebDriver driver;
	Action action = new Action();
	Logger log;

	public HomeHeaderAsGuestPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"yw0\"]/li[1]/a")
	private WebElement home;

	@FindBy(xpath = "//*[@id=\"baytLogo\"]/img")
	private WebElement logo;

	@FindBy(xpath = "//*[@id=\"yw0\"]/li[2]/a")
	private WebElement FindJobs;

	@FindBy(xpath = "//*[@id=\"yw0\"]/li[3]/a")
	private WebElement CreateYourCv;

	@FindBy(xpath = "//*[@id=\"yw2\"]/li[4]/a")
	private WebElement Blog;

	@FindBy(xpath = "//*[@id=\"yw0\"]/li[5]/a")
	private WebElement CvServices;

	@FindBy(xpath = "//*[@id=\"yw0\"]/li[9]/ul/li[1]/a")
	private WebElement Log;

	@FindBy(xpath = "//*[@id=\"yw2\"]/li[9]/ul/li[2]/a")
	private WebElement Register;

	@FindBy(xpath = "//*[@id=\"yw2\"]/li[9]/ul/li[4]/a")
	private WebElement ForEmployers;

	@FindBy(xpath = "//*[@id=\"yw2\"]/li[10]/ul/li[2]/a")
	private WebElement ProductsBy;

	@FindBy(xpath = "//*[@id=\"en-language\"]")
	private WebElement Arabic;

	@FindBy(xpath = "//*[@id=\"ar-language\"]")
	private WebElement English;
	
	
	
	public void HeaderTest() throws Throwable {
		log = LogManager.getLogger(HomeHeaderAsGuestPage.class.getName());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.click(driver, home);
		action.JSClick(driver, logo);
		log.debug("Navigated to logo");
		String expectedUrllogo = "https://www.bayt.com/en/jordan/";
		String actualUrllogo = action.getCurrentURL(driver);
		Assert.assertEquals(actualUrllogo, expectedUrllogo, "URL mismatch");
		action.click(driver, FindJobs);
		String expectedUrlFindJobs = "https://www.bayt.com/en/jordan/jobs/search/";
		String actualUrlFindJobs = action.getCurrentURL(driver);
		Assert.assertEquals(actualUrlFindJobs, expectedUrlFindJobs, "URL mismatch");
		log.debug("Navigated to FindJobs");
		action.click(driver, CreateYourCv);
		String expectedUrlCreateYourCv = "https://www.bayt.com/en/register-j/?native_source=CreateYourCV";
		String actualUrlCreateYourCv = action.getCurrentURL(driver);
		Assert.assertEquals(actualUrlCreateYourCv, expectedUrlCreateYourCv, "URL mismatch");
		
	
		action.JSClick(driver, Blog);
		String expectedUrlBlog = "https://www.bayt.com/en/blog/";
		String actualUrlBlog = action.getCurrentURL(driver);
		Assert.assertEquals(actualUrlBlog, expectedUrlBlog, "URL mismatch");
		action.click(driver, CvServices);
		String expectedUrlCvServices = "https://www.bayt.com/en/cv-writing/?native_source=CVW-top-menu";
		String actualUrlCvServices = action.getCurrentURL(driver);
		Assert.assertEquals(actualUrlCvServices, expectedUrlCvServices, "URL mismatch");
		action.JSClick(driver, Log);
		String expectedUrlLog = "https://www.bayt.com/en/login/";
		String actualUrlLog = action.getCurrentURL(driver);
		Assert.assertEquals(actualUrlLog, expectedUrlLog, "URL mismatch");
		action.JSClick(driver, Register);
		String expectedUrlRegister = "https://www.bayt.com/en/register-j/";
		String actualUrlRegister = action.getCurrentURL(driver);
		Assert.assertEquals(actualUrlRegister, expectedUrlRegister, "URL mismatch");
		action.JSClick(driver, ForEmployers);
		String expectedUrlForEmployers = "https://business.bayt.com/jo/";
		String actualUrlForEmployers = action.getCurrentURL(driver);
		Assert.assertEquals(actualUrlForEmployers, expectedUrlForEmployers, "URL mismatch");
		driver.navigate().back();
		action.JSClick(driver, ProductsBy);
		action.JSClick(driver, Arabic);
		log.debug("Navigated to Arabic");
		Thread.sleep(2000);
		action.findElement(driver, English);
	}	
	
}
