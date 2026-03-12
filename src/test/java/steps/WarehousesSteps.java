package steps;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import pages.WarehousesPage;
import utils.BaseUI;

public class WarehousesSteps extends BaseUI {

    WarehousesPage warehousesPage = new WarehousesPage();

    @Given("user navigates to Warehouses page")
    public void user_navigates_to_warehouses_page() {
        waitAndClick(warehousesPage.warehousesOption);
    }

    @When("user clicks each warehouse name")
    public void user_clicks_each_warehouse_name() {
        for (WebElement link : warehousesPage.warehouseNameLinks) {
            waitAndClick(link);
            waitFor(1);
            navigateBack();
        }
    }

    @Then("verify warehouse URL contains correct warehouse ID")
    public void verify_warehouse_url_contains_correct_warehouse_id() {
        for (WebElement link : warehousesPage.warehouseNameLinks) {
            String href = link.getAttribute("href");
            Assertions.assertTrue(href.contains("warehouse"));
        }
    }

    @When("user clicks each warehouse preview box")
    public void user_clicks_each_warehouse_preview_box() {
        for (WebElement card : warehousesPage.warehousePreviewCards) {
            waitAndClick(card);
            waitUntilVisible(10, warehousesPage.previewHeader);
        }
    }

    @Then("verify preview shows correct warehouse information")
    public void verify_preview_shows_correct_warehouse_information() {
        String header = warehousesPage.previewHeader.getText();
        Assertions.assertTrue(header.contains("Locations"));
    }
}
