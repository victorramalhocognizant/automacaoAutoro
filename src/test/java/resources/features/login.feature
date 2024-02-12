Feature: Login
    Scenario: Verify Login ok
        Given I open the login Autoropage
        When I put the user name "jsmith"
        And  I put the password "Demo1234"
        And  I click on login button
        Then I should see the login page "Hello John Smith"