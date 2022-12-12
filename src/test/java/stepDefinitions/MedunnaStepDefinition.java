package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MedunnaPage;
import utilities.ReusableMethod;

public class MedunnaStepDefinition {

    MedunnaPage page = new MedunnaPage();

    @When("login olmak icin signin'e tiklar")
    public void loginOlmakIcinSigninETiklar() {
        page.accountMenu.click();
        page.signInLink.click();
    }

    @And("username icin {string} gonderir")
    public void usernameIcinGonderir(String arg0) {

        page.usernameBox.sendKeys(arg0);
    }

    @And("password icin {string} gonderir")
    public void passwordIcinGonderir(String arg0) {

        page.passwordBox.sendKeys(arg0);
    }

    @And("signine tiklar")
    public void signineTiklar() {

        page.signInButton.click();
    }

    @Then("Authentication information not correct uyarisini dogrular")
    public void authenticationInformationNotCorrectUyarisiniDogrular() {

        ReusableMethod.visibilityOfWait(page.authenticationText);
        Assert.assertTrue(page.authenticationText.isDisplayed());
    }
}