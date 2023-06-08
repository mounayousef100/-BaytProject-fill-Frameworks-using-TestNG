package com.Bayt.HomeTest;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Bayt.Base.Base;
import com.Bayt.HomePageOpject.HomeHeaderAsGuestPage;



public class HomeHeaderAsGestTest extends Base{

	private HomeHeaderAsGuestPage homeHeaderAsGuestPage ;
	
	
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
	public void HeaderLinks() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		homeHeaderAsGuestPage = new HomeHeaderAsGuestPage(driver);
		homeHeaderAsGuestPage.HeaderTest();
		
	}
	
	
	
	
	
	
	
	
	
}
