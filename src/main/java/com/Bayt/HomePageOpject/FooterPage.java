package com.Bayt.HomePageOpject;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import com.Bayt.ActionDriver.Action;

public class FooterPage {
	public WebDriver driver;
	Action action = new Action();
	SoftAssert mysoft = new SoftAssert();

	public FooterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body/nav[@id='baytNav']/ul[@id='navList']/li[@class='is-wide-d']/ul[@id='yw0']/li[1]/a[1]")
	private WebElement FindJobs;

	@FindBy(xpath = "//*[@id=\"yw1\"]/li[1]/a")
	private WebElement JobsinAbDhabi;

	@FindBy(className = "h3")
	private WebElement Title;

	@FindBy(xpath = "//*[@id=\"yw1\"]/li[2]/a")
	private WebElement JobsinDubai;

	@FindBy(xpath = "//*[@id=\"yw1\"]/li[3]/a")
	private WebElement JobsinAlgeria;

	@FindBy(xpath = "//*[@id=\"yw1\"]/li[4]/a")
	private WebElement JobsinBahrain;

	@FindBy(xpath = "//*[@id=\"yw1\"]/li[5]/a")
	private WebElement JobsinEgypt;

	@FindBy(xpath = "//*[@id=\"yw1\"]/li[6]/a")
	private WebElement JobsinIndia;

	@FindBy(xpath = "//*[@id=\"yw1\"]/li[7]/a")
	private WebElement JobsinIraq;

	@FindBy(xpath = "//*[@id=\"yw1\"]/li[8]/a")
	private WebElement JobsinJordan;

	@FindBy(xpath = "//*[@id=\"yw1\"]/li[9]/a")
	private WebElement JobsinKuwait;

	@FindBy(xpath = "//*[@id=\"yw1\"]/li[10]/a")
	private WebElement JobsinLebanon;

	@FindBy(xpath = "//*[@id=\"yw1\"]/li[11]/a")
	private WebElement JobsinLibya;

	@FindBy(xpath = "//*[@id=\"yw1\"]/li[12]/a")
	private WebElement JobsinMorocco;

	@FindBy(xpath = "//*[@id=\"yw1\"]/li[13]/a")
	private WebElement JobsinOman;

	@FindBy(xpath = "//*[@id=\"yw1\"]/li[14]/a")
	private WebElement JobsinPakistan;

	@FindBy(xpath = "//*[@id=\"yw1\"]/li[15]/a")
	private WebElement JobsinQatar;

	@FindBy(xpath = "//*[@id=\"yw1\"]/li[16]/a")
	private WebElement JobsinSaudiArabia;

	@FindBy(xpath = "//*[@id=\"yw1\"]/li[17]/a")
	private WebElement JobsinTunisia;

	@FindBy(xpath = "//*[@id=\"yw1\"]/li[18]/a")
	private WebElement JobsinUAE;

	@FindBy(xpath = "//*[@id=\"yw1\"]/li[19]/a")
	private WebElement JobsinYemen;

	@FindBy(xpath = "//div[@class='t-small p10r']")
	private WebElement AboutBayt;

	@FindBy(xpath = "//*[@id=\"yw3\"]/li[1]/a")
	private WebElement AboutUs;

	@FindBy(xpath = "//*[@id=\"yw3\"]/li[2]/a")
	private WebElement ContactUs;

	@FindBy(xpath = "//*[@id=\"yw3\"]/li[3]/a")
	private WebElement Careers;

	@FindBy(xpath = "//*[@id=\"yw3\"]/li[4]/a")
	private WebElement PressCorner;

	@FindBy(xpath = "//*[@id=\"yw3\"]/li[5]/a")
	private WebElement AdvertiseWithUs;

	@FindBy(xpath = "//*[@id=\"yw3\"]/li[6]/a")
	private WebElement CommunityService;

	@FindBy(xpath = "//*[@id=\"yw4\"]/li[1]/a")
	private WebElement Blog;

	@FindBy(xpath = "//*[@id=\"yw3\"]/li[2]/a")
	private WebElement HelpCenter;

	@FindBy(xpath = "//*[@id=\"yw6\"]/li[3]/a")
	private WebElement AffiliateProgram;

	@FindBy(xpath = "//*[@id=\"yw3\"]/li[4]/a")
	private WebElement NeverMissanEmail;

	@FindBy(xpath = "//*[@id=\"mainMenuItems\"]/li[1]/a")
	private WebElement home;

	@FindBy(xpath = "//img[@alt='Google Play']")
	private WebElement googlePlay;

	@FindBy(xpath = "//img[@alt='App Store']")
	private WebElement AppStore;

