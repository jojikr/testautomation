package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private WebDriver driver;
    private By triggerAlertBtn = By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerConfirmBtn = By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerPromptBtn = By.xpath(".//button[text()='Click for JS Prompt']");

    private By results = By.id("result");

    public AlertsPage(WebDriver driver){
        this.driver = driver;
    }

    public void triggerAlert(){

        driver.findElement(triggerAlertBtn).click();
    }

    public void triggerConfirm(){

        driver.findElement(triggerConfirmBtn).click();
    }

    public void triggerPrompt(){

        driver.findElement(triggerPromptBtn).click();
    }

    public void clickToAccept_alertBox(){

        driver.switchTo().alert().accept();
    }

    public void clickToDismiss_alertBox(){

        driver.switchTo().alert().dismiss();
    }

    public String getText_alertBox(){

        return driver.switchTo().alert().getText();
    }

    public void alertInput(String text){

        driver.switchTo().alert().sendKeys(text);
    }

    public String getResult(){

        return driver.findElement(results).getText();
    }
}
