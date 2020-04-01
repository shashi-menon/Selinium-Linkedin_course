import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteJavascript {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/shashi_menon/Desktop/inLearning_courses/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement openModal = driver.findElement(By.id("modal-button"));
        Thread.sleep(1500);
        openModal.click();

        WebElement closeButton = driver.findElement(By.id("close-button"));
        Thread.sleep(1500);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", closeButton);
        Thread.sleep(1500);
        driver.quit();
    }
}
