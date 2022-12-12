package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GuruPage {

    public GuruPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//thead//tr//th")
    public List<WebElement> theadList;

    @FindBy(xpath = "//thead//tr//th[1]")
    public WebElement company;

    @FindBy(xpath = "//thead//tr//th[2]")
    public WebElement group;

    @FindBy(xpath = "//thead//tr//th[3]")
    public WebElement prevClose;

    @FindBy(xpath = "//thead//tr//th[4]")
    public WebElement currentPrice;

    @FindBy(xpath = "//thead//tr//th[5]")
    public WebElement change;


}
