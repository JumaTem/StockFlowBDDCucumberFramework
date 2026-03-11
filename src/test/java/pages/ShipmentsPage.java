package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class ShipmentsPage {
    public ShipmentsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-testid='sidebar-nav-shipments']")
    public WebElement shipmentsOption;

    @FindBy(xpath = "//button[@data-testid='shipment-status-filter']")
    public WebElement allStatusesDropdown;

    @FindBy(xpath = "//div[span[text()='Pending']]")
    public WebElement pendingStatus;

    @FindBy(xpath = "//tbody/tr/td[5]")//tbody/tr/td[3]
    public List<WebElement> statusColumnList;





}
