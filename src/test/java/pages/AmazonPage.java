package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;
    @FindBy(css = ".a-section.a-spacing-small.a-spacing-top-small")
    public WebElement aramaSonucu;

    @FindBy(xpath = "(//div[@class='a-section aok-relative s-image-square-aspect'])[1]")
    public WebElement ilkUrun;

    @FindBy(xpath = "(//div[@class='a-section a-spacing-base'])[1]")
    public WebElement ilkUrunDetay;

    @FindBy(css = "#nav-link-accountList")
    public WebElement helloSignInButton;

    @FindBy(xpath = "(//*[text()='Sign in'])[1]")
    public WebElement signInButton;

    @FindBy(css = ".a-box-inner.a-padding-extra-large")
    public WebElement emailSS;
    @FindBy(css = "#ap_email")
    public WebElement emailBox;

    @FindBy(css = ".a-button-input")
    public WebElement continueButton;

    @FindBy(xpath = "//*[text()='There was a problem']")
    public WebElement problemMessage;

    @FindBy(css = ".a-expander-prompt")
    public WebElement needHelp;

    @FindBy(css = "#auth-fpp-link-bottom")
    public WebElement forgotYourPassword;

    @FindBy(css = "form>p")
    public WebElement passwordAssistance;

    @FindBy(css = "#createAccountSubmit")
    public WebElement createAccountButton;

    @FindBy(css = "div>h1")
    public WebElement createAccountText;
}
