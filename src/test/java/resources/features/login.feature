Feature: Login

    @LoginOk
    Scenario: Verify Login ok
        Given I open the login Autoropage
        When I put the user name "jsmith"
        And  I put the password "Demo1234"
        And  I click on login button
        Then I should see the login page "Hello John Smith"

@loginIncorrectuser
         Scenario: Digitar usuario errado
        Given I open the login Autoropage
        When I put the user name "Karine"
        And  I put the password "Demo1234"
        And  I click on login button
        Then I should see the error message "Online Banking Login"

@loginWithBlankUser
 Scenario: Digitar usuario em branco
        Given I open the login Autoropage
        When I put the password "Demo1234"
        And  I click on login button
        Then I should see the pop up "You must enter a valid username"


@loginWithUserAndPasswordBlank
 Scenario: Digitar usuario e senha em branco
        Given I open the login Autoropage
        When  I click on login button
        Then I should see the pop up "You must enter a valid username"