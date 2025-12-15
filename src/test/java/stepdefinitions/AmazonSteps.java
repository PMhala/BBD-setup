package stepdefinitions;

import org.openqa.selenium.WebDriver;
import hooks.Hooks;
import pages.AmazonLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class AmazonSteps {

    WebDriver driver;
    AmazonLoginPage loginPage;

    @Given("user opens amazon website")
    public void user_opens_amazon_website() {
        driver = Hooks.driver;   
        driver.get("https://www.amazon.com");
        loginPage = new AmazonLoginPage(driver);
    }

    @When("user clicks on sign in")
    public void user_clicks_on_sign_in() {
        loginPage.clickSignIn();
    }

    @When("user enters email and password")
    public void user_enters_email_and_password() {
        loginPage.enterEmail("test@gmail.com");
        loginPage.enterPassword("test123");
    }

    @Then("user should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        System.out.println("Login flow executed");
    }
}
