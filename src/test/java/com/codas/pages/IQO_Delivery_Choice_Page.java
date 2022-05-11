package com.codas.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Objects;

public class IQO_Delivery_Choice_Page extends BasePage {

    public IQO_Delivery_Choice_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//tr[@data-quantity]")
    private List<WebElement> IQO_deliveryChoicePageIsDisplayed;

    @FindBy(xpath = "//*[@id=\"options\"]/tbody/tr[1]/td[5]/span")
    private WebElement _5DayDeliveryBabyTanker;

    @FindBy(xpath = "//*[@id=\"options\"]/tbody/tr[2]/td[5]/span")
    private WebElement _3DayDeliveryBabyTanker;

    @FindBy(xpath = "//*[@id=\"options\"]/tbody/tr[3]/td[5]/span")
    private WebElement NextDayDeliveryBabyTanker;

    public void IQO_deliveryChoicePageIsDisplayed() {
        Assert.assertTrue(IQO_deliveryChoicePageIsDisplayed.size() > 0);
    }

    private void _5DayDeliveryBabyTanker() {
        _5DayDeliveryBabyTanker.click();
    }

    private void _3DayDeliveryBabyTanker() {
        _3DayDeliveryBabyTanker.click();
    }

    private void NextDayDeliveryBabyTanker() {
        NextDayDeliveryBabyTanker.click();
    }

    public IQO_Your_Details_Page SelectDeliveryChoice(String Delivery_choice) {
        if (Objects.equals(Delivery_choice, "5 Day Delivery Baby Tanker")) {
            _5DayDeliveryBabyTanker();
        } else if (Objects.equals(Delivery_choice, "3 Day Delivery Baby Tanker")) {
            _3DayDeliveryBabyTanker();
        } else if (Objects.equals(Delivery_choice, "Next Day Delivery Baby Tanker")) {
            NextDayDeliveryBabyTanker();
        }
        return new IQO_Your_Details_Page(driver);
    }
}
