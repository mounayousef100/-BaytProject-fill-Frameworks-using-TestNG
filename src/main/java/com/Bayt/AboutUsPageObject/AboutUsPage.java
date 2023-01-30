package com.Bayt.AboutUsPageObject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Bayt.ActionDriver.Action;
import com.Bayt.Base.Base;

public class AboutUsPage {
	public WebDriver driver;
	Action action = new Action();

	public AboutUsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"yw3\"]/li[1]/a")
	private WebElement AboutUs;

	@FindBy(xpath = "/html/body/section[4]/div/div[1]/div[1]/div/div/a")
	private WebElement Clickjobs;

	public void AboutUs() throws IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.scrollByVisibilityOfElement(driver, AboutUs);
		Base.takeScreenshot(null, driver);
		Thread.sleep(2000);
		action.click(driver, AboutUs);
		Base.takeScreenshot(null, driver);

	}
}
