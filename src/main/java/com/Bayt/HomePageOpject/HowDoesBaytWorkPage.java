package com.Bayt.HomePageOpject;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import com.Bayt.ActionDriver.Action;

public class HowDoesBaytWorkPage {
	public WebDriver driver;
	Action action = new Action();
	SoftAssert mysoft = new SoftAssert();

	public HowDoesBaytWorkPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "play-button")
	private WebElement video;

	public void videoOpen() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.findElement(driver, video);
		action.JSClick(driver, video);
		boolean videoOpen = action.findElement(driver, video);
		if (videoOpen != true) {
			System.out.println("This video is Opened");
		}
	}

}
