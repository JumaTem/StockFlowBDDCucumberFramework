package steps;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.DashboardPage;
import pages.LoginPage;
import pages.ProductsPage;
import utils.BaseUI;
import utils.Driver;

import java.util.List;

public class ProductsSteps extends BaseUI {
    WebDriver driver = Driver.getDriver();
    ProductsPage productsPage = new ProductsPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("user navigates to Products page")
    public void user_navigates_to_products_page() {
        waitUntilVisible(20, dashboardPage.dashboardText);
//        driver.navigate().to(ProductsPage.URL);
        waitAndClick(productsPage.productsOption);

    }

    @When("user selects category in All Categories dropdown verify products of that category are displayed")
    public void user_selects_category_in_all_categories_dropdown_verify_products_of_that_category_are_displayed(io.cucumber.datatable.DataTable dataTable) {
        List<String> categoriesList = dataTable.asList();
        for (String category : categoriesList) {
            productsPage.selectCategory(category);
            explicitWait(20);

            for (WebElement actualCategory : productsPage.productsCategoryList) {
                Assertions.assertEquals(actualCategory.getText(), category);
                explicitWait(20);
            }
        }
    }


    @When("user selects status in All Statuses dropdown verify products of that status are displayed")
    public void user_selects_status_in_all_statuses_dropdown_verify_products_of_that_status_are_displayed(io.cucumber.datatable.DataTable dataTable) {
        List<String> statusesList = dataTable.asList();
        for (String status : statusesList) {
            productsPage.selectStatus(status);
            explicitWait(20);

            for (WebElement actualStatus : productsPage.productsStatusesList) {
                Assertions.assertEquals(actualStatus.getText(), status);
                explicitWait(20);
            }
        }
    }






}
