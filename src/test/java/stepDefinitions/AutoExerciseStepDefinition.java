package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutoExercisePage;
import utilities.ReusableMethods;

import java.io.IOException;

public class AutoExerciseStepDefinition {

    AutoExercisePage page = new AutoExercisePage();

    @Then("anasayfanin basariyla gorunur oldugunu dogrulayin")
    public void anasayfaninBasariylaGorunurOldugunuDogrulayin() {

        Assert.assertTrue(page.homePage.isDisplayed());
    }

    @Then("test case butonuna tiklayin")
    public void testCaseButonunaTiklayin() {

        page.testCasesButton.click();
    }

    @Then("kullanicinin basariyla test case sayfasina yonlendirildigini dogrulayin")
    public void kullanicininBasariylaTestCaseSayfasinaYonlendirildiginiDogrulayin() {

        Assert.assertTrue(page.testCasesPage.isDisplayed());
    }

    @Then("ilgili ekranin ekran goruntusunu alir")
    public void ilgiliEkraninEkranGoruntusunuAlir() {

        try {
            ReusableMethods.getScreenshot("testCaseSS");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

