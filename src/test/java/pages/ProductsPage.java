package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Driver;

import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class ProductsPage {

    public ProductsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-testid='sidebar-nav-products']")
    public WebElement productsOption;

    @FindBy(xpath = "//button[@data-testid='products-add-btn']")
    public WebElement addProductButton;

    @FindBy(xpath = "//span[text()='All Categories']")
    public WebElement allCategoriesDropdown;

    @FindBy(xpath = "//span[text()='Cleaning']")
    public WebElement cleaningCategory;

    @FindBy(xpath = "//tbody/tr/td[3]")
    public List<WebElement> thirdColumnCategoryList;



}
