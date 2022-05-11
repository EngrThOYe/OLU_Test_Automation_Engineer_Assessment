package com.codas.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class Article_Page extends BasePage {

    public Article_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//span[text()='March 30th, 2022']")
    private List<WebElement> fullArticleMarch30th2022IsDisplayed;

    @FindBy(xpath = "//*[@id=\"menu-item-25\"]/a/span")
    private WebElement clickHomeLinkTab;


    public void fullArticleMarch30th2022IsDisplayed() {
        Assert.assertTrue(fullArticleMarch30th2022IsDisplayed.size() > 0);
    }

    public void takeScreenshotOfTheArticlePage(String Article_Name) throws IOException {
        takeScreenshot(Article_Name);
    }

    public HomePage clickHomeLinkTab() {
        clickHomeLinkTab.click();
        return new HomePage(driver);
    }

}
