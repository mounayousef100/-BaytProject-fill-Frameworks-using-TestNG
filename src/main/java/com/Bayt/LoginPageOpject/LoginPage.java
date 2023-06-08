package com.Bayt.LoginPageOpject;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Bayt.ActionDriver.Action;
import com.Bayt.Base.Base;

public class LoginPage  {
	public WebDriver driver;
	Action action = new Action();

	@FindBy(xpath ="//*[@id=\"yw0\"]/li[8]/ul/li[1]/a")
	private WebElement loginPage;

	@FindBy(xpath = "//input[@id='LoginForm_username']")
	private WebElement username ;

	@FindBy(xpath = "//*[@id=\"LoginForm_password\"]")
	private WebElement password;

	@FindBy(id = "login-button")
	private WebElement loginBtn;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void login(String name, String pasw) throws InterruptedException, IOException {
		Thread.sleep(3000);
		action.click(driver, loginPage);
		action.typestring(username, name);
		action.typestring(password, pasw);
		action.click(driver, loginBtn);
		Thread.sleep(4000);
	//Base.takeScreenshot(null, driver);

	}

}
