package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonLoginPage {

    WebDriver driver;

    // Constructor
    public AmazonLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By signInLink = By.id("nav-link-accountList");
    By email = By.id("ap_email");
    By continueBtn = By.id("continue");
    By password = By.id("ap_password");
    By signInBtn = By.id("signInSubmit");

    // Actions
    public void clickSignIn() {
        driver.findElement(signInLink).click();
    }

    public void enterEmail(String emailId) {
        driver.findElement(email).sendKeys(emailId);
        driver.findElement(continueBtn).click();
    }

    public void enterPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(signInBtn).click();
    }
}
