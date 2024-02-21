package steps;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.PersonalPage;

public class PersonalSteps {
    private LoginPage loginPage;
    private PersonalPage personalPage = new PersonalPage(Hooks.getDriver());

@Given("I open the Site Autoropage")
    public void IopenTheSiteAutoroPage() {
        loginPage = new LoginPage(Hooks.getDriver());
        loginPage.openSite();
    }

@When("I click on Personal and  I see the {string} page")
public void btnPersonalMenu(String titulo) {
        personalPage.clicarBtnPersonal();
        assertTrue (personalPage.retornoPagina(titulo));
        Hooks.captureScreenshot("pass", "I click on Personal menu and I see the Personal page");
}

@When("I click on Deposit Product and  I see the {string} page")
    public void depositProductt(String titulo) {
        personalPage.clicarBtnDeposito();
        assertTrue (personalPage.retornoPagina(titulo));
        Hooks.captureScreenshot("pass", "I click on Deposit Product and I see the Deposit Product page");
}

@When("I click on Checking and I see the {string} page")
    public void clickOnChecking(String titulo) {
        personalPage.clicarBtnChecking();
        assertTrue (personalPage.retornoPagina(titulo));
        Hooks.captureScreenshot("pass", "I click on Checking and I see the Checking page");
}

@When("I click on Loan Products and I see the {string} page")
    public void clickLoanProduct(String titulo) {
        personalPage.clicarBtnLoanProducts();
        assertTrue (personalPage.retornoPagina(titulo));
        Hooks.captureScreenshot("pass", "I I click on Loan Products and I see the Loan Products page");

}  
@When("I click on Cards and I see the {string} page")
    public void clickOnCards(String titulo) {
        personalPage.clicarBtnCards();
        assertTrue (personalPage.retornoPagina(titulo));
        Hooks.captureScreenshot("pass", "I click on Cards and I see the Cards page");
}

@When("I click on Investments Insurance and I see the {string} page")
    public void clickOnInvestmentsInsurance(String titulo) {
        personalPage.clicarBtnInvestmentsInsurance();
        assertTrue (personalPage.retornoPagina(titulo));
        Hooks.captureScreenshot("pass", "I click on Investments Insurance and I see the Investments Insurance page");
}

@When("I click on Other Services and I see the {string} page")
    public void clicarBtnOtherServices(String titulo) {
        personalPage.clicarBtnOtherServices();
        assertTrue (personalPage.retornoPagina(titulo));
        Hooks.captureScreenshot("pass", "I click on Other Services and I see the Other Services page");
}

@Then("I should to return to main page")
public void Ishouldtoreturntomainpage() {
    
   personalPage.validacaoLogoSiteAutoro();
     assertTrue(personalPage.validacaoRetornoMenu());
        Hooks.captureScreenshot("pass", "I should to return to main page");
    }
}
 
