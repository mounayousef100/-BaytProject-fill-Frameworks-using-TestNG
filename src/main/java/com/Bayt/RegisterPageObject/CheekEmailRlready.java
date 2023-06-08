package com.Bayt.RegisterPageObject;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Bayt.ActionDriver.Action;

public class CheekEmailRlready {
	public WebDriver driver;
	Action action = new Action();

	public CheekEmailRlready(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[normalize-space()='Jordan']")
	private WebElement Clickjobs;

	@FindBy(xpath = "//li[2]//div[1]//div[3]//div[2]//a[1]")
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

	@FindBy(xpath = "//*[@id=\"register\"]")
	private WebElement ApplyNow;

	@FindBy(css = "#JsApplicantRegisterForm_email_em_")
	private WebElement CheekMassage;

	public void CheekEmailRlread() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.scrollByVisibilityOfElement(driver, Clickjobs);
		action.JSClick(driver, Clickjobs);
		action.JSClick(driver, EasyAplly);
		//Base.takeScreenshot(null, driver);
		action.typestring(FirstNameField, "Ahmad");
		action.typestring(LastNameField, "yousef");
		action.typestring(EmailaddressField, "44r1p4@gmail.com");
		action.typestring(PasswordField, "ta347y76@yAuy");
		action.selectBySendkeys("Jordan", MobPhoneAreaCode);
		action.typestring(PhoneNumberField, "0797859685");
		action.JSClick(driver, ApplyNow);
        Thread.sleep(3000);

	}

	public WebElement CheekMassage() {
		return CheekMassage;
	}
}
