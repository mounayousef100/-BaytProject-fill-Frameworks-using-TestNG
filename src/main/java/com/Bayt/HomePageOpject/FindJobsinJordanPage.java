package com.Bayt.HomePageOpject;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import com.Bayt.ActionDriver.Action;

public class FindJobsinJordanPage {

	public WebDriver driver;
	Action action = new Action();
	SoftAssert mysoft = new SoftAssert();

	public FindJobsinJordanPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[normalize-space()='555']")
	private WebElement JobsNumberInAmmanHome;

	@FindBy(xpath = "//span[normalize-space()='555 Jobs Found']")
	private WebElement JobsNumberInAmman;

	@FindBy(xpath = "//a[@data-location='Amman']")
	private WebElement JobsInAmman;

	@FindBy(xpath = "//span[normalize-space()='6']")
	private WebElement JobsNumberInZarqaHome;

	@FindBy(xpath = "//span[normalize-space()='6 Jobs Found']")
	private WebElement JobsNumberInZarqa;

	@FindBy(xpath = "//a[@data-location='Zarqa']")
	private WebElement JobsinZarqa;

	public void JobsbyCity() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
		String numberInHome = action.getText(JobsNumberInAmmanHome);
		Thread.sleep(3000);
		action.JSClick(driver, JobsInAmman);

		String numberInAmman = action.getText(JobsNumberInAmman);
		boolean checkJobsinAmmanNumber = numberInAmman.contains(numberInHome);
		mysoft.assertEquals(checkJobsinAmmanNumber, true, "The number of Jobs in Amman mismatch");
		mysoft.assertAll();

		String jobTitleActualAmman = action.getTitle(driver);
		String jobTitleExpectedAmman = "Jobs in Amman (June 2023) - Bayt.com";
		Assert.assertEquals(jobTitleActualAmman, jobTitleExpectedAmman, "The job title in Amman mismatch");

		driver.navigate().back();
		String numberInZarqaHome = action.getText(JobsNumberInZarqaHome);

		action.JSClick(driver, JobsinZarqa);

		String numberInZarqa = action.getText(JobsNumberInZarqa);
		boolean checkJobsinZarqaNumber = numberInZarqa.contains(numberInZarqaHome);
		mysoft.assertEquals(checkJobsinZarqaNumber, true, "The number of Jobs in Zarqa mismatch");
		mysoft.assertAll();

		String jobTitleActualZarqa = action.getTitle(driver);
		String jobTitleExpectedZarqa = "Jobs in Zarqa (June 2023) - Bayt.com";
		Assert.assertEquals(jobTitleActualZarqa, jobTitleExpectedZarqa, "The job title in Zarqa mismatch");

	}

	
}
