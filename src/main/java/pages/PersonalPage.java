package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalPage {
   
    private WebDriver driver;
    private String personal = "//*[@id=\"CatLink1\"]";
    private String depositProduct = "//*[@id=\"MenuHyperLink1\"]";
    private String checking = "//*[@id=\"MenuHyperLink2\"]";
    private String loanProducts = "//*[@id=\"MenuHyperLink3\"]";
    private String cards = "//*[@id=\"MenuHyperLink4\"]";
    private String investmentsInsurance = "//*[@id=\"MenuHyperLink5\"]";
    private String otherServices = "//*[@id=\"MenuHyperLink6\"]";
    private String validacaoRetornoMenu = "/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td[1]/b[1]/a";
    private String validacaoLogoSiteAutoro  = "//*[@id=\"HyperLink1\"]/img"; 
    private String retornoPagina = "/html/body/table/tbody/tr[2]/td[2]/div[1]/h1";

    public PersonalPage(WebDriver driver){
        this.driver = driver;
    }
    public void clicarBtnPersonal(){
        driver.findElement(By.xpath(personal)).click();
    }
    public void clicarBtnDeposito(){
        driver.findElement(By.xpath(depositProduct)).click();
    }
    public void clicarBtnChecking(){
        driver.findElement(By.xpath(checking)).click();
    }
    public void clicarBtnLoanProducts(){
        driver.findElement(By.xpath(loanProducts)).click();
    }
    public void clicarBtnCards(){
        driver.findElement(By.xpath(cards)).click();
    }
    public void clicarBtnInvestmentsInsurance(){
        driver.findElement(By.xpath(investmentsInsurance)).click();
    }
    
    public void clicarBtnOtherServices(){
        driver.findElement(By.xpath(otherServices)).click();
}
 
    public Boolean validacaoRetornoMenu (){
        return driver.findElement(By.xpath(validacaoRetornoMenu)).isDisplayed();
    //Validar algo que aparec na tela, uso isDispalyed nao .Click
    //quando rodar esse codigo preciso de uma resposta: True or false
}

    public void validacaoLogoSiteAutoro(){
        driver.findElement(By.xpath(validacaoLogoSiteAutoro)).click();
}
    public Boolean retornoPagina (String titulo) {
                return driver.findElement(By.xpath(retornoPagina)).getText().equals(titulo);
}     

}
