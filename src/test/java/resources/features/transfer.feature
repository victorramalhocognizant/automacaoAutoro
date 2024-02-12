Feature: Transfer

    @TransferSavingsToSavings
    Scenario: Transfer founds to teh account Savings to Savings
        Given I am already logged in the system
        When I click on transfer funds
        And  I select in the field from account the Savings account
        And  I select in the field to account the Savings account
        And I type "100" in the field amount to transfer
        And I click on the buttom transfer money
        Then the system should show the popup message "From Account and To Account fields cannot be the same."