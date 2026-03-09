package steps;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.DashboardPage;
import pages.LoginPage;
import utils.BaseUI;
import utils.ConfigurationReader;
import utils.Driver;


public class LoginSteps extends BaseUI {

    WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();


    @Given("user goes to sign in page")
    public void admin_goes_to_sign_in_page() {
        driver.get(ConfigurationReader.getProperty("loginURL"));
    }

    @When("user enters username {string}")
    public void admin_enters_username(String username) {
        waitAndSendKeys(loginPage.emailInput, username);
    }

    @When("user enters password {string}")
    public void admin_enters_password(String password) {
        waitAndSendKeys(loginPage.passwordInput, password);
    }

    @When("user clicks on sign in button")
    public void admin_clicks_on_sign_in_button() {
        waitAndClick(loginPage.signInButton);
    }
    @Then("verify user signed in successfully")
    public void verify_admin_signed_in_successfully() {
        waitUntilVisible(20, dashboardPage.dashboardText);
        Assertions.assertTrue(dashboardPage.dashboardText.isDisplayed());
        waitAndClick(dashboardPage.signOutButton);
    }


}
