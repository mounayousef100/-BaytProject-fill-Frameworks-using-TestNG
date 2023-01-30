package com.Bayt.RegisterandApplyPageObject;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Bayt.ActionDriver.Action;
import com.Bayt.Base.Base;

public class CheekEmailRlready {
	public WebDriver driver;
	Action action = new Action();

	public CheekEmailRlready(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/section[4]/div/div[1]/div[1]/div/div/a")
	private WebElement Clickjobs;

	@FindBy(xpath = "//li[3]//div[1]//div[3]//div[2]//a[1]")
	private WebElement EasyAplly;

	@FindBy(xpath = "//input[@id='JsApplicantRegisterForm_firstName']")
	private WebElement FirstNameField;

	@FindBy(xpath = "//input[@id='JsApplicantRegisterForm_lastName']")
	private WebElement LastNameField;

	@FindBy(xpath = "//input[@id='JsApplicantRegisterForm_email']")
	private WebElement EmailaddressField;

	@FindBy(xpath = "//input[@id='JsApplicantRegisterForm_password']")
	private WebElement PasswordField;

	@FindBy(xpath = "//input[@id='mobPhoneAreaCode__r']")
	private WebElement MobPhoneAreaCode;

	@FindBy(xpath = "//*[@id=\"JsApplicantRegisterForm_mobPhone\"]")
	private WebElement PhoneNumberField;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/footer[1]")
	private WebElement ApplyNow;

	@FindBy(css = "#JsApplicantRegisterForm_email_em_")
	private WebElement CheekMassage;

	public void CheekEmailRlread() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.scrollByVisibilityOfElement(driver, Clickjobs);
		Thread.sleep(3000);
		Base.takeScreenshot(null, driver);
		action.click(driver, Clickjobs);
		Base.takeScreenshot(null, driver);
		action.click(driver, EasyAplly);
		Base.takeScreenshot(null, driver);
		driver.navigate().refresh();
		action.typestring(FirstNameField, "Ahmad");
		action.typestring(LastNameField, "yousef");
		action.typestring(EmailaddressField, "44r1p4@gmail.com");
		action.typestring(PasswordField, "ta347y76@yAuy");
		action.selectBySendkeys("Jordan", MobPhoneAreaCode);
		MobPhoneAreaCode.sendKeys(Keys.ENTER);
		action.typestring(PhoneNumberField, "0797859685");
		action.click(driver, ApplyNow);
		Thread.sleep(3000);

	}

	public WebElement CheekMassage() {
		return CheekMassage;
	}
}
