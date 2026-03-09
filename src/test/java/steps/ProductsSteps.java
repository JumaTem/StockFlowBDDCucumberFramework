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
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    ProductsPage productsPage = new ProductsPage();


    @Given("user navigates to Products page")
    public void user_navigates_to_products_page() {
        waitAndClick(productsPage.productsOption);
    }


    @When("user selects Cleaning in All Categories dropdown")
    public void user_selects_in_all_categories_dropdown() {
        waitAndClick(productsPage.allCategoriesDropdown);
        waitAndClick(productsPage.cleaningCategory);
    }


    @Then("verify {string} products are displayed")
    public void verify_products_are_displayed(String category) {
       for (WebElement listCategory:  productsPage.thirdColumnCategoryList){
           Assertions.assertTrue(listCategory.getText().equals(category));
       }
    }
}
