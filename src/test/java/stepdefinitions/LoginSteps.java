package stepdefinitions;

import hooks.Hooks;
import io.cucumber.java.en.*;
import pages.LoginPage;
import pages.DashboardPage;
import org.junit.Assert;

public class LoginSteps {

    LoginPage loginPage;
    DashboardPage dashboardPage;

    /* ================= LOGIN STEPS ================= */

    @Given("user opens banking portal")
    public void user_opens_banking_portal() {
        Hooks.driver.get("https://automation-test-prac-wbfu.bolt.host/");
        loginPage = new LoginPage(Hooks.driver);
    }

    @When("user enters valid email and password")
    public void user_enters_valid_email_and_password() {
        loginPage.enterEmail("test1.com");   // ✔ corrected email
        loginPage.enterPassword("Admin@123");
    }

    @And("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        loginPage.clickSignIn();
        dashboardPage = new DashboardPage(Hooks.driver); // init after login
    }

    @Then("user should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        System.out.println("Login successful");
    }

    /* ================= DIALOG STEPS ================= */

    @When("user clicks on open dialog button")
    public void user_clicks_on_open_dialog_button() {
        dashboardPage.clickOpenDialog();
    }

    @Then("dialog should be displayed")
    public void dialog_should_be_displayed() {
        Assert.assertTrue("Dialog is not displayed", dashboardPage.isDialogDisplayed());
    }

    @And("user closes the dialog")
    public void user_closes_the_dialog() throws InterruptedException {
    	Thread.sleep(5000);
        dashboardPage.closeDialog();
    }
}
