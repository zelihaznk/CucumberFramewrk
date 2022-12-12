package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoqaPage;
import utilities.Driver;
import utilities.ReusableMethod;

import java.time.Duration;

public class DemoqaStepDefinition {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
    DemoqaPage page = new DemoqaPage();

    @Then("Alerts'e tiklayin")
    public void alertsETiklayin() {

        ReusableMethod.jsScrollClick(page.alerts);
    }

    @And("On button click,alert will apper after bes seconds karsisindaki click me butonuna basar")
    public void onButtonClickAlertWillApperAfterBesSecondsKarsisindakiClickMeButonunaBasar() {

        page.clickMeButton.click();
    }

    @And("Alerts'in gorunur olmasini bekler")
    public void alertsInGorunurOlmasiniBekler() {

        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    @Then("Allert uzerindeki yazinin This alert appeared after bes seconds oldugunu test eder")
    public void allertUzerindekiYazininThisAlertAppearedAfterBesSecondsOldugunuTestEder() {

        String expectedAlertText = "This alert appeared after 5 seconds";
        String actualAlertText = Driver.getDriver().switchTo().alert().getText();

        Assert.assertEquals(expectedAlertText, actualAlertText);
    }

    @And("Ok diyerek alerti kapatir")
    public void okDiyerekAlertiKapatir() {

        Driver.getDriver().switchTo().alert().accept();
    }


    //"https://demoqa.com/dynamic-properties"
    @Then("Will enable bes seconds butonunun enable olmasini bekler")
    public void willEnableBesSecondsButonununEnableOlmasiniBekler() {


        wait.until(ExpectedConditions.elementToBeClickable(page.willEnableButton));
    }

    @And("Will enable bes seconds butonunun enable oldugunu test eder")
    public void willEnableBesSecondsButonununEnableOldugunuTestEder() {

        Assert.assertTrue(page.willEnableButton.isDisplayed());

    }
}