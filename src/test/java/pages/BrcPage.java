package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {

    public BrcPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = ".btn.btn-primary.btn-sm")
    public WebElement firstLoginButton;

    @FindBy(css = "#formBasicEmail")
    public WebElement emailBox;

    @FindBy(css = "#formBasicPassword")
    public WebElement passwordBox;

    @FindBy(css = "button.btn.btn-primary")
    public WebElement submitLogin;

    @FindBy(xpath = "//*[text()='invalid credentials']")
    public WebElement invalidCredentials;
}