package com.codas.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NewsPage extends BasePage {

    public NewsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//article")
    private List<WebElement> newsPageIsDisplayed;

    @FindBy(xpath = "//*[@id=\"blog-1-post-5457\"]/div[2]/h2/a")
    private List<WebElement> confirmArticleMarch30th2022;

    @FindBy(xpath = "//*[@id=\"blog-1-post-5457\"]/div[4]/div/a")
    private WebElement clickReadMoreMarch30th2022;

    public void newsPageIsDisplayed() {
        Assert.assertTrue(newsPageIsDisplayed.size() > 0);
    }

    public void confirmArticleMarch30th2022() {
        Assert.assertTrue(confirmArticleMarch30th2022.size() > 0);
    }

    public Article_Page clickReadMoreMarch30th2022() {
        clickReadMoreMarch30th2022.click();
        return new Article_Page(driver);
    }


}
