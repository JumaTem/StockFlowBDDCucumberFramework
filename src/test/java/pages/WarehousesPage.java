package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class WarehousesPage {

    public WarehousesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Sidebar "Warehouses" menu
    @FindBy(xpath = "//a[@data-testid='sidebar-nav-warehouses']")
    public WebElement warehousesOption;

    // Warehouse NAME LINKS (open full-screen warehouse page)
    @FindBy(css = "a[data-testid^='warehouse-link-']")
    public List<WebElement> warehouseNameLinks;

    // Warehouse PREVIEW CARDS (click to update preview panel)
    @FindBy(css = "div.p-6.pt-6")
    public List<WebElement> warehousePreviewCards;

    // Preview header (changes when clicking a card)
    @FindBy(xpath = "//h3[contains(text(),'Locations')]")
    public WebElement previewHeader;

    // Table rows inside preview
    @FindBy(xpath = "//tr[contains(@data-testid,'location-row')]")
    public List<WebElement> warehouseRows;
}
