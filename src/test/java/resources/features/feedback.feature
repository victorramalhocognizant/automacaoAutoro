Feature: Feedback
    @Feedback
    Scenario: Verify feedback
        Given I open the site Autoropage Feedback
        When I put the user yourName "Khaterin Nunez Palomino"
        And  I put the YourEmail "Khaterinnunezp@gmail/com"
        And  I put the Subject "Remessa"
        And  I put the questionComment "Tempo Remessa"
        And  I click on Sumit  button
        Then I should see the message page "Thank You"
