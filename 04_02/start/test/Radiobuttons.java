import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/shashi_menon/Desktop/inLearning_courses/chromedriver");

        WebDriver driver = new ChromeDriver();

        // Start Radio buttons
        driver.get("https://formy-project.herokuapp.com/radiobutton");
        WebElement radio_button1 = driver.findElement(new By.ByCssSelector("input#radio-button-1"));
        Thread.sleep(2000);
        radio_button1.click();


        WebElement radio_button2 = driver.findElement(new By.ByCssSelector("input[value='option2']"));
        Thread.sleep(2000);
        radio_button2.click();

        WebElement radio_button3 = driver.findElement(new By.ByCssSelector("label[for='radio-button-3']"));
        Thread.sleep(2000);
        radio_button3.click();
        Thread.sleep(2000);
        // End Radio buttons

        //Start Checkboxes
        driver.get("https://formy-project.herokuapp.com/checkbox");
        WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
        Thread.sleep(2000);
        checkbox1.click();

        WebElement checkbox2 = driver.findElement(By.id("checkbox-2"));
        Thread.sleep(2000);
        checkbox2.click();

        WebElement checkbox3 = driver.findElement(By.id("checkbox-3"));
        Thread.sleep(2000);
        checkbox3.click();
        Thread.sleep(2000);
        //End CheckBoxes


        driver.quit();
    }
}
