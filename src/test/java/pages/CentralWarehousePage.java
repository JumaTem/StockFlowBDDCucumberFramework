package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class CentralWarehousePage {

    public CentralWarehousePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Warehouse')]")
    public WebElement centralWarehouseHeader;

    @FindBy(xpath = "//input[@data-testid='loc-search']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@data-state='closed']")
    public WebElement statusDropdown;

    @FindBy(xpath = "//span[normalize-space()='Active']")
    public WebElement activeStatusOption;

    // CODE column
    @FindBy(xpath = "//tr[contains(@data-testid,'wh-loc-row')]/td[1]")
    public List<WebElement> locationCodeList;

    // STATUS column
    @FindBy(xpath = "//tr[contains(@data-testid,'wh-loc-row')]/td[2]//div")
    public List<WebElement> locationStatusList;

    // Activate button
    @FindBy(xpath = "//button[normalize-space()='Activate']")
    public WebElement firstActiveLocationBlockButton;

    // Blocked count
    @FindBy(xpath = "//span[contains(text(),'blocked')]")
    public WebElement blockedCount;
}
