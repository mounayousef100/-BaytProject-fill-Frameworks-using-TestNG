package com.Bayt.HomePageOpject;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import com.Bayt.ActionDriver.Action;

public class SearchJobsPage {

	public WebDriver driver;
	Action action = new Action();
	SoftAssert mysoft = new SoftAssert();

	public SearchJobsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "keyword")
	private WebElement jobTitle;

	@FindBy(xpath = "//*[@id=\"search_icon_submit\"]")
	private WebElement ButtonSearch;

	@FindBy(xpath = "//*[@id=\"results_inner_card\"]/ul/li[2]/div/h2/a")
	private List<WebElement> Search;

	public void SearchJobs() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.typestring(jobTitle, "qc");
		action.JSClick(driver, ButtonSearch);
		for (int i = 0; i < Search.size(); i++) {
			String result = Search.get(i).getText();
			boolean checkSearch = result.contains("q")|| result.contains("c");
			mysoft.assertEquals(checkSearch, true, "check Search successfully");
			mysoft.assertAll();
		}

	}
}
