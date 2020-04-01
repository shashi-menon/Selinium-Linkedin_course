import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.*;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/Shashi_Menon/Desktop/inLearning_courses/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdownMenuButton = driver.findElement(new ByCssSelector("button[data-toggle=\"dropdown\"]"));
        dropdownMenuButton.click();
        Thread.sleep(3000);

        WebElement radioButton = driver.findElement(new ByCssSelector("a[href=\"/radiobutton\"]"));
        radioButton.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
