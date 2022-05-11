package com.codas.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class IQO_Your_Details_Page extends BasePage {

    public IQO_Your_Details_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[@id=\"btnProceedToCheckout\"]")
    private List<WebElement> IQO_YourDetailsPageIsDisplayed;

    public void IQO_YourDetailsPageIsDisplayed() {
        Assert.assertTrue(IQO_YourDetailsPageIsDisplayed.size() > 0);
    }

    public void takeScreenshotOfYourDetailsPage(String IQO_Order_details) throws IOException {
        takeScreenshot(IQO_Order_details);
    }
}
