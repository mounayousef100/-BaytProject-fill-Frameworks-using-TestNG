package com.Bayt.MainPageObject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Bayt.ActionDriver.Action;
import com.Bayt.Base.Base;

public class LoginPage extends Base {
	public WebDriver driver;
	Action action = new Action();

	@FindBy(xpath = " //a[normalize-space()='Log In']")
	private WebElement loginPage;

	@FindBy(name = "LoginForm[username]")
	private WebElement username;

	@FindBy(name = "LoginForm[password]")
	private WebElement password;

	@FindBy(id = "login-button")
	private WebElement loginBtn;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void login(String name, String pasw) throws InterruptedException, IOException {
		Base.takeScreenshot(null, driver);
		action.click(driver, loginPage);
		Base.takeScreenshot(null, driver);
		action.typestring(username, name);
		action.typestring(password, pasw);
		action.click(driver, loginBtn);
		Thread.sleep(4000);
		Base.takeScreenshot(null, driver);

	}

}
