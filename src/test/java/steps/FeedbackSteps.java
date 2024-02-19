package steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FeedbackPage;



public class FeedbackSteps {
    private FeedbackPage feedbackPage;
    
@Given("I open the site Autoropage Feedback")
public void openTheSiteAutoropageFeedback() {
        feedbackPage = new FeedbackPage(Hooks.getDriver());
        feedbackPage.opensiteFeedback();
        Hooks.captureScreenshot("pass", "I open the site Autoropage Feedback");
}
@When("I put the user yourName {string}")
    public void putTheUserYourName(String keyboard) {
        feedbackPage.yourName(keyboard);
        Hooks.captureScreenshot("pass", "I put the user yourName");
}
@When("I put the YourEmail {string}")
    public void putTheYourEmail(String keyboard) {
        feedbackPage.yourEmail(keyboard);
        Hooks.captureScreenshot("pass", "I put the YourEmail");
}
@When("I put the Subject {string}")
    public void putTheSubject(String keyboard) {
        feedbackPage.subject(keyboard);
        Hooks.captureScreenshot("pass", "I put the Subject");
}
@When("I put the questionComment {string}")
    public void putTheQuestionComment(String keyboard) {
        feedbackPage.questionComment(keyboard);
        Hooks.captureScreenshot("pass", "I put the questionComment");
}
@When("I click on Sumit  button")
    public void clickSumitButton() {
        feedbackPage.clickSumit();
        Hooks.captureScreenshot("pass", "I click on Sumit  button");
}
@Then("I should see the message page {string}")
    public void shouldSeeTheMessagePage(String textoThankYou) {
    Assert.assertEquals(feedbackPage.getTextoThankYou(),textoThankYou);
    Hooks.captureScreenshot("pass", "I should see the message page");
}

}
    
   