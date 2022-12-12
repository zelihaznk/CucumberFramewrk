package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.HerOkuAppPage;
import utilities.ReusableMethod;


public class HerOkuAppStepDefinition {
    HerOkuAppPage page = new HerOkuAppPage();

    @Given("add element butonuna basar")
    public void add_element_butonuna_basar() {

        page.addButonu.click();
    }

    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() {

        ReusableMethod.visibilityOfWait(page.deleteButonu);
    }

    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {

        Assert.assertTrue(page.deleteButonu.isDisplayed());
    }

    @Then("Delete butonuna basar")
    public void delete_butonuna_basar() {

        page.deleteButonu.click();
    }

    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {

        Assert.assertTrue(page.deleteListesi.isEmpty());
    }
    @Then("Add Remove Elements yazisinin gorundugunu test edin")
    public void addRemoveElementsYazisininGorundugunuTestEdin() {


        String expectedText = "Add/Remove Elements";
        String actualText = page.addRemoveElementsText.getText();
        Assert.assertEquals(expectedText, actualText);
    }


    //https://testpages.herokuapp.com/styled/key-click-display-test.html
    @Then("{int} defa click me botonuna tikla")
    public void defaClickMeBotonunaTikla(int arg0) {

        while (arg0 != 0) {
            page.clickMeButton.click();
            arg0--;
        }
    }

    @And("{int} defa space dugmesine tikla")
    public void defaSpaceDugmesineTikla(int arg0) {

        while (arg0 != 0) {
            ReusableMethod.getActions().sendKeys(Keys.SPACE).perform();
            arg0--;
        }
    }

    int down32Sum = 0;

    @Then("Down yazisindaki iki basamakli sayilarin hepsini toplayin")
    public void downYazisindakiIkiBasamakliSayilarinHepsiniToplayin() {

        for (WebElement w : page.downList) { //   [^0-9]
            down32Sum += Integer.parseInt(w.getText().replaceAll("\\D", ""));
        }
        System.out.println(down32Sum);

        //lambda
        down32Sum = page.downList.stream().
                map(t -> (Integer.parseInt(t.getText().replaceAll("\\D", "")))).
                reduce(0, (t, u) -> t + u);
    }

    int clickTextLengthSum = 0;
    int result = 0;

    @And("tum click metinlerinin uzunlugunun toplamini onceki toplamdan cikarin")
    public void tumClickMetinlerininUzunlugununToplaminiOncekiToplamdanCikarin() {

        for (WebElement w : page.clickTextList) {

            clickTextLengthSum += w.getText().length();
        }
        result = down32Sum - clickTextLengthSum;
        System.out.println("result -> " + result);

        //lambda
        clickTextLengthSum = page.clickTextList.stream()
                .map(t -> t.getText().length())
                .reduce(0, Integer::sum);
    }

    @And("sonucun {int} oldugunu dogrulayin")
    public void sonucunOldugunuDogrulayin(int sonuc) {

        Assert.assertEquals(sonuc, result);
    }
}