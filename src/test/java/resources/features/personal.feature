Feature: Personal
@Personal
    Scenario: Verify Personal Menu
     
        Given I open the Site Autoropage
        When I click on Btn Personal menu
        And  I click on Deposit Product 
        And  I click on Checking 
        And  I click on Loan Products 
        And  I click on Cards 
        And  I click on Investments Insurance 
        And  I click on Investments 
        And  I click on Other Services
        Then I should to return to main page
