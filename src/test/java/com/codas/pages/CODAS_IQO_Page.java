package com.codas.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CODAS_IQO_Page extends BasePage {
    public CODAS_IQO_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[@id=\"post-462\"]/div/div[1]/div/div[3]/div/div[2]/a/span")
    private List<WebElement> CODAS_IQO_PageIsDisplayed;

    @FindBy(xpath = "//*[@id=\"post-462\"]/div/div[1]/div/div[3]/div/div[2]/a/span")
    private WebElement clickIQO_DemoLink;

    public void CODAS_IQO_PageIsDisplayed() {
        Assert.assertTrue(CODAS_IQO_PageIsDisplayed.size() > 0);
    }

    public IQO_Details_Selection_Page clickIQO_DemoLink() {
        clickIQO_DemoLink.click();
        return new IQO_Details_Selection_Page(driver);
    }


}
