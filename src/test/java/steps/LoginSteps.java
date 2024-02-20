package steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {

    private LoginPage loginPage;

    @Given("I open the login Autoropage")
    public void openAutoroPage() {
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
        //Hooks.captureScreenshot("pass", "I click on login button");
    }

    @Then("I should see the login page {string}")
    public void ShouldSeeTheLoginPage(String textoValidacao) {
        Assert.assertEquals(loginPage.getTextHelloJonhSmitString(), textoValidacao);
        Hooks.captureScreenshot("pass", "I should see the login page");
    }

    @Then("I should see the mensagem {string}")
    public void ShouldSeeTheMensagem(String textoValidacao) {
        Assert.assertEquals(loginPage.getTextLoginFailed(), textoValidacao);
        Hooks.captureScreenshot("pass", "I should see the login page");
    }

    @Then("I should see the error message {string}")
    public void Errormessage(String textoValidacao) {
        Assert.assertEquals(loginPage.getTextOnlineBankingLoginString(), textoValidacao);
        Hooks.captureScreenshot("pass", "I should see the error message");
    }

    @Then("I should see the pop up {string}")
    public void ErroPopup(String textoValidacao) {
        Assert.assertEquals(loginPage.validaPopup(), textoValidacao);
        Hooks.captureScreenshot("pass", "I should see the pop up");

    }
}