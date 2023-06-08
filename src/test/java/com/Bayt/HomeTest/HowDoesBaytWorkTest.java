package com.Bayt.HomeTest;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Bayt.Base.Base;
import com.Bayt.HomePageOpject.HowDoesBaytWorkPage;

public class HowDoesBaytWorkTest extends Base{
	public WebDriver driver;
	private HowDoesBaytWorkPage howDoesBaytWorkPage;

	@BeforeMethod
	public void OpenPage() throws IOException {
		driver = intializEDriver();
		driver.get(prop.getProperty("url"));
	}

	@AfterMethod
	public void Clouser() {

		driver.quit();

	}

	@Test()
	public void FindJobsTest() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		howDoesBaytWorkPage = new HowDoesBaytWorkPage(driver);
		howDoesBaytWorkPage.videoOpen();
	}
}
