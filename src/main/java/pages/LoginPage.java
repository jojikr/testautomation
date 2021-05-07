package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By username = By.id("username");
    private By password = By.id("password");
    private By loginBtn = By.cssSelector("#login button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(String username){
        driver.findElement(this.username).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(this.password).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton(){

        driver.findElement(loginBtn).click();
        return new SecureAreaPage(driver);
    }
}