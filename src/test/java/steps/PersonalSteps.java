package steps;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

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

@When("I click on Btn Personal menu")
public void btnPersonalMenu() {
    personalPage.clicarBtnPersonal();
        Hooks.captureScreenshot("pass", "I click on BtnPersonal menu");
}

@When("I click on Deposit Product")
    public void depositProductt() {
        personalPage.clicarBtnDeposito();
        Hooks.captureScreenshot("pass", "I click on Deposit Product");
}

@When("I click on Checking")
    public void clickOnChecking() {
        personalPage.clicarBtnChecking();
        Hooks.captureScreenshot("pass", "I click on transfer funds");
}

@When("I click on Loan Products")
    public void clickLoanProduct() {
        personalPage.clicarBtnLoanProducts();
        Hooks.captureScreenshot("pass", "I click on LoanProducts");

}  
@When("I click on Cards")
    public void clickOnCards() {
        personalPage.clicarBtnCards();
        Hooks.captureScreenshot("pass", "I click on Cards");
}

@When("I click on Investments Insurance")
    public void clickOnInvestmentsInsurance() {
        personalPage.clicarBtnInvestmentsInsurance();
        Hooks.captureScreenshot("pass", "I click on InvestmentsInsurance");
}

@When("I click on Investments")
    public void clickOnInvestments() {
        personalPage.clicarBtnInvestments();
        Hooks.captureScreenshot("pass", "I click on Investments");
}

@When("I click on Other Services")
    public void clicarBtnOtherServices() {
        personalPage.clicarBtnOtherServices();
        Hooks.captureScreenshot("pass", "I click on OtherServices");
}

@Then("I should to return to main page")
public void Ishouldtoreturntomainpage() {
    
   personalPage.validacaoLogoSiteAutoro();
     assertTrue(personalPage.validacaoRetornoMenu());
        Hooks.captureScreenshot("pass", "I should to return to main page");
    }
}
 
