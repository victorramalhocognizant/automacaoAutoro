package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.SmallBusinessHome;

public class SmallBusinessSteps {

    private LoginPage loginPage;
    private SmallBusinessHome smallBussinesHome = new SmallBusinessHome(Hooks.getDriver());

    @Given("I open the site Autoropage")
    public void iOpenTheSiteAutoroPage() {
        loginPage = new LoginPage(Hooks.getDriver());
        loginPage.openSite();
    }

    @When("I click on the Small Business Menu")
    public void iClickOnTheSmallBusinessMenu() {
        smallBussinesHome.clicarSmallBusiness();
        Hooks.captureScreenshot("pass", "I click on the Small Business Menu");
    }

    @When("I click on deposit products")
    public void iClickOnDepositProducts() {
        smallBussinesHome.clicarDepositProducts();
        Hooks.captureScreenshot("pass", "I click on deposit products");

    }

    @When("I click on lending services")
    public void iClickOnLendingServices() {
        smallBussinesHome.clicarLinkLending();
        Hooks.captureScreenshot("pass", "I click on lending services");
    }

    @When("I click on cards")
    public void iClickOnCards() {
        smallBussinesHome.clicarLinkCards();
        Hooks.captureScreenshot("pass", "I click on cards");

    }

    @When("I click on insurance")
    public void iClickOnInsurance() {
        smallBussinesHome.clicarInsurance();
        Hooks.captureScreenshot("pass", "I click on insurance");

    }

    @When("I click on retirement")
    public void iClickOnRetirement() {
        smallBussinesHome.clicarRetirement();
        Hooks.captureScreenshot("pass", "I click on retirement");
    }

    // Retorna a funcao da lingauagem Qhuerkin
    @When("I click on other services")
    public void iClickOnOtherServices() {
        smallBussinesHome.clicarOtherServices();
        Hooks.captureScreenshot("pass", "I click on other services");
    }

}
