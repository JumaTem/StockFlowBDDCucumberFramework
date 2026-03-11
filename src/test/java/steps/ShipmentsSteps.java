package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.DashboardPage;
import pages.LoginPage;
import pages.ProductsPage;
import pages.ShipmentsPage;
import utils.BaseUI;
import utils.Driver;

public class ShipmentsSteps extends BaseUI {
    WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    ProductsPage productsPage = new ProductsPage();
    ShipmentsPage shipmentsPage = new ShipmentsPage();


    @Given("user navigates to Shipments page")
    public void user_navigates_to_shipments_page() {
        waitAndClick(shipmentsPage.shipmentsOption);
    }


    @When("user selects Pending in All Statuses dropdown")
    public void user_selects_pending_in_all_statuses_dropdown() {
        waitAndClick(shipmentsPage.allStatusesDropdown);
        waitAndClick(shipmentsPage.pendingStatus);
    }


    @Then("verify {string} shipments list is displayed")
    public void verify_shipments_list_is_displayed(String status) {
        for (WebElement shipmentStatus : shipmentsPage.statusColumnList) {
            Assertions.assertEquals(status, shipmentStatus.getText().trim());
        }
    }


}


