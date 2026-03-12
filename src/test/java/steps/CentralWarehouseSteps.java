package steps;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import pages.CentralWarehousePage;
import pages.WarehousesPage;
import utils.BaseUI;

public class CentralWarehouseSteps extends BaseUI {

    CentralWarehousePage central = new CentralWarehousePage();
    WarehousesPage warehousesPage = new WarehousesPage();

    @Given("user navigates to Central Warehouse page")
    public void user_navigates_to_central_warehouse_page() {
        // 1) Go to Warehouses page
        waitAndClick(warehousesPage.warehousesOption);

        // 2) Click the warehouse link with text "Central Warehouse"
        for (WebElement link : warehousesPage.warehouseNameLinks) {
            if (link.getText().contains("Central Warehouse")) {
                waitAndClick(link);
                break;
            }
        }

        // 3) Wait for Central Warehouse header
        waitUntilVisible(10, central.centralWarehouseHeader);
        Assertions.assertTrue(central.centralWarehouseHeader.isDisplayed());
    }

    @When("user blocks an active location")
    public void user_blocks_an_active_location() {
        waitAndClick(central.firstActiveLocationBlockButton);
    }

    @Then("verify location becomes Blocked")
    public void verify_location_becomes_blocked() {
        Assertions.assertTrue(central.locationStatusList.get(0).getText().contains("Blocked"));
    }

    @Then("verify blocked count updates")
    public void verify_blocked_count_updates() {
        int count = Integer.parseInt(central.blockedCount.getText());
        Assertions.assertTrue(count > 0);
    }

    @When("user searches for {string}")
    public void user_searches_for(String code) {
        clearAndSendKeys(central.searchBox, code);
    }

    @Then("verify only locations with code {string} are displayed")
    public void verify_only_locations_with_code_are_displayed(String code) {
        for (WebElement element : central.locationCodeList) {
            Assertions.assertTrue(element.getText().contains(code));
        }
    }

    @When("user selects Active in status filter")
    public void user_selects_active_in_status_filter() {
        waitAndClick(central.statusDropdown);
        waitAndClick(central.activeStatusOption);
    }

    @Then("verify all displayed locations are Active")
    public void verify_all_displayed_locations_are_active() {
        for (WebElement status : central.locationStatusList) {
            Assertions.assertEquals("Active", status.getText().trim());
        }
    }
}
