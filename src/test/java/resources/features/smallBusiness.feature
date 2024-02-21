Feature: Small business

  @SmallBusiness
  Scenario: Verify Small Businesss Menu
    Given I open the site Autoropage
    When I click on the Small Business Menu
    And I click on deposit products
    And I click on lending services
    And I click on cards
    And I click on insurance
    And I click on retirement
    And I click on other services
    Then I should to return to main page
