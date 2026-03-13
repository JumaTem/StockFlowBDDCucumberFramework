package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseUI;
import utils.Driver;

import java.util.List;

public class SuppliersPage extends BaseUI {
    public SuppliersPage(){PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@data-testid='sidebar-nav-suppliers']")
    public WebElement suppliersOption;

    @FindBy(xpath = "//input[@placeholder='Search suppliers...']")
    public WebElement suppliersSearchBotton;

    @FindBy(xpath = "//table[@data-testid='suppliers-table']")
    public WebElement suppliersTableButton;

    @FindBy(xpath = "//table[@data-testid='suppliers-table']//tbody/tr/td[1]")
    public List<WebElement> suppliersList;

}
