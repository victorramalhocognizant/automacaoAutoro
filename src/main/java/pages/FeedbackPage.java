package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FeedbackPage {
    private WebDriver driver;
    private String yourName = "/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[2]/td[2]/input";
    private String yourEmail = "/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[3]/td[2]/input";
    private String subject = "/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[4]/td[2]/input";
    private String questionComment = "/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[5]/td[2]/textarea";
    private String clickSumit = "/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[6]/td[2]/input[1]";
    private String textoThankYou = "/html/body/table/tbody/tr[2]/td[2]/div/h1";

    public FeedbackPage(WebDriver driver) {
        this.driver = driver;
    }

    public void opensiteFeedback() {
        driver.get("https://demo.testfire.net/feedback.jsp");
    }

    public void yourName(String keyword) {
        driver.findElement(By.xpath(yourName)).sendKeys(keyword);
    }

    public void yourEmail(String keyword) {
        driver.findElement(By.xpath(yourEmail)).sendKeys(keyword);
    }

    public void subject(String keyword) {
        driver.findElement(By.xpath(subject)).sendKeys(keyword);
        ;
    }

    public void questionComment(String keyword) {
        driver.findElement(By.xpath(questionComment)).sendKeys(keyword);
    }

    public void clickSumit() {
        driver.findElement(By.xpath(clickSumit)).click();
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public String getTextoThankYou() {
        return driver.findElement(By.xpath(textoThankYou)).getText();
    }

    public void feedback() {
        opensiteFeedback();
        yourName("Kahterin Nunez Palomino");
        yourEmail("Khaterinnunez@gmail.com");
        subject("Remessa");
        questionComment("Tempo de Remessa");
        clickSumit();
    }

}
