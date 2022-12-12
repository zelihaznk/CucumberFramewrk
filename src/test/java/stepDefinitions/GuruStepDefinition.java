package stepDefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinition {

    GuruPage page = new GuruPage();

    @Then("{string} sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String baslik) {

        int index;
        for (int i = 0; i < page.theadList.size(); i++) {

            if (page.theadList.get(i).getText().equals(baslik)) { //feature'dan gelen i'ye esitse

                System.out.println("---------------------");
                System.out.println(page.theadList.get(i).getText()); //basligi yazdir
                System.out.println("---------------------");
                index = i + 1;
                List<WebElement> column =
                        Driver.getDriver().findElements(By.xpath("//tbody/tr/td[" + index + "]"));

                column.forEach(t -> System.out.println(t.getText()));
            }
        }
    }
}