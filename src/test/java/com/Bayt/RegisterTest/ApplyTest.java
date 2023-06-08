package com.Bayt.RegisterTest;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Bayt.Base.Base;
import com.Bayt.Dataprovider.ExcelDataProvider;
import com.Bayt.RegisterPageObject.ApplyPage;

public class ApplyTest extends Base {
	public WebDriver driver;
	private ApplyPage applyPage;

	@BeforeMethod
	public void OpenPage() throws IOException, InterruptedException {
		driver = intializEDriver();
		driver.get(prop.getProperty("url"));
	}

	@AfterMethod
	public void Clouser() {
	   driver.quit();
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
