Feature: Functionality of IQO Demo

  Scenario Outline: Making next day delivery order and quote with IQO Demo
    Given I navigate to www.CODAS.com home page
    When I click on the CODAS-IQO link tab
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
      | Product  | Quantity    | Postcode | Usage                                    | Vehicle_Size                             | Delivery_choice               | IQO_Order_details |
      | KEROSENE | 1500 litres | M54TP    | Local authority including council depots | Special Vehicle - eg landrover & trailer | Next Day Delivery Baby Tanker | Order Summary 01  |