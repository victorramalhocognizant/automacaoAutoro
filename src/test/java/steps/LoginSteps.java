package steps;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {

    private LoginPage loginPage;

    @Given("I open the login Autoropage")
    public void openAutoroPage(){
        loginPage = new LoginPage(Hooks.getDriver());
        loginPage.openSite();
        Hooks.captureScreenshot("pass", "I open the login Autoropage");
    }
        @When("I put the user name {string}")
    public void PutTheUserName(String userName) {
         loginPage.loginUsuario(userName);
        Hooks.captureScreenshot("pass", "I put the user name");

    }
        @When("I put the password {string}")
    public void PutThePassword(String password) {
        loginPage.loginSenha(password);
        Hooks.captureScreenshot("pass", "I put the password");
    }
    @When("I click on login button")
    public void ClickOnLoginButton() {
        loginPage.clickLogin();
        Hooks.captureScreenshot("pass", "I click on login button");
    }
    @Then("I should see the login page {string}")
    public void ShouldSeeTheLoginPage(String textoValidacao) {
       Assert.assertEquals(loginPage.getTextHelloJonhSmitString(),textoValidacao);
       Hooks.captureScreenshot("pass", "I should see the login page");
    }
}
