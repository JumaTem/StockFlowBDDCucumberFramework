package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.DashboardPage;
import pages.InventoryPage;
import pages.LoginPage;
import pages.ProductsPage;
import utils.BaseUI;
import utils.Driver;

public class InventorySteps extends BaseUI {

    WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
   InventoryPage inventoryPage = new InventoryPage();



    @Given("user navigates to Inventory page")
    public void user_navigates_to_inventory_page() {
        waitAndClick(inventoryPage.inventoryOption);
    }

    @And("verify inventory filters east distribution center")
    public void user_verifies_east_distribution_center() {
        waitAndClick(inventoryPage.warehouseFilter);
        waitAndClick(inventoryPage.selectEastDistributionCenter);
        for (WebElement listCategory:  inventoryPage.warehouseCategoryList){
            Assertions.assertTrue(listCategory.getText().equals("East Distribution Center"));
        }
    }

    @And("verify inventory filters west fulfillment center")
    public void user_verifies_west_fulfillment_center() {
        waitAndClick(inventoryPage.warehouseFilter);
        waitAndClick(inventoryPage.selectWestFulfillmentHub);
        for (WebElement listCategory:  inventoryPage.warehouseCategoryList){
            waitUntilTextVisibleInElement(10, listCategory, "West Fulfillment Hub");
            Assertions.assertTrue(listCategory.getText().equals("West Fulfillment Hub"));
            System.out.println(listCategory.getText());
        }
    }
}
