package com.codas.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[@id=\"menu-item-920\"]/a/span")
    private WebElement clickNewsLinkTab;

    @FindBy(xpath = "//*[@id=\"menu-item-471\"]/a/span")
    private WebElement clickCODAS_IQOlinkTab;

    public NewsPage clickNewsLinkTab() {
        clickNewsLinkTab.click();
        return new NewsPage(driver);
    }

    public CODAS_IQO_Page clickCODAS_IQOlinkTab() {
        clickCODAS_IQOlinkTab.click();
        return new CODAS_IQO_Page(driver);
    }

}
