import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/shashi_menon/Desktop/inLearning_courses/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement name = driver.findElement(new By.ByCssSelector("input[placeholder*='full']"));
        WebElement button = driver.findElement(By.id("button"));

        name.sendKeys("Shashi Menon");
        name.click();
        Thread.sleep(1000);


        button.click();
        Thread.sleep(1000);

        driver.quit();
    }
}
