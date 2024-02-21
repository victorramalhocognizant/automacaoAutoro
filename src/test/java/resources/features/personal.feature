Feature: Personal

  @Personal
  Scenario: Verify Personal Menu
    Given I open the Site Autoropage
    When I click on Personal and  I see the "Personal" page
    And I click on Deposit Product and  I see the "Deposit Products" page
    And I click on Checking and I see the "Checking" page
    And I click on Loan Products and I see the "Loan Products" page
    And I click on Cards and I see the "Cards" page
    And I click on Investments Insurance and I see the "Investments & Insurance" page
    And I click on Other Services and I see the "Other Personal Services" page
    Then I should to return to main page
