import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage {
    public static void submitForm (WebDriver driver){
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Shashi");
        //driver.findElement(By.id("first-name")).sendKeys("Shashi");
        driver.findElement(By.id("last-name")).sendKeys("Menon");
        driver.findElement(By.id("job-title")).sendKeys("QA Engg");
        driver.findElement(By.id("radio-button-3"));
        driver.findElement(By.id("checkbox-3"));
        driver.findElement(new By.ByCssSelector("option[value='4']"));
        driver.findElement(By.id("datepicker")).sendKeys("05/06/2020");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        driver.findElement(new By.ByCssSelector(".btn.btn-lg.btn-primary"));
        driver.findElement(new By.ByCssSelector(".btn.btn-lg.btn-primary")).click();
    }

}
