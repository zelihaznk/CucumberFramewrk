package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebDriverUniPage {

    public WebDriverUniPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[text()='Login Portal']")
    public WebElement loginPortal;

    @FindBy(css = "#text")
    public WebElement usernameBox;

    @FindBy(css = "#password")
    public WebElement passwordBox;

    @FindBy(css = "#login-button")
    public WebElement loginButton;

}
