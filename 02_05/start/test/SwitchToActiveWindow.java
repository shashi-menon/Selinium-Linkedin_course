import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/shashi_menon/Desktop/inLearning_courses/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        Thread.sleep(5000);
        newTabButton.click();
        Thread.sleep(5000);

        String originalHandle = driver.getWindowHandle();
        //System.out.println(originalHandle);

        Set<String> allHandles = driver.getWindowHandles();
        //System.out.println(allHandles);
        for (String handle1: driver.getWindowHandles()){
            driver.switchTo().window(handle1);
            Thread.sleep(5000);
        }
        driver.switchTo().window(originalHandle);

        Thread.sleep(5000);
        driver.quit();
    }
}
