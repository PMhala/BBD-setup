package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class DashboardPage {

    WebDriver driver;
    WebDriverWait wait;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    By openDialogBtn  = By.xpath("//button[@data-testid='open-dialog-button']");
    By closeDialogBtn = By.xpath("//button[@data-testid='modal-close-action-button']");
    By dialogBox      = closeDialogBtn; // reuse close button as dialog proof
    // Actions
    public void clickOpenDialog() {
        wait.until(ExpectedConditions.elementToBeClickable(openDialogBtn)).click();
    }

    public boolean isDialogDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(dialogBox)).isDisplayed();
    }

    public void closeDialog() {
        wait.until(ExpectedConditions.elementToBeClickable(closeDialogBtn)).click();
    }
}
