package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaPage {

    public MedunnaPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "li#account-menu")
    public WebElement accountMenu;

    @FindBy(css = "a#login-item")
    public WebElement signInLink;

    @FindBy(css ="input[id=username]")
    public WebElement usernameBox;

    @FindBy(css = "input[id=password]")
    public WebElement passwordBox;

    @FindBy(css = ".btn.btn-primary")
    public WebElement signInButton;

    @FindBy(xpath = "//*[contains(text(), 'Authentication information not correct.')]")
    public WebElement authenticationText;
}