	@FindBy(xpath = "//*[@id=\"footer\"]/div/div[3]/div[5]/div[1]/a[2]/img")
	private WebElement TitlegooglePlay;

	@FindBy(className = "is-facebook")
	private WebElement FaceBookIcon;

	@FindBy(className = "is-twitter")
	private WebElement TwitterIcon;

	@FindBy(className = "is-linkedin")
	private WebElement LinkedInIcon;

	@FindBy(className = "is-youtube")
	private WebElement youtubeIcon;

	@FindBy(className = "is-instagram")
	private WebElement InstagramIcon;

	@FindBy(className = "is-pinterest")
	private WebElement pinterestIcon;

	@FindBy(xpath = "//a[normalize-space()='Terms of Use']")
	private WebElement TermsofUse;

	@FindBy(xpath = "//a[normalize-space()='Privacy Policy']")
	private WebElement PrivacyPolicy;

	@FindBy(xpath = "//a[normalize-space()='Cookie Policy']")
	private WebElement CookiePolicy;

	@FindBy(xpath = "//*[@id=\"footer\"]/div/div[4]/div[1]/a[4]")
	private WebElement SecurityMessage;

	public void FindJobs() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.scrollByVisibilityOfElement(driver, FindJobs);
		action.JSClick(driver, JobsinAbDhabi);
		String currentUrlAbDhabi = action.getCurrentURL(driver);
		String jobTitleAbDhabi = Title.getText().toLowerCase().replace(" ", "-");
		boolean checkTitleAbDhabi = currentUrlAbDhabi.contains(jobTitleAbDhabi);
		mysoft.assertEquals(checkTitleAbDhabi, true, "URL should contain the job title: ");
		mysoft.assertAll();

		action.JSClick(driver, JobsinDubai);
		String currentUrlinDubai = action.getCurrentURL(driver);
		String jobTitleinDubai = Title.getText().toLowerCase().replace(" ", "-");
		boolean checkTitleinDubai = currentUrlinDubai.contains(jobTitleinDubai);
		mysoft.assertEquals(checkTitleinDubai, true, "URL should contain the job title ");
		mysoft.assertAll();

		action.JSClick(driver, JobsinAlgeria);
		String jobTitleActualAlgeria = "Jobs in Algeria";
		String jobTitleexpectedAlgeria = Title.getText();
		Assert.assertEquals(jobTitleActualAlgeria, jobTitleexpectedAlgeria, "The job title mismatch");

		action.JSClick(driver, JobsinBahrain);
		String jobTitleActualBahrain = "Jobs in Bahrain";
		String jobTitleexpectedBahrain = Title.getText();
		Assert.assertEquals(jobTitleActualBahrain, jobTitleexpectedBahrain, "The job title mismatch");

		action.JSClick(driver, JobsinEgypt);
		String jobTitleActualEgypt = "Jobs in Egypt";
		String jobTitleexpectedEgypt = Title.getText();
		Assert.assertEquals(jobTitleActualEgypt, jobTitleexpectedEgypt, "The job title mismatch");

		action.JSClick(driver, JobsinIndia);
		String jobTitleActualIndia = "Jobs in India";
		String jobTitleexpectedIndia = Title.getText();
		Assert.assertEquals(jobTitleActualIndia, jobTitleexpectedIndia, "The job title mismatch");

		action.JSClick(driver, JobsinIraq);
		String jobTitleActualIraq = "Jobs in Iraq";
		String jobTitleexpectedIraq = Title.getText();
		Assert.assertEquals(jobTitleActualIraq, jobTitleexpectedIraq, "The job title mismatch");

		action.JSClick(driver, JobsinJordan);
		String jobTitleActualJordan = "Jobs in Jordan";
		String jobTitleexpectedJordan = Title.getText();
		Assert.assertEquals(jobTitleActualJordan, jobTitleexpectedJordan, "The job title mismatch");

		action.JSClick(driver, JobsinKuwait);
		String jobTitleActualKuwait = "Jobs in Kuwait";
		String jobTitleexpectedKuwait = Title.getText();
		Assert.assertEquals(jobTitleActualKuwait, jobTitleexpectedKuwait, "The job title mismatch");

		action.JSClick(driver, JobsinLebanon);
		String jobTitleActualLebanon = "Jobs in Lebanon";
		String jobTitleexpectedLebanon = Title.getText();
		Assert.assertEquals(jobTitleActualLebanon, jobTitleexpectedLebanon, "The job title mismatch");

		action.JSClick(driver, JobsinLibya);
		String jobTitleActualLibya = "Jobs in Libya";
		String jobTitleexpectedLibya = Title.getText();
		Assert.assertEquals(jobTitleActualLibya, jobTitleexpectedLibya, "The job title mismatch");

