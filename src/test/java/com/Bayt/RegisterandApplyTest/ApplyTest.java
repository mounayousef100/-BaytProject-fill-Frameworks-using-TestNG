package com.Bayt.RegisterandApplyTest;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Bayt.Base.Base;
import com.Bayt.Dataprovider.ExcelDataProvider;
import com.Bayt.RegisterandApplyPageObject.ApplyPage;

public class ApplyTest extends Base {
	public WebDriver driver;
	Random Random = new Random();
	int index = Random.nextInt(6);
	int upperbound = 1000;
	int int_random = Random.nextInt(upperbound);
	private ApplyPage applyPage;

	@BeforeMethod
	public void OpenPage() throws IOException, InterruptedException {
		driver = intializEDriver();
		driver.get(prop.getProperty("url"));
	}

	@AfterMethod
	public void Clouser() {
		// driver.quit();
	}

	@Test(dataProvider = "ApplyPage", dataProviderClass = ExcelDataProvider.class)
	public void EasyApply(String Country, String Cty) throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		applyPage = new ApplyPage(driver);
		applyPage.Aplly();
		applyPage.TellUsAboutyourself();
		applyPage.Addexperience();
		applyPage.Addeducation(Country, Cty);
		applyPage.YourPreFerredjob();

	}

}
