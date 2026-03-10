package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class InventoryPage {


    public InventoryPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-testid='sidebar-nav-inventory']")
    public WebElement inventoryOption;

    @FindBy(xpath = "//button[@data-testid='inventory-adjust-btn']")
    public WebElement adjustmentButton;

    @FindBy(xpath = "//button[@data-testid='inventory-warehouse-filter']")
    public WebElement warehouseFilter;

    @FindBy(xpath = "//span[text()='East Distribution Center']")
    public WebElement selectEastDistributionCenter;

    @FindBy(xpath = "//span[text()='West Fulfillment Hub']")
    public WebElement selectWestFulfillmentHub;

    @FindBy(xpath = "//tbody/tr/td[3]")
    public List<WebElement> warehouseCategoryList;




}
