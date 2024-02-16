package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private String userName = "//*[@id=\"uid\"]";
    private String passward = "//*[@id=\"passw\"]";
    private String botaoLogin = "//*[@id=\"login\"]/table/tbody/tr[3]/td[2]/input";
    private String textoValidacao = "/html/body/table[2]/tbody/tr/td[2]/div/h1";
    private String textoSenhaIncorrecta = "//*[@id=\"_ctl0__ctl0_Content_Main_message\"]";
    private String textoUsuarioIncorreto = "/html/body/table/tbody/tr[2]/td[2]/div/h1";

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void openSite(){
        driver.get("https://demo.testfire.net/login.jsp");
    }
    public void loginUsuario(String keyword){
        driver.findElement(By.xpath(userName)).sendKeys(keyword);
    }
    public void loginSenha(String keyword){
        driver.findElement(By.xpath(passward)).sendKeys(keyword);
    }
    public void clickLogin(){
        driver.findElement(By.xpath(botaoLogin)).click();
    }
    public String getTitle(){
        return driver.getTitle();
    }
    public String getTextHelloJonhSmitString(){
      return driver.findElement(By.xpath(textoValidacao)).getText();
    }

    public String getTextLoginFailed(){
    return driver.findElement(By.xpath(textoSenhaIncorrecta)).getText();   
    }

    public void logarUsuario(){
        openSite();
        loginUsuario("jsmith");
        loginSenha("Demo1234");
        clickLogin();
    }
        
    public String getTextOnlineBankingLoginString(){
     return driver.findElement(By.xpath(textoUsuarioIncorreto)).getText();

}
public String validaPopup(){
    Alert popup = driver.switchTo().alert();
  String textoPopup= popup.getText();
  popup.accept();
  return textoPopup;


}
}