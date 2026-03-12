package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BaseUI;
import utils.Driver;

import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class ProductsPage extends BaseUI {

    public ProductsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static final String URL = "https://codewise-stock-flow.lovable.app/products";

    @FindBy(xpath = "//a[@data-testid='sidebar-nav-products']")
    public WebElement productsOption;


    @FindBy(xpath = "//button[@data-testid='products-add-btn']")
    public WebElement addProductButton;

    @FindBy(xpath = "//button[@data-testid='products-category-filter']")
    public WebElement allCategoriesDropdown;

    @FindBy(xpath = "//button[@data-testid='products-status-filter']")
    public WebElement allStatusesDropdown;

    @FindBy(xpath = "//button[@data-testid='products-supplier-filter']")
    public WebElement allSuppliersDropdown;

    @FindBy(xpath = "//span[text()='Cleaning']/..")
    public WebElement cleaningCategory;

    @FindBy(xpath = "//span[text()='Hardware']/..")
    public WebElement hardwareCategory;

    @FindBy(xpath = "//span[text()='Tools']/..")
    public WebElement toolsCategory;

    @FindBy(xpath = "//tbody/tr/td[3]")
    public List<WebElement> productsCategoryList;

    @FindBy(xpath = "//tbody/tr/td[4]")
    public List<WebElement> productsStatusesList;



    public void selectCategory(String category) {
        waitAndClick(allCategoriesDropdown);
        waitAndClick(Driver.getDriver().findElement(By.xpath("//span[text()='" + category + "']/..")));
    }

    public void selectStatus(String status) {
        waitAndClick(allStatusesDropdown);
        waitAndClick(Driver.getDriver().findElement(By.xpath("//span[text()='" + status + "']/..")));
    }

    public void selectSupplier(String supplier) {
        waitAndClick(allSuppliersDropdown);
        waitAndClick(Driver.getDriver().findElement(By.xpath("//span[text()='" + supplier + "']/..")));
    }


}
