package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.WebDriverUniPage;
import utilities.Driver;
import utilities.ReusableMethod;

import java.util.ArrayList;
import java.util.List;

public class WebDriverStepDefinition {

    WebDriverUniPage uniPage = new WebDriverUniPage();

    List<String> windowList;

    @Then("kullanici Login Portala kadar asagi gider")
    public void kullaniciLoginPortalaKadarAsagiGider() {

        //ReusableMethod.getActions().sendKeys(Keys.PAGE_DOWN).perform();
    }

    @Then("kullanici Login Portala tiklar")
    public void kullaniciLoginPortalaTiklar() {

        uniPage.loginPortal.click();
    }

    @And("kullanici diger windowa gecer")
    public void kullaniciDigerWindowaGecer() {

        windowList = new ArrayList<>(Driver.getDriver().getWindowHandles());

        Driver.getDriver().switchTo().window(windowList.get(1));
    }

    @And("kullanici username {string} bilgisini girer")
    public void kullaniciUsernameBilgisiniGirer(String arg0) {


        uniPage.usernameBox.sendKeys(arg0);
    }

    @And("kullanici  password {string} bilgisini girer")
    public void kullaniciPasswordBilgisiniGirer(String arg0) {

        uniPage.passwordBox.sendKeys(arg0);
    }

    @Then("kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {

        uniPage.loginButton.click();
    }

    @Then("pop up'ta cikan yazinin validation failed oldugunu test eder")
    public void popUpTaCikanYazininValidationFailedOldugunuTestEder() {

        String expectedResult = "validation failed";
        String actualResult = Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @And("kullanici OK diyerek popup'i kapatir")
    public void kullaniciOKDiyerekPopupIKapatir() {

        Driver.getDriver().switchTo().alert().accept();
    }

    @And("kullanici ilk sayfaya geri doner")
    public void kullaniciIlkSayfayaGeriDoner() {

        Driver.getDriver().switchTo().window(windowList.get(0));
    }

    @And("kullanici ilk sayfaya donuldugunu test eder")
    public void kullaniciIlkSayfayaDonuldugunuTestEder() {

        String expectedUrl = "http://webdriveruniversity.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();


        Assert.assertEquals(expectedUrl, actualUrl);
    }
}