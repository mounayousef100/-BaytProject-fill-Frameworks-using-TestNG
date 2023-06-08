package com.Bayt.FindJopsTest;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Bayt.Base.Base;
import com.Bayt.FindJopsPageOpject.ExecutiveJobsPage;


public class ExecutiveJobsTest extends Base {
	public WebDriver driver;
	private ExecutiveJobsPage executiveJobsPage;
	
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
	public void Footer() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		executiveJobsPage = new ExecutiveJobsPage(driver);
	    executiveJobsPage.SearchJobs();
	

	}
}
