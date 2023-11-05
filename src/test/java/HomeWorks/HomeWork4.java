package HomeWorks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomeWork4 {

    public static void main(String[] args) {


                /*
                    homework



               Bulunan sonuc sayisini yazdirin
               sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
               Sayfayi kapatin
             */

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //www.google.com/ adresine gidin
        driver.get("https://www.google.com/");

        //cookies uyarisini kabul ederek kapatin
        //Sayfa basliginin “Google” ifadesi icerdigini test edin
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        System.out.println(actualTitle.contains(expectedTitle) ? "TEST PASSED" : "TEST PASSED");

        //Arama cubuguna “Selenium” yazip aratin




    }
}
