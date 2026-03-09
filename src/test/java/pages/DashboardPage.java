package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h1[text()='Dashboard']")
    public WebElement dashboardText;

    @FindBy(xpath = "//button[@data-testid='sidebar-logout-btn']")
    public WebElement signOutButton;
}
