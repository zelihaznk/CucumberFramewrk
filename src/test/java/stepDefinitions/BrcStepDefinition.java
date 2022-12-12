package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.ReusableMethod;

public class BrcStepDefinition {

    BrcPage page = new BrcPage();

    @Then("gecersiz email girer")
    public void gecersizEmailGirer() {

        page.emailBox.sendKeys(ConfigReader.getProperty("wrongEmail"));
    }


    @Then("gecersiz password girer")
    public void gecersizPasswordGirer() {

        page.passwordBox.sendKeys(ConfigReader.getProperty("wrongPassword"));
    }

    @And("login butonuna basar")
    public void loginButonunaBasar() {

        page.submitLogin.click();
    }

    @And("sayfaya giris yapilamadigini test eder")
    public void sayfayaGirisYapilamadiginiTestEder() {

        ReusableMethod.visibilityOfWait(page.invalidCredentials);
        Assert.assertTrue(page.invalidCredentials.isDisplayed());
    }

    @Then("login butonuna tiklar")
    public void loginButonunaTiklar() {

        page.firstLoginButton.click();
    }

    @And("gecersiz email {string} girer")
    public void gecersizEmailGirer(String email) {

        page.emailBox.sendKeys(email);
    }

    @And("gecersiz password {string} girer")
    public void gecersizPasswordGirer(String password) {

        page.passwordBox.sendKeys(password);
    }
}
