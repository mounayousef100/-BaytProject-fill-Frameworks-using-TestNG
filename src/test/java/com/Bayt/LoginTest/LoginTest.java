package com.Bayt.LoginTest;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Bayt.Base.Base;
import com.Bayt.LoginPageOpject.LoginPage;


public class LoginTest extends Base {
	public WebDriver driver;
	private LoginPage  loginPage;

	@BeforeMethod
	public void OpenPage() throws IOException, InterruptedException {
		driver = intializEDriver();
		driver.get(prop.getProperty("url"));
	}

	@AfterMethod
	public void Clouser() {
		 driver.quit();
	}

	@Test()
	public void Logintest () throws IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		loginPage = new LoginPage(driver);
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

}
