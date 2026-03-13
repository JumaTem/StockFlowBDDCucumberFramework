package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class PurchaseOrdersPage {

    public PurchaseOrdersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "a[data-testid='sidebar-nav-purchase-orders']")
    public WebElement purchaseOrdersOption;

    @FindBy(css = "button[data-testid='po-create-btn']")
    public WebElement createPOButton;

    @FindBy(css = "[data-testid='po-status-filter']")
    public WebElement allStatusesDropdown;

    @FindBy(xpath = "//span[text()='Sent']")
    public WebElement sentStatusOption;

    @FindBy(css = "[data-testid='po-supplier-filter']")
    public WebElement allSuppliersDropdown;

    @FindBy(xpath = "//span[text()='TechSource Ltd']")
    public WebElement techSourceLtdSupplierOption;

    @FindBy(xpath = "//table[@data-testid='po-table']//tbody/tr/td[2]")
    public List<WebElement> supplierColumnValues;

    @FindBy(xpath = "//table[@data-testid='po-table']//tbody/tr/td[3]")
    public List<WebElement> statusColumnValues;
}
