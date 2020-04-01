import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/Shashi_Menon/Desktop/inLearning_courses/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");

        FormAndConfirmationPage formAndConfPage = new FormAndConfirmationPage();
        formAndConfPage.submitForm(driver);
        formAndConfPage.waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!",formAndConfPage.
                getAlertBannerText(driver));

        driver.quit();
    }
}
