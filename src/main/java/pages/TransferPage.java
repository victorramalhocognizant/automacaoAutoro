package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;

public class TransferPage {
    private WebDriver driver;
    private String btnTransferFunds = "//*[contains(@id,'MenuHyperLink3')]";
    private String campoContaDebitada = "//*[contains(@id,'fromAccount')]";
    private String campoContaCreditada = "//*[contains(@id,'toAccount')]";
    private String campoValor = "//*[contains(@id,'transferAmount')]";
    private String btnTransferMoney = "//*[contains(@value,'Transfer Money')]";
    private String validacaoTransferencia = "//*[contains(@id,'_ctl0__ctl0_Content_Main_postResp')]";
    
      public TransferPage(WebDriver driver){
        this.driver = driver;
    }

    public void clicarbtnTransferFunds(){
        driver.findElement(By.xpath(btnTransferFunds)).click();
    }

    public void selecionarContaDebitada(Integer index){
        WebElement selectElement = driver.findElement(By.xpath(campoContaDebitada));
        Select select = new Select(selectElement);
        select.selectByIndex(0);
    }

    public void selecionarContaDestino(Integer index){
        WebElement selectElement = driver.findElement(By.xpath(campoContaCreditada));
        Select select = new Select(selectElement);
        select.selectByIndex(index);
    }

    public void valorTransferencia(String valor){
        driver.findElement(By.xpath(campoValor)).sendKeys(valor);
    }

    public void clicarBtnTransferMoney(){
        driver.findElement(By.xpath(btnTransferMoney)).click();
    }

    public boolean validacaoTransfer(){
       return driver.findElement(By.xpath(validacaoTransferencia)).isDisplayed();
    }

    public String validaPopUp(){
        return driver.switchTo().alert().getText();
    }
    
}
