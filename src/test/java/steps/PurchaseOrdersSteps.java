package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.PurchaseOrdersPage;
import utils.BaseUI;
import utils.Driver;

public class PurchaseOrdersSteps extends BaseUI {

    WebDriver driver = Driver.getDriver();
    PurchaseOrdersPage purchaseOrdersPage = new PurchaseOrdersPage();

    @Given("user is on the Purchase orders page")
    public void user_is_on_the_purchase_orders_page() {
        waitAndClick(purchaseOrdersPage.purchaseOrdersOption);
    }

    @When("user selects Sent from dropdown")
    public void user_selects_sent_from_dropdown() {
        waitAndClick(purchaseOrdersPage.allStatusesDropdown);
        waitAndClick(purchaseOrdersPage.sentStatusOption);
    }

    @Then("only purchase orders with status Sent should be displayed")
    public void only_purchase_orders_with_status_sent_should_be_displayed() {
        for (WebElement status : purchaseOrdersPage.statusColumnValues) {
            Assertions.assertTrue(status.getText().equalsIgnoreCase("Sent"));
        }
    }
}
