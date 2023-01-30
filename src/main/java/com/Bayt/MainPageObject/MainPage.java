package com.Bayt.MainPageObject;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Bayt.ActionDriver.Action;

public class MainPage {
	public WebDriver driver;
	Action action = new Action();

	public MainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "keyword")
	private WebElement jobTitle;

	@FindBy(xpath = "//*[@id ='search_icon_submit_1']")
	private WebElement ButtonSearch;

	@FindBy(xpath = "//div[@class='jb-descr m10t t-small']")
	private List<WebElement> Search;

	public void SearchJobs() throws Throwable{
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     action.removeCSSStyle();
     action.fluentWait(driver, jobTitle, 10);
     action.typestring(jobTitle,"quality control engineer");
     jobTitle.sendKeys(Keys.ENTER);
	 action.fluentWait(driver,ButtonSearch, 10);
	 action.JSClick(driver, ButtonSearch);
	 Thread.sleep(5000);
   //  action.fluentWait(driver, Search, 10);
	 for( int i = 0; i<Search.size();i++) {
		 String result = Search.get(i).getText(); 
	 Object jobTitle = "quality" ;
	System.out.println( result.contains((CharSequence) jobTitle));
	 }
	// System.out.println( "result//////////////" );
	 
	 }

}
