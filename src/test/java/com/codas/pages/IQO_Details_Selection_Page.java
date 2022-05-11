package com.codas.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class IQO_Details_Selection_Page extends BasePage {

    public IQO_Details_Selection_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"btnGetQuote\"]")
    private List<WebElement> IQO_SelectionPageIsDisplayed;

    @FindBy(xpath = "//*[@id=\"Product\"]")
    private WebElement selectProduct;

    @FindBy(xpath = "//*[@id=\"Quantity\"]")
    private WebElement selectQuantity;

    @FindBy(xpath = "//*[@id=\"Postcode\"]")
    private WebElement enterPostcode;

    @FindBy(xpath = "//*[@id=\"Usage\"]")
    private WebElement selectUsage;

    @FindBy(xpath = "//*[@id=\"VehicleSize\"]")
    private WebElement selectVehicleSize;

    @FindBy(xpath = "//*[@id=\"btnGetQuote\"]")
    private WebElement clickGetQuoteButton;

    public void IQO_SelectionPageIsDisplayed() {
        Assert.assertTrue(IQO_SelectionPageIsDisplayed.size() > 0);
    }

    public void selectProduct(String Product) {
        selectByText(selectProduct, Product);
    }

    public void selectQuantity(String Quantity) {
        selectByText(selectQuantity, Quantity);
    }

    public void enterPostcode(String Postcode) {
        enterPostcode.sendKeys(Postcode);
    }

    public void selectUsage(String Usage) {
        selectByText(selectUsage, Usage);
    }

    public void selectVehicleSize(String Vehicle_Size) {
        selectByText(selectVehicleSize, Vehicle_Size);
    }

    public IQO_Delivery_Choice_Page clickGetQuoteButton() {
        clickGetQuoteButton.click();
        return new IQO_Delivery_Choice_Page(driver);
    }
}
