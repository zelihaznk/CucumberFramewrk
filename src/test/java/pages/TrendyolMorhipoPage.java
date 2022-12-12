package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;


public class TrendyolMorhipoPage {

    public TrendyolMorhipoPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = ".gLFyf.gsfi")
    public WebElement googleSearchBox;

    @FindBy(xpath = "//cite[.='https://www.trendyol.com']")
    public WebElement trendyol;

    @FindBy(css = ".homepage-popup-content")
    public List<WebElement> gender;

    @FindBy(xpath = "//input[@data-testid='suggestion']")
    public WebElement trendyolSearchBox;

    @FindBy(css = "div.srch-ttl-cntnr-wrppr")
    public WebElement trendyolAramaSonucu;

    @FindBy(css = "input#pw-search-input")
    public WebElement morhipoSearchBox;

    @FindBy(css = "#total-product-count")
    public WebElement morhipoAramaSonucu;

}