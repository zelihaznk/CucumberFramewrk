package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutoPracticePage {

    public AutoPracticePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "a.login")
    public WebElement signIn;

    @FindBy(css = "#email_create")
    public WebElement emailBox;

    @FindBy(css = "span>.icon-user.left")
    public WebElement createButton;

    @FindBy(css = ".radio-inline>label")
    public List<WebElement> genders;

    @FindBy(css = "#customer_firstname")
    public WebElement firstName;

    @FindBy(css = "#days")
    public WebElement daysDdm;

    @FindBy(css = "#months")
    public WebElement monthsDdm;

    @FindBy(css = "#years")
    public WebElement yearsDdm;

    @FindBy(css = "#newsletter")
    public WebElement newsLetter;

    @FindBy(css = "#uniform-optin")
    public WebElement fromOurPartners;

    @FindBy(css = "#id_state")
    public WebElement stateDdm;

    @FindBy(css = "#id_country")
    public WebElement countryDdm;

    @FindBy(css = "#company")
    public WebElement company;

    @FindBy(css = "#postcode")
    public WebElement zipCode;

    @FindBy(css = "#other")
    public WebElement information;

    @FindBy(css = "#submitAccount")
    public WebElement registerButton;

    @FindBy(css = "#alias")
    public WebElement reference;

    @FindBy(css = "#center_column>h1")
    public WebElement myAccountText;
}