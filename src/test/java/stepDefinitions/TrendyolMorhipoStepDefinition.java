package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import pages.TrendyolMorhipoPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class TrendyolMorhipoStepDefinition {

    TrendyolMorhipoPage page = new TrendyolMorhipoPage();
    int trendyolAramaSonucu;
    int morhipoAramaSonucu;
    String trendyolHandle;
    String morhipoHandle;


    List<String> windowList;
    Set<String> windowHandle;
    Iterator<String> iterator;
    String parentHandle;
    String childHandle;

    @Given("google sayfasina gider")
    public void googleSayfasinaGider() {

        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
    }

    @Then("trendyolu aratir")
    public void trendyoluAratir() {

        page.googleSearchBox.sendKeys("Trendyol", Keys.ENTER);


        //windowList = new ArrayList<>(Driver.getDriver().getWindowHandles());
    }

    @And("trendyol linkini bulup siteye gider")
    public void trendyolLinkiniBulupSiteyeGider() {

        ReusableMethod.jsScrollClick(page.trendyol);

        int gender = ReusableMethod.random().nextInt(page.gender.size());

        page.gender.get(gender).click();
    }

    @Then("trendyolda makas aratir")
    public void trendyoldaMakasAratir() {

        trendyolHandle = Driver.getDriver().getWindowHandle();

        page.trendyolSearchBox.sendKeys("makas", Keys.ENTER);

        ReusableMethod.waitFor(2);
    }

    @Then("trendyoldaki arama sonucundan toplam urun sayisini alir")
    public void trendyoldakiAramaSonucundanToplamUrunSayisiniAlir() {

        trendyolAramaSonucu = Integer.parseInt(page.trendyolAramaSonucu.getText().replaceAll("\\D", ""));

        System.out.println("trendyol aramasonucu -> " + trendyolAramaSonucu);
    }

    @Then("yeni sekme morhipo anasayfasina gider")
    public void yeniSekmeMorhipoAnasayfasinaGider() {

        Driver.getDriver().switchTo().newWindow(WindowType.TAB).get("https://www.morhipo.com/");
        ReusableMethod.waitFor(2);



        //windowList = new ArrayList<>(Driver.getDriver().getWindowHandles());

        //windowHandle = Driver.getDriver().getWindowHandles();
        //iterator = windowHandle.iterator();

        //parentHandle = iterator.next();
        //childHandle = iterator.next();
    }

    @Then("morhipoda makas aratir")
    public void morhipodaMakasAratir() {

        morhipoHandle = Driver.getDriver().getWindowHandle();

        page.morhipoSearchBox.sendKeys("makas", Keys.ENTER);
    }

    @Then("morhipodaki arama sonucundan toplam urun sayisini alir")
    public void morhipodakiAramaSonucundanToplamUrunSayisiniAlir() {

        morhipoAramaSonucu = Integer.parseInt(page.morhipoAramaSonucu.getText().replaceAll("\\D", ""));

        System.out.println("morhipo arama sonu -> " + morhipoAramaSonucu);

    }

    @Then("iki sitede bulunan toplam makas sayisini karsilastirir")
    public void ikiSitedeBulunanToplamMakasSayisiniKarsilastirir() {

        if (trendyolAramaSonucu > morhipoAramaSonucu) {

            System.out.println("Trendyol makas arama sonucu daha fazla");

        }else System.out.println("Morhipo makas arama sonucu daha fazla");
    }

    @Then("Once Urun sayisi fazla olan siteyi kapatir")
    public void onceUrunSayisiFazlaOlanSiteyiKapatir() {

        if (trendyolAramaSonucu > morhipoAramaSonucu) {

            Driver.getDriver().switchTo().window(trendyolHandle).close();

            //Driver.getDriver().switchTo().window(windowList.get(0));

        } else {

            Driver.getDriver().switchTo().window(morhipoHandle).close();

            //Driver.getDriver().switchTo().window(windowList.get(1));
        }
    }

    @And("sonra diger sayfayida kapatiniz")
    public void sonraDigerSayfayidaKapatiniz() {

        ReusableMethod.waitFor(2);
        Driver.getDriver().quit();
    }
}