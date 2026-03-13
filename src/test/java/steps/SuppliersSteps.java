package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pages.DashboardPage;
import pages.LoginPage;
import pages.SuppliersPage;
import utils.BaseUI;
import utils.Driver;

public class SuppliersSteps extends BaseUI {
    WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    SuppliersPage suppliersPage=new SuppliersPage();


    @Given("user navigates to Suppliers page")
    public void user_navigates_to_suppliers_page(){
        waitAndClick(suppliersPage.suppliersOption);
    }

    @When("user searches supplier {string}")
    public void user_searches_supplier(String supplierName){
        clearAndSendKeys(suppliersPage.suppliersSearchBotton,supplierName);
    }

    @Then("verify supplier {string} is displayed")
     public void verify_supplier_is_displayed(String supplierName){
         boolean isFound=false;

         for (var supplier:suppliersPage.suppliersList){
             if (supplier.getText().contains(supplierName)){
                 isFound=true;
                 break;
             }
         }
         Assertions.assertTrue(isFound);
        }
    }


