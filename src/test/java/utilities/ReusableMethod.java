package utilities;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.Random;

public class ReusableMethod {

    static Faker faker;
    static Actions actions;
    static Select select;
    static WebDriverWait wait;
    static Random random;

    public static Faker getFaker() { // getFaker method

        return faker = new Faker();
    }//

    public static Actions getActions() { //getActions method

        return actions = new Actions(Driver.getDriver());
    }//

    public static Select select(WebElement ddm) { //select method

        return select = new Select(ddm);
    }//

    public static void jsScrollClick(WebElement webElement) {  //kaydir ve tikla

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        try {
            webElement.click();

        } catch (Exception e) {

            js.executeScript("arguments[0].scrollIntoView(true);", webElement);
            js.executeScript("arguments[0].click()", webElement);
        }
    }//


    public static WebDriverWait driverWait(WebDriver driver, Duration duration) { //expilicity Wait

        return wait = new WebDriverWait(driver, duration);
    }//

    public static void waitFor(int sec) { //bekle
        try {
            Thread.sleep(sec * 1000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//

    public static Random random() { //random method'u

        return random = new Random();
    }//

    public static void jsScroll(WebElement webElement) {  //Sayfayi Webelemente kadar kaydir

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", webElement);
    }//

    public static void toBeClickableWait(WebElement webElement) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public static void visibilityOfWait(WebElement webElement){

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public static void visibilityOfElementLocatedWait(By locater){

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locater));
    }
}//class