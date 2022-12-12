package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.AutoPracticePage;
import utilities.ReusableMethod;
import utilities.ReusableMethods;

import java.util.List;

public class AutoPracticeStepDefinition {

    AutoPracticePage page = new AutoPracticePage();

    @And("user signin linkine tiklar")
    public void userSigninLinkineTiklar() {

        page.signIn.click();
    }

    @And("user Create and accoun bolumune email adres girer")
    public void userCreateAndAccounBolumuneEmailAdresGirer() {

        page.emailBox.sendKeys(ReusableMethod.getFaker().internet().emailAddress());
    }

    @And("Create an Account butonuna basar")
    public void createAnAccountButonunaBasar() {

        page.createButton.click();
    }

    @And("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void userKisiselBilgileriniVeIletisimBilgileriniGirer() {

        int gender = ReusableMethod.random().nextInt(page.genders.size());
        page.genders.get(gender).click();

        ReusableMethod.getActions()
                .click(page.firstName)
                .sendKeys(ReusableMethod.getFaker().name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(ReusableMethod.getFaker().name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(ReusableMethod.getFaker().internet().password())
                .perform();


        //day
        List<WebElement> dayDDm = ReusableMethod.select(page.daysDdm).getOptions();
        int index = ReusableMethod.random().nextInt(dayDDm.size());
        while (index == 0) {
            index = ReusableMethod.random().nextInt(dayDDm.size());
        }
        ReusableMethod.select(page.daysDdm).selectByIndex(index);


        //month
        List<WebElement> monthDDm = ReusableMethod.select(page.monthsDdm).getOptions();
        index = ReusableMethod.random().nextInt(monthDDm.size());
        while (index == 0) {
            index = ReusableMethod.random().nextInt(monthDDm.size());
        }
        ReusableMethod.select(page.monthsDdm).selectByIndex(index);


        //year
        List<WebElement> yearsDDm = ReusableMethod.select(page.monthsDdm).getOptions();
        index = ReusableMethod.random().nextInt(yearsDDm.size());
        while (index == 0) {
            index = ReusableMethod.random().nextInt(yearsDDm.size());
        }
        ReusableMethod.select(page.yearsDdm).selectByIndex(index);

        page.newsLetter.click();

        page.fromOurPartners.click();

        ReusableMethod.getActions().click(page.company)
                .sendKeys(ReusableMethod.getFaker().company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(ReusableMethod.getFaker().address().streetAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(ReusableMethod.getFaker().address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(ReusableMethod.getFaker().address().city()).perform();

        //state
        List<WebElement> stateDDm = ReusableMethod.select(page.stateDdm).getOptions();
        index = ReusableMethod.random().nextInt(stateDDm.size());
        while (index == 0) {
            index = ReusableMethod.random().nextInt(stateDDm.size());
        }
        ReusableMethod.select(page.stateDdm).selectByIndex(index);

        page.zipCode.sendKeys("64545");

        //country
        List<WebElement> countryDDm = ReusableMethod.select(page.countryDdm).getOptions();
        index = ReusableMethod.random().nextInt(countryDDm.size());
        while (index == 0) {
            index = ReusableMethod.random().nextInt(countryDDm.size());
        }
        ReusableMethod.select(page.countryDdm).selectByIndex(index);

        ReusableMethod.getActions()
                .click(page.information).sendKeys(ReusableMethod.getFaker().toString())
                .sendKeys(Keys.TAB)
                .sendKeys(ReusableMethod.getFaker().phoneNumber().cellPhone())
                .sendKeys(Keys.TAB)
                .sendKeys(ReusableMethod.getFaker().phoneNumber().cellPhone())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .perform();

        page.reference.clear();
        page.reference.sendKeys("asdajklfhjksd");
    }

    @And("user register butonuna basar")
    public void userRegisterButonunaBasar() {

        page.registerButton.click();
    }

    @Then("hesap olusturuldugunu dogrular")
    public void hesapOlusturuldugunuDogrular() {

        Assert.assertTrue(page.myAccountText.isDisplayed());
    }
}
