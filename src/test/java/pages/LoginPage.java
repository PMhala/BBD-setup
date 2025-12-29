package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    // Constructor → receives driver from Hooks
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By email = By.id("email");
    By password = By.id("password");
    By signInBtn = By.xpath("//button[text()='Sign In']");

    // Actions
    public void enterEmail(String value) {
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys(value);
    }

    public void enterPassword(String value) {
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(value);
    }

    public void clickSignIn() {
        driver.findElement(signInBtn).click();
    }
}
