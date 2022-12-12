package stepDefinitions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import pages.HerOkuAppPage;
import utilities.ReusableMethod;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;

public class HerokuFormStepDefinition {

    HerOkuAppPage page = new HerOkuAppPage();

    @And("username {string} password {string} ve textarea {string} kisimlarini doldurur")
    public void usernamePasswordVeTextareaKisimlariniDoldurur(String arg0, String arg1, String arg2) {

        arg0 = ReusableMethod.getFaker().name().firstName();
        arg1 = ReusableMethod.getFaker().internet().password();
        arg2 = ReusableMethod.getFaker().toString();

        page.usernameForm.sendKeys(arg0);
        page.passwordForm.sendKeys(arg1);
        page.commentsForm.click();
        page.commentsForm.clear();
        page.commentsForm.sendKeys(arg2);

    }

    @Then("user bir dosya yukler")
    public void userBirDosyaYukler() {

        page.fileUploadForm.sendKeys("C:\\Users\\cevik\\OneDrive\\Masaüstü\\practice.txt");

        String homeDirectory = System.getProperty("user.home");
        String filePath = homeDirectory+"/Masaüstü/practice.txt";
    }

    @And("checkbox bir secer")
    public void checkboxBirSecer() {

        for (WebElement w : page.checkBoxItems) {

            if (!w.isSelected()) w.click();
        }
    }

    @And("radio iki secer")
    public void radioIkiSecer() {



        for (WebElement w : page.radioItems) {

            if (!w.isSelected()) w.click();
        }
    }

    @And("selection item uc  secer")
    public void selectionItemUcSecer() {

        ReusableMethod.select(page.multipleSelectValueDdm).selectByIndex(2);
    }

    @And("dropdown item dort secer")
    public void dropdownItemDortSecer() {

        //ReusableMethod.select(page.dropDownMenu).selectByIndex(3);

        Random random = new Random();

        int index = random.nextInt(ReusableMethod.select(page.dropDownMenu).getOptions().size()-1);
        ReusableMethod.select(page.dropDownMenu).selectByIndex(index);
    }

    @And("submite tiklar")
    public void submiteTiklar() {

        page.submitButton.click();

    }

    @And("dosyanin yuklendigini dogrular")
    public void dosyaninYuklendiginiDogrular() {


        //String filePath = "C:\\Users\\cevik\\OneDrive\\Masaüstü\\practice.txt";
        //Files.exists(Path.of(filePath));
    }
}