package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private String searchBar = "//*[@id=\"APjFqb\"]";
    private String loginButton = "//*[@id=\"gb\"]/div/div[2]/a";

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    
    public void open(){
        driver.get("https://www.google.com");
    }

    public void search(String keyword){
        driver.findElement(By.xpath(searchBar)).sendKeys(keyword);
        driver.findElement(By.xpath(searchBar)).sendKeys(Keys.ENTER);
    }

    public void clickLogin(){
        driver.findElement(By.xpath(loginButton)).click();
    }

    public String getTitle(){
        return driver.getTitle();
    }
}
