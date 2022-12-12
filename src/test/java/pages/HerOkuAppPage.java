package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerOkuAppPage {

    public HerOkuAppPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@onclick='addElement()']")
    public WebElement addButonu;

    @FindBy(xpath = "//button[@class='added-manually']")
    public WebElement deleteButonu;

    @FindBy(xpath = "//button[@class='added-manually']")
    public List<WebElement> deleteListesi;

    @FindBy(xpath = "//*[text()='Add/Remove Elements']")
    public WebElement addRemoveElementsText;


    //https://testpages.herokuapp.com/styled/key-click-display-test.html

    @FindBy(css = "#button")
    public WebElement clickMeButton;

    @FindBy(xpath = "//p[.=' down 32']")
    public List<WebElement> downList;

    @FindBy(xpath = "//*[.='click']")
    public List<WebElement> clickTextList;

    //"https://testpages.herokuapp.com/styled/basic-html-form-test.html"

    @FindBy(css = "input[name=username]")
    public WebElement usernameForm;

    @FindBy(css = "input[name=password]")
    public WebElement passwordForm;

    @FindBy(css = "textarea[name=comments]")
    public WebElement commentsForm;

    @FindBy(css = "input[name=filename]")
    public WebElement fileUploadForm;

    @FindBy(css = "tr>td>input[type=checkbox]")
    public List<WebElement> checkBoxItems;

    @FindBy(xpath = "(//tr//td//input[@type='checkbox'])[1]")
    public List<WebElement> checkBox1;

    @FindBy(xpath = "(//tr//td//input[@type='checkbox'])[2]")
    public List<WebElement> checkBox2;

    @FindBy(xpath = "(//tr//td//input[@type='checkbox'])[3]")
    public List<WebElement> checkBox3;


    @FindBy(css = "tr>td>input[type=radio]")
    public List<WebElement> radioItems;

    @FindBy(css = "select[multiple=multiple]")
    public WebElement multipleSelectValueDdm;

    @FindBy(css = "select[name=dropdown]")
    public WebElement dropDownMenu;

    @FindBy(css = "input[type=submit]")
    public WebElement submitButton;

    @FindBy(css = "#_valuefilename")
    public WebElement file;
}