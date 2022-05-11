package com.codas.step_definitions;

import com.codas.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Step_For_CDS_ENGINEER_ASSESSMENT extends BasePage {

    HomePage homePage = new HomePage(driver);
    Article_Page article_page = new Article_Page(driver);
    CODAS_IQO_Page codas_iqo_page = new CODAS_IQO_Page(driver);
    IQO_Delivery_Choice_Page iqo_delivery_choice_page = new IQO_Delivery_Choice_Page(driver);
    IQO_Details_Selection_Page iqo_details_selection_page = new IQO_Details_Selection_Page(driver);
    IQO_Your_Details_Page iqo_your_details_page = new IQO_Your_Details_Page(driver);
    NewsPage newsPage = new NewsPage(driver);


    @Given("I navigate to www.CODAS.com home page")
    public void i_navigate_to_www_codas_com_home_page() throws InterruptedException {
        NavigateToHomePage();
        Thread.sleep(2000);

    }

    @When("I click on the news link tab")
    public void i_click_on_the_news_link_tab() throws InterruptedException {
        newsPage = homePage.clickNewsLinkTab();
        Thread.sleep(2000);

    }

    @When("the news page is displayed")
    public void the_news_page_is_displayed() throws InterruptedException {
        newsPage.newsPageIsDisplayed();
        Thread.sleep(2000);

    }

    @When("I confirm that there is an article dated March 30th2022")
    public void i_confirm_that_there_is_an_article_dated_march_30th2022() throws InterruptedException {
        newsPage.confirmArticleMarch30th2022();
        Thread.sleep(2000);

    }

    @When("I click on read more link for March 30th2022")
    public void i_click_on_read_more_link_for_march_30th2022() throws InterruptedException {
        article_page = newsPage.clickReadMoreMarch30th2022();
        Thread.sleep(2000);

    }

    @Then("the full article of March 30th2022 page is displayed")
    public void the_full_article_of_march_30th2022_page_is_displayed() throws InterruptedException {
        article_page.fullArticleMarch30th2022IsDisplayed();
        Thread.sleep(2000);

    }

    @And("I take a screenshot of the article page as screenshot_{string}")
    public void iTakeAScreenshotOfTheArticlePageAsScreenshot_(String Article_Name) throws InterruptedException, IOException {
        article_page.takeScreenshotOfTheArticlePage(Article_Name);
        Thread.sleep(2000);
    }

    @When("I click on the CODAS-IQO link tab")
    public void i_click_on_the_codas_iqo_link_tab() throws InterruptedException {
        codas_iqo_page = homePage.clickCODAS_IQOlinkTab();
        Thread.sleep(2000);

    }

    @When("the CODAS-IQO page is displayed")
    public void the_codas_iqo_page_is_displayed() throws InterruptedException {
        codas_iqo_page.CODAS_IQO_PageIsDisplayed();
        Thread.sleep(2000);

    }

    @When("I click on the IQO Demo link")
    public void i_click_on_the_iqo_demo_link() throws InterruptedException {
        iqo_details_selection_page = codas_iqo_page.clickIQO_DemoLink();
        Thread.sleep(2000);
        switchWindows();

    }

    @When("the \\(iqo-cds.fuels.app) IQO details selection page is displayed")
    public void the_iqo_cds_fuels_app_iqo_details_selection_page_is_displayed() throws InterruptedException {
        Thread.sleep(2000);
        iqo_details_selection_page.IQO_SelectionPageIsDisplayed();

    }

    @When("I select the Product as {string}")
    public void i_select_the_product_as(String Product) throws InterruptedException {
        Thread.sleep(2000);
        iqo_details_selection_page.selectProduct(Product);

    }

    @When("I select the Quantity as {string}")
    public void i_select_the_quantity_as(String Quantity) throws InterruptedException {
        Thread.sleep(2000);
        iqo_details_selection_page.selectQuantity(Quantity);

    }

    @When("I enter Postcode as {string}")
    public void i_enter_Postcode_as(String Postcode) throws InterruptedException {
        Thread.sleep(2000);
        iqo_details_selection_page.enterPostcode(Postcode);

    }

    @When("I select the Usage as {string}")
    public void i_select_the_usage_as(String Usage) throws InterruptedException {
        Thread.sleep(2000);
        iqo_details_selection_page.selectUsage(Usage);

    }

    @When("I select the Vehicle Size as {string}")
    public void i_select_the_vehicle_size_as(String Vehicle_Size) throws InterruptedException {
        Thread.sleep(2000);
        iqo_details_selection_page.selectVehicleSize(Vehicle_Size);

    }

    @When("I click on the Get Quote button")
    public void i_click_on_the_get_quote_button() throws InterruptedException {
        Thread.sleep(2000);
        iqo_delivery_choice_page = iqo_details_selection_page.clickGetQuoteButton();


    }

    @When("the \\(iqo-cds.fuels.app) IQO delivery choice page is displayed")
    public void the_iqo_cds_fuels_app_iqo_delivery_choice_page_is_displayed() throws InterruptedException {
        Thread.sleep(2000);
        iqo_delivery_choice_page.IQO_deliveryChoicePageIsDisplayed();

    }

    @Then("the \\(iqo-cds.fuels.app) IQO Your details page is displayed")
    public void the_iqo_cds_fuels_app_iqo_your_details_page_is_displayed() throws InterruptedException {
        Thread.sleep(2000);
        iqo_your_details_page.IQO_YourDetailsPageIsDisplayed();

    }


    @And("I take a screen shot of \\(iqo-cds.fuels.app) IQO Your details page as screenshot_{string}")
    public void iTakeAScreenShotOfIqoCdsFuelsAppIQOYourDetailsPageAsScreenshot_(String IQO_Order_details) throws InterruptedException, IOException {
        Thread.sleep(2000);
        iqo_your_details_page.takeScreenshotOfYourDetailsPage(IQO_Order_details);
    }


    @And("I click on the Home link tab to navigate back to www.CODAS.com home page")
    public void iClickOnTheHomeLinkTabToNavigateBackToWwwCODASComHomePage() throws InterruptedException {
        homePage = article_page.clickHomeLinkTab();
        Thread.sleep(2000);

    }

    @And("I Select the Delivery choice as{string}")
    public void iSelectTheDeliveryChoiceAs(String Delivery_choice) throws InterruptedException {
        Thread.sleep(2000);
        iqo_your_details_page = iqo_delivery_choice_page.SelectDeliveryChoice(Delivery_choice);
    }
}

