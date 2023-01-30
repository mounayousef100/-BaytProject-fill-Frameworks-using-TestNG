package com.Bayt.MainTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Bayt.Base.Base;
import com.Bayt.Dataprovider.ExcelDataProvider;
import com.Bayt.MainPageObject.LoginPage;

public class LoginTest extends Base {
	public WebDriver driver;
	private LoginPage loginPage;

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
	public void EasyApply(String Country, String Cty) throws IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		loginPage = new LoginPage(driver);
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

}
