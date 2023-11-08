package HomeWorks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomeWork5 {


        /*
             ÖDEV:
             https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
             Add Element butonuna basin 100 kez basınız
             Delete butonuna 90 kez basınız
             Ve 90 kez basıldığını doğrulayınız
      */
        public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
            driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

//Add Element butonuna 100 kez basin
            WebElement addButton = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
            for (int i = 0; i < 100; i++) {
                addButton.click();
                Thread.sleep(100);
            }

//Delete butonu’na  90 kez basin

            for (int i = 0; i < 90; i++) {
                driver.findElement(By.xpath("(//*[.='Delete'])[1]")).click();
                Thread.sleep(100);
            }

//Ve 90 kez basıldığını doğrulayınız


            int actualSize = driver.findElements(By.xpath("//*[.='Delete']")).size();
            int expectedSize = 10;
            boolean result = actualSize == expectedSize;
            System.out.println(result ? "TEST PASSED" : " TEST FAILED");

//sayfayı kapatınız
            driver.quit();

        }

}
