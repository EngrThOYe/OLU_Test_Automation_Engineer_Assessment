Feature: Functionality of news article page

  Scenario Outline: opening of full news article page with read more link
    Given I navigate to www.CODAS.com home page
    When I click on the news link tab
    And the news page is displayed
    And I confirm that there is an article dated March 30th2022
    And I click on read more link for March 30th2022
    Then the full article of March 30th2022 page is displayed
    And I take a screenshot of the article page as screenshot_"<Article_Name>"

    Examples:
      | Article_Name                 |
      | Pilkington Oils adopts CODAS |
