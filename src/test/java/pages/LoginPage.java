package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@data-testid='login-email-input']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@data-testid='login-password-input']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@data-testid='login-submit-btn']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[@data-testid='login-error-message']")
    public WebElement invalidCredentialsText;


}
