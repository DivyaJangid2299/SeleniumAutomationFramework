package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//One seperate class for every page

public class LoginPage {
    //we will add locators to find the elements of the site and the action for it
    //1) Declare the locators of the elements
     private final WebDriver driver;// private as we don't want to use it anywhere except the class
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");

     //constructor
    //whatever instance of the driver is used in the test the same will be passed here and used in actions to find the elements
     public LoginPage(WebDriver driver){
       this.driver = driver;
     }
     //2)action functions in same class

    public void enterUsername(String username) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement usernameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField));
        usernameElement.sendKeys(username);
    }

    public void enterPassword(String password){
         driver.findElement(passwordField).clear();
         driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin(){
         driver.findElement(loginButton).click();
    }
}
