package com.Bayt.RegisterandApplyTest;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Bayt.Base.Base;
import com.Bayt.RegisterandApplyPageObject.CheekEmailRlready;

public class CheekEmailRlreadyTest extends Base {
	public WebDriver driver;
	private CheekEmailRlready cheekEmailRlready;

	@BeforeMethod
	public void OpenPage() throws IOException, InterruptedException {
		driver = intializEDriver();
		driver.get(prop.getProperty("url"));
	}

	@AfterMethod
	public void Clouser() {
		// driver.quit();
	}

	@Test
	public void EasyApply() throws IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		cheekEmailRlready = new CheekEmailRlready(driver);
		cheekEmailRlready.CheekEmailRlread();
		String actMassage = cheekEmailRlready.CheekMassage().getText();
		String ExpectMassage = "This email is already registered.";
		AssertJUnit.assertEquals(actMassage, ExpectMassage);

	}

}
