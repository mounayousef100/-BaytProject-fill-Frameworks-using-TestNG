package com.Bayt.HomeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Bayt.Base.Base;
import com.Bayt.HomePageOpject.FooterPage;

public class FooterTest extends Base {
	public WebDriver driver;
	private FooterPage footerPage;
	Logger log;

	@BeforeMethod
	public void OpenPage() throws IOException, InterruptedException {
		log = LogManager.getLogger(FooterTest.class.getName());
		driver = intializEDriver();
		driver.get(prop.getProperty("url"));
		log.debug("Navigated to application URL");

	}

	@AfterMethod
	public void Clouser() {
		 driver.quit();
		log.debug("Browser got closed");
	}

	@Test
	public void Footer() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		footerPage = new FooterPage(driver);
		footerPage.FindJobs();
		footerPage.AboutBaytCom();
	    footerPage.Company();
		footerPage.QuickLinks();
		footerPage.GettheBaytApp();
		footerPage.FollowBayCom();
		footerPage.AllRightsReserved();
		log.debug("clicked on About Us");

	}

}
