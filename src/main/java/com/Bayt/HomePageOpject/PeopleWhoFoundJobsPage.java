package com.Bayt.HomePageOpject;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import com.Bayt.ActionDriver.Action;

public class PeopleWhoFoundJobsPage {
    public WebDriver driver;
    Action action = new Action();
    SoftAssert mySoft = new SoftAssert();

    public PeopleWhoFoundJobsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "img-120")
    private List<WebElement> img;

    public void slide() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        action.removeCSSStyle();

        for (int i = 0; i < img.size(); i++) {
            for (int k = i + 1; k < img.size(); k++) { // Start the inner loop from i+1 to avoid comparing the same images
                String src1 = img.get(i).getAttribute("src");
                String src2 = img.get(k).getAttribute("src");

                boolean checkImg1 = !src1.equals(src2); // Compare the source attribute values of the images

                mySoft.assertTrue(checkImg1);
            }
        }

        mySoft.assertAll();
    }

}