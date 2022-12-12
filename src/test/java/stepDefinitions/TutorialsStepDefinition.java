package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.TutorialsPage;
import utilities.ReusableMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TutorialsStepDefinition {

    TutorialsPage page = new TutorialsPage();

    List<String> cartPhoneList;
    List<String> phoneList;

    @Then("Phones & PDAS'a tiklar")
    public void phonesPDASATiklar() {

        page.phonesAndPdas.click();
        ReusableMethod.waitFor(2);
    }

    @Then("Telefonlarin markalarini alir")
    public void telefonlarinMarkalariniAlir() {

        System.out.println("Telefon Markalari");
        int count = 1;
        for (WebElement w : page.phonesTitle) {

            System.out.println(count + " -> " + w.getText());
            count++;
        }
    }

    @Then("Tum ogeleri sepete ekler")
    public void tumOgeleriSepeteEkler() {

        for (WebElement w : page.phonesAddCart) {

            w.click();
            ReusableMethod.waitFor(2);
        }

    }

    @Then("Sepete tiklar")
    public void sepeteTiklar() {

        page.cart.click();
    }

    @Then("Sepetteki urun isimlerini alir")
    public void sepettekiUrunIsimleriniAlir() {

        System.out.println("Sepetteki Telefonlar");
        int count = 1;
        //for (WebElement w : page.sepettekiTel) {
        //    System.out.println(count + " -> " + w.getText());
        //    count++;
        //}

        cartPhoneList = new ArrayList<>(); // sepetteki urunleri bos liste atadik

        for (int i = 1; i < page.sepettekiTelefonlar.size(); i += 2) {  // +2

            System.out.println(count + " -> " + page.sepettekiTelefonlar.get(i).getText());
            cartPhoneList.add(page.sepettekiTelefonlar.get(i).getText());
            count++;
        }
        Collections.sort(cartPhoneList); // sepetteki urunleri naturel sirala

        System.out.println("*****");
        System.out.println(cartPhoneList);

    }

    @And("Sepetteki ve sayfadaki urunlerin dogru oldugunu karsilastiriniz.")
    public void sepettekiVeSayfadakiUrunlerinDogruOldugunuKarsilastiriniz() {

        phoneList = new ArrayList<>();  // telefon listesini bos liste atadik

        for (int i = 0; i < page.phonesTitle.size(); i++) {

            phoneList.add(page.phonesTitle.get(i).getText());
        }
        Collections.sort(phoneList); // telefon listesini naturel sirala

        System.out.println("*****");
        System.out.println(phoneList);


        Assert.assertEquals(phoneList, cartPhoneList); //karsilastir
    }
}
