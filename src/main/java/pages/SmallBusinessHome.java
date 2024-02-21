package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SmallBusinessHome {

    private WebDriver driver;
    private String btnSmallBusiness = "//*[@id=\"CatLink2\"]";
    private String linkDepositProducts = "//*[@id=\"MenuHyperLink7\"]";
    private String linkLendind = "//*[@id=\"MenuHyperLink8\"]";
    private String linkCards = "//*[@id=\"MenuHyperLink9\"]";
    private String linkInsurance = "//*[@id=\"MenuHyperLink10\"]";
    private String linkRetirement = "//*[@id=\"MenuHyperLink11\"]";
    private String otherServices = "//*[@id=\"MenuHyperLink12\"]";
    private String validacaoRetornoAoMenu = "/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td[1]/center/img";
    private String validacaoAutoroMutualLogo = "//*[@id=\"HyperLink1\"]/img";

    public SmallBusinessHome(WebDriver driver) {
        this.driver = driver;
    }

    public void clicarSmallBusiness() {
        driver.findElement(By.xpath(btnSmallBusiness)).click();
    }

    public void clicarDepositProducts() {
        driver.findElement(By.xpath(linkDepositProducts)).click();

    }

    public void clicarLinkLending() {
        driver.findElement(By.xpath(linkLendind)).click();

    }

    public void clicarLinkCards() {
        driver.findElement(By.xpath(linkCards)).click();
    }

    public void clicarInsurance() {
        driver.findElement(By.xpath(linkInsurance)).click();
    }

    public void clicarRetirement() {
        driver.findElement(By.xpath(linkRetirement)).click();
    }

    public void clicarOtherServices() {
        driver.findElement(By.xpath(otherServices)).click();
    }

    public Boolean retornoAoMenu() {
        return driver.findElement(By.xpath(validacaoRetornoAoMenu)).isDisplayed();
        // Validar algo que aparec na tela, uso isDispalyed nao .Click
        // quando rodar esse codigo preciso de uma resposta: True or false
    }

    public void validacaoAutoroMutualLogo() {
        driver.findElement(By.xpath(validacaoAutoroMutualLogo)).click();
    }
}
