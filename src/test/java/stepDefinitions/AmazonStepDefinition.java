package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;
import utilities.ReusableMethods;

import java.io.IOException;

public class AmazonStepDefinition {

    AmazonPage page = new AmazonPage();

    @Given("Kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("Kullanici Nutella aratir")
    public void kullanici_nutella_aratir() {

        page.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
    }

    @Then("sonuclarin Nutella icerdigini test eder")
    public void sonuclarin_nutella_icerdigini_test_eder() {

        Assert.assertTrue(page.aramaSonucu.getText().contains("Nutella"));
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {

        Driver.closeDriver();
    }

    @Then("Kullanici Java icin arama yapar")
    public void kullanici_java_icin_arama_yapar() {

        page.aramaKutusu.sendKeys("Java", Keys.ENTER);
    }

    @Then("Sonuclarin Java icerdigini test eder")
    public void sonuclarin_java_icerdigini_test_eder() {

        Assert.assertTrue(page.aramaSonucu.getText().contains("Java"));
    }

    @And("kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {

        page.aramaKutusu.sendKeys("iphone", Keys.ENTER);
    }

    @Then("sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {

        Assert.assertTrue(page.aramaSonucu.getText().contains("iphone"));
    }

    @Then("Kullanici msi icin arama yapar")
    public void kullaniciMsiIcinAramaYapar() {

        page.aramaKutusu.sendKeys("msi", Keys.ENTER);
    }

    @And("Sonuclarin msi icerdigini test eder")
    public void sonuclarinMsiIcerdiginiTestEder() {

        Assert.assertTrue(page.aramaSonucu.getText().contains("msi"));
    }

    @And("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String istenenKelime) {

        page.aramaKutusu.sendKeys(istenenKelime, Keys.ENTER);
    }

    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String istenenKelime) {

        Assert.assertTrue(page.aramaSonucu.getText().contains(istenenKelime));
    }

    @Given("kullanici {string} sayfasina gider") //amazonUrl
    public void kullaniciSayfasinaGider(String istenenUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));

    }

    @And("url'in {string} icerdigini test eder")
    public void urlInIcerdiginiTestEder(String istenenKelime) {

        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenKelime));
    }

    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int istenenSaniye) {
        try {
            Thread.sleep(istenenSaniye * 1000);

        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

    @Given("kullanici {string} sitesine gider")
    public void kullaniciSitesineGider(String site) {

        Driver.getDriver().get(site);
    }
    @Then("sign in butonuna tiklar")
    public void signInButonunaTiklar() {

        ReusableMethod.getActions().moveToElement(page.helloSignInButton).perform();
        ReusableMethod.waitFor(1);
        page.signInButton.click();
    }

    @And("faker kullanarak e-posta gonderir")
    public void fakerKullanarakEPostaGonderir() {

        ReusableMethod.getActions()
                .click(page.emailBox)
                .sendKeys(ReusableMethod.getFaker().internet().emailAddress()).perform();

    }

    @Then("gonderdigi e-postanın ekran goruntusunu alir")
    public void gonderdigiEPostaninEkranGoruntusunuAlir() {

        try {
            ReusableMethods.getScreenshotWebElement("emailBoxSS", page.emailSS);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @And("continiue'a tiklar")
    public void continiueATiklar() {

        page.continueButton.click();
    }

    @Then("There was a problem mesajini dogrular")
    public void thereWasAProblemMesajiniDogrular() {

        Assert.assertTrue(page.problemMessage.isDisplayed());
    }

    @Then("Need help e tiklar")
    public void needHelpETiklar() {

        page.needHelp.click();
    }

    @Then("forgot your password e tiklar")
    public void forgotYourPasswordETiklar() {

        page.forgotYourPassword.click();
    }

    @Then("Password assistance metnini dogrular")
    public void passwordAssistanceMetniniDogrular() {

        Assert.assertTrue(page.passwordAssistance.isDisplayed());
    }

    @Then("Geri gider")
    public void geriGider() {

        Driver.getDriver().navigate().back();

        Driver.getDriver().navigate().back();
    }

    @Then("Create your account butonuna tiklar")
    public void createYourAccountButonunaTiklar() {

        page.createAccountButton.click();
    }

    @Then("Create account metnini dogrular")
    public void createAccountMetniniDogrular() {

        Assert.assertTrue(page.createAccountText.isDisplayed());
    }
}
