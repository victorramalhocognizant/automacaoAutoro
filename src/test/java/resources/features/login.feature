Feature: Login
@loginOk
    Scenario: Verify Login ok
        Given I open the login Autoropage
        When I put the user name "jsmith"
        And  I put the password "Demo1234"
        And  I click on login button
        Then I should see the login page "Hello John Smith"

@loginIncorrectPassword
    Scenario: Verify incorrect password 
        Given I open the login Autoropage
        When I put the user name "jsmith"
        And  I put the password "Khate1234"
        And  I click on login button
        Then I should see the mensagem "Login Failed: We're sorry, but this username or password was not found in our system. Please try again."

@loginWithBlankPassword
    Scenario: Verify Whit blank password
        Given I open the login Autoropage
        When I put the user name "jsmith"

        And  I click on login button
        Then I should see the popup "You must enter a valid password"

 