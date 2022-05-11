Feature: Functionality of news article page and IQO Demo

  Scenario Outline: opening of full news article page with read more link and making next day delivery order and quote with IQO Demo
    Given I navigate to www.CODAS.com home page
    When I click on the news link tab
    And the news page is displayed
    And I confirm that there is an article dated March 30th2022
    And I click on read more link for March 30th2022
    And the full article of March 30th2022 page is displayed
    And I take a screenshot of the article page as screenshot_"<Article_Name>"
    And I click on the Home link tab to navigate back to www.CODAS.com home page
    And I click on the CODAS-IQO link tab
    And the CODAS-IQO page is displayed
    And I click on the IQO Demo link
    And the (iqo-cds.fuels.app) IQO details selection page is displayed
    And I select the Product as "<Product>"
    And I select the Quantity as "<Quantity>"
    And I enter Postcode as "<Postcode>"
    And I select the Usage as "<Usage>"
    And I select the Vehicle Size as "<Vehicle_Size>"
    And I click on the Get Quote button
    And the (iqo-cds.fuels.app) IQO delivery choice page is displayed
    And I Select the Delivery choice as"<Delivery_choice>"
    Then the (iqo-cds.fuels.app) IQO Your details page is displayed
    And I take a screen shot of (iqo-cds.fuels.app) IQO Your details page as screenshot_"<IQO_Order_details>"


    Examples:
      | Article_Name                 | Product  | Quantity    | Postcode | Usage                                    | Vehicle_Size                             | Delivery_choice               | IQO_Order_details |
      | Pilkington Oils adopts CODAS | KEROSENE | 1500 litres | M54TP    | Local authority including council depots | Special Vehicle - eg landrover & trailer | Next Day Delivery Baby Tanker | Order Summary 01  |