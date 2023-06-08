package com.Bayt.HomeTest;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Bayt.Base.Base;
import com.Bayt.HomePageOpject.PopularSearchesPage;




public class PopularSearchesTest extends Base{
 
	public WebDriver driver ;
	private  PopularSearchesPage popularSearchesPage;
	
	@BeforeMethod 
	public void OpenPage() throws IOException {
		driver = intializEDriver();
		driver.get(prop.getProperty("url"));
	}
	
	
	@AfterMethod
	public void clouser() {
		driver.quit();
	}
	
	@Test()
	public void PopularSearches(){
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	popularSearchesPage = new PopularSearchesPage(driver);
	popularSearchesPage.header();
	}
	
	
}
