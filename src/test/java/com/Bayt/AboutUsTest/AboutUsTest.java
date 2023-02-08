package com.Bayt.AboutUsTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Bayt.AboutUsPageObject.AboutUsPage;
import com.Bayt.Base.Base;

public class AboutUsTest extends Base {
	public WebDriver driver;
	private AboutUsPage aboutUsPage;

	@BeforeMethod
	public void OpenPage() throws IOException, InterruptedException {
		driver = intializEDriver();
		driver.get(prop.getProperty("url"));

	}

	@AfterMethod
	public void Clouser() {
		 driver.quit();
	}

	@Test
	public void AboutUs() throws IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		aboutUsPage = new AboutUsPage(driver);
		Base.takeScreenshot(null, driver);
		aboutUsPage.AboutUs();
		Base.takeScreenshot(null, driver);
		// log.debug("clicked on About Us");

	}

}