		action.JSClick(driver, JobsinMorocco);
		String jobTitleActualMorocco = "Jobs in Morocco";
		String jobTitleexpectedMorocco = Title.getText();
		Assert.assertEquals(jobTitleActualMorocco, jobTitleexpectedMorocco, "The job title mismatch");

		action.JSClick(driver, JobsinOman);
		String jobTitleActualOman = "Jobs in Oman";
		String jobTitleexpectedOman = Title.getText();
		Assert.assertEquals(jobTitleActualOman, jobTitleexpectedOman, "The job title mismatch");

		action.JSClick(driver, JobsinPakistan);
		String jobTitleActualPakistan = "Jobs in Pakistan";
		String jobTitleexpectedPakistan = Title.getText();
		Assert.assertEquals(jobTitleActualPakistan, jobTitleexpectedPakistan, "The job title mismatch");

		action.JSClick(driver, JobsinQatar);
		String jobTitleActualQatar = "Jobs in Qatar";
		String jobTitleexpectedQatar = Title.getText();
		Assert.assertEquals(jobTitleActualQatar, jobTitleexpectedQatar, "The job title mismatch");

		action.JSClick(driver, JobsinSaudiArabia);
		String jobTitleActualSaudiArabia = "Jobs in Saudi Arabia";
		String jobTitleexpectedSaudiArabia = Title.getText();
		Assert.assertEquals(jobTitleActualSaudiArabia, jobTitleexpectedSaudiArabia, "The job title mismatch");

		action.JSClick(driver, JobsinTunisia);
		String jobTitleActualTunisia = "Jobs in Tunisia";
		String jobTitleexpectedTunisia = Title.getText();
		Assert.assertEquals(jobTitleActualTunisia, jobTitleexpectedTunisia, "The job title mismatch");

		action.JSClick(driver, JobsinUAE);
		String jobTitleActualJobsinUAE = "Jobs in UAE";
		String jobTitleexpectedJobsinUAE = Title.getText();
		Assert.assertEquals(jobTitleActualJobsinUAE, jobTitleexpectedJobsinUAE, "The job title mismatch");

