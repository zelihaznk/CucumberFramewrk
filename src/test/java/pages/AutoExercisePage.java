package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoExercisePage {

    public AutoExercisePage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@href='/test_cases']")
    public WebElement testCasesButton;

    @FindBy(xpath = "//*[@id='form']")
    public WebElement testCasesPage;

    @FindBy(css = "section[id=slider]")
    public WebElement homePage;
}
