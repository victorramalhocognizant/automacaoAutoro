package steps;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.TransferPage;

public class TransferSteps {

    private LoginPage loginPage;
    private TransferPage transferPage = new TransferPage(Hooks.getDriver());

    @Given("I am already logged in the system")
        public void iAmAlreadyLoggedInTheSystem() {
        loginPage = new LoginPage(Hooks.getDriver());
        loginPage.openSite();
        loginPage.loginUsuario("jsmith");
        loginPage.loginSenha("Demo1234");
        loginPage.clickLogin();
    }

    @When("I click on transfer funds")
    public void iClickOnTransferFunds() throws InterruptedException {
        transferPage.clicarbtnTransferFunds();
        Hooks.captureScreenshot("pass", "I click on transfer funds");
    }

    @When("I select in the field from account the Savings account")
    public void iSelectInTheFieldFromAccountTheSavingsAccount() {
        transferPage.selecionarContaDebitada(0);
        Hooks.captureScreenshot("pass", "I select in the field from account the Savings account");
    }

    @When("I select in the field to account the Savings account")
    public void iSelectInTheFieldToAccountTheSavingsAccount() {
        transferPage.selecionarContaDestino(0);
        Hooks.captureScreenshot("pass", "I select in the field to account the Savings account");
    }

    @When("I type {string} in the field amount to transfer")
    public void I_type_in_the_field_amount_to_transfer(String valor) {
        transferPage.valorTransferencia(valor);
        Hooks.captureScreenshot("pass", "I type {string} in the field amount to transfer");
    }

    @When("I click on the buttom transfer money")
    public void I_click_on_the_buttom_transfer_money() throws InterruptedException {
        transferPage.clicarBtnTransferMoney();
    }

    @Then("the system should show the popup message {string}")
    public void theSystemShouldShowThePopupMesengeFromAccountAndToAccountFieldsCannotBeTheSame(String textoValidacao) {
        assertEquals(transferPage.validaPopUp(), textoValidacao);
        Hooks.captureScreenshot("pass", "Then the system should show the popup mesenge From Account and To Account fields cannot be the same.");
    }




}