		action.JSClick(driver, JobsinYemen);
		String jobTitleActualYemen = "Jobs in Yemen";
		String jobTitleexpectedYemen = Title.getText();
		Assert.assertEquals(jobTitleActualYemen, jobTitleexpectedYemen, "The job title mismatch");

	}

	public void AboutBaytCom() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.scrollByVisibilityOfElement(driver, AboutBayt);
		Thread.sleep(3000);
		String actualAboutBayt = action.getText(AboutBayt);
		String expectedAboutBayt = "Bayt.com is the leading job site in the Middle East and North Africa, connecting job seekers with employers looking to hire. Every day, thousands of new job vacancies are listed on the award-winning platform from the region's top employers.";
		Assert.assertEquals(actualAboutBayt, expectedAboutBayt, "AboutBayt mismatch");

	}

	public void Company() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.JSClick(driver, JobsinLebanon);

		action.JSClick(driver, AboutUs);

		action.JSClick(driver, ContactUs);

		action.JSClick(driver, Careers);
		driver.navigate().back();

		action.JSClick(driver, PressCorner);

		action.JSClick(driver, AdvertiseWithUs);
		driver.navigate().back();

		action.JSClick(driver, CommunityService);
		driver.navigate().back();
	}

	public void QuickLinks() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.JSClick(driver, Blog);
		String expectedUrlBlog = "https://www.bayt.com/en/blog/";
		String actualUrlBlog = action.getCurrentURL(driver);
		Assert.assertEquals(actualUrlBlog, expectedUrlBlog, "URL mismatch");

		action.JSClick(driver, HelpCenter);
		String expectedUrlHelpCenter = "https://www.bayt.com/en/feedback/submit/";
		String actualUrlHelpCenter = action.getCurrentURL(driver);
		Assert.assertEquals(actualUrlHelpCenter, expectedUrlHelpCenter, "URL mismatch");

		action.JSClick(driver, AffiliateProgram);
		String expectedUrlAffiliateProgram = "https://www.bayt.com/en/affiliates/";
		String actualUrlAffiliateProgram = action.getCurrentURL(driver);
		Assert.assertEquals(actualUrlAffiliateProgram, expectedUrlAffiliateProgram, "URL mismatch");



	}

	public void GettheBaytApp() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.JSClick(driver, googlePlay);
		String firstWindowHandle = driver.getWindowHandle();// Home Page
		Set<String> windowHandles = driver.getWindowHandles();
		for (String handle : windowHandles) {
			if (!handle.equals(firstWindowHandle)) {// Home Page
				driver.switchTo().window(handle);// Google Page
				Thread.sleep(3000);
				String expectedTitlegooglePlay = "Bayt.com Job Search - Apps on Google Play";
				String actualTitlegooglePlay = driver.getTitle();
				Assert.assertEquals(actualTitlegooglePlay, expectedTitlegooglePlay, "Title mismatch");
				break;
			}

		}
		driver.close();
		driver.switchTo().window(firstWindowHandle);// Home Page
		action.JSClick(driver, AppStore);
		windowHandles = driver.getWindowHandles();
		for (String handle : windowHandles) {// Home Page
			if (!handle.equals(firstWindowHandle)) {// App Store
				driver.switchTo().window(handle);
				Thread.sleep(3000);
				String expectedUrlAppStore = "https://apps.apple.com/us/app/bayt-com-job-search/id510893233";
				String actualUrlAppStore = driver.getCurrentUrl();
				Assert.assertEquals(actualUrlAppStore, expectedUrlAppStore, "URL mismatch");
				break;
			}
		}
		driver.close();
		driver.switchTo().window(firstWindowHandle);// Home Page
	}

	public void FollowBayCom() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		action.JSClick(driver, FaceBookIcon);
		String expectedUrlFaceBook = "https://www.facebook.com/Baytcom";
		String actualUrlFaceBook = action.getCurrentURL(driver);
		Assert.assertEquals(actualUrlFaceBook, expectedUrlFaceBook, "URL mismatch");
		driver.navigate().back();

		action.JSClick(driver, TwitterIcon);
		String expectedUrlTwitter = "https://twitter.com/Baytcom";
		String actualUrlTwitter = action.getCurrentURL(driver);
		Assert.assertEquals(actualUrlTwitter, expectedUrlTwitter, "URL mismatch");
		driver.navigate().back();

		action.JSClick(driver, LinkedInIcon);
		String expectedUrlLinked = "https://www.linkedin.com/company/bayt.com?original_referer=https%3A%2F%2Fwww.bayt.com%2F";
		String actualUrlLinked = action.getCurrentURL(driver);
		Assert.assertEquals(actualUrlLinked, expectedUrlLinked, "URL mismatch");
		driver.get("https://www.bayt.com/en/jordan/");

		action.JSClick(driver, youtubeIcon);
		String expectedUrlyoutube = "https://www.youtube.com/Baytcom";
		String actualUrlyoutube = action.getCurrentURL(driver);
		Assert.assertEquals(actualUrlyoutube, expectedUrlyoutube, "URL mismatch");
		driver.navigate().back();

		action.JSClick(driver, InstagramIcon);
		String expectedUrlInstagram = "https://www.instagram.com/baytcom/";
		String actualUrlInstagram = action.getCurrentURL(driver);
		Assert.assertEquals(actualUrlInstagram, expectedUrlInstagram, "URL mismatch");
		driver.navigate().back();

		action.JSClick(driver, pinterestIcon);
		String expectedUrlpinterest = "https://www.pinterest.com/baytcom/";
		String actualUrlpinterest = action.getCurrentURL(driver);
		Assert.assertEquals(actualUrlpinterest, expectedUrlpinterest, "URL mismatch");
		driver.navigate().back();

	}

	public void AllRightsReserved() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.removeCSSStyle();
		action.JSClick(driver, TermsofUse);
		String expectedTitleTermsofUse = "Terms and Conditions of Use - Bayt.com";
		String actualTitleTermsofUse = driver.getTitle();
		Assert.assertEquals(actualTitleTermsofUse, expectedTitleTermsofUse, "Title mismatch");
		driver.navigate().back();

		action.JSClick(driver, PrivacyPolicy);
		String expectedTitlePrivacyPolicy = "Privacy Statement - Bayt.com";
		String actualTitlePrivacyPolicy = driver.getTitle();
		Assert.assertEquals(actualTitlePrivacyPolicy, expectedTitlePrivacyPolicy, "Title mismatch");
		driver.navigate().back();

		action.JSClick(driver, CookiePolicy);
		String expectedTitleCookiePolicy = "Cookie Policy - Bayt.com";
		String actualTitleCookiePolicy = driver.getTitle();
		Assert.assertEquals(actualTitleCookiePolicy, expectedTitleCookiePolicy, "Title mismatch");
		driver.navigate().back();

		action.JSClick(driver, SecurityMessage);
		String expectedTitleSecurityMessage = "Security Message - Bayt.com";
		String actualTitleSecurityMessage = driver.getTitle();
		Assert.assertEquals(actualTitleSecurityMessage, expectedTitleSecurityMessage, "Title mismatch");
		driver.navigate().back();

	}
}
