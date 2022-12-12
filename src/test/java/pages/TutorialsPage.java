package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TutorialsPage {

    public TutorialsPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = ".nav.navbar-nav>:nth-child(6)")
    public WebElement phonesAndPdas;

    @FindBy(css = ".caption>h4>a")
    public List<WebElement> phonesTitle;

    @FindBy(css = ".button-group>button>span")
    public List<WebElement> phonesAddCart;

    @FindBy(css = "#cart")
    public WebElement cart;

    @FindBy(xpath = "//tbody//tr//td//a")
    public List<WebElement> sepettekiTelefonlar;

}
