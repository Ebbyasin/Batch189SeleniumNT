package day02_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomeWorkArkadaslarınCozumu {
    public static void main(String[] args) throws InterruptedException {
        //Yeni bir class olusturalim (Homework)
        //ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) "Facebook" icerdigini dogrulayin
        // (verify),// degilse dogru basligi yazdirin.
        //Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i  yazdirin.
        //https://www.walmart.com/ sayfasina gidin.
        //Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
        //Tekrar "facebook" sayfasina donun
        //Sayfayi yenileyin
        //sayfayi tam sayfa (maximize) yapin
        //Sayfayi kapatin


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        String facebookUrl= "https://facebook.com/";
        driver.get(facebookUrl);

        String actualFBTitle = driver.getTitle();
        String expectedFBTitle = "Facebook";

        if (actualFBTitle.contains(expectedFBTitle)){
            System.out.println("Test Passed");
        }else {
            System.out.print("Test Failed");
            System.out.println(" Actual Title = " + actualFBTitle);
        }

        Thread.sleep(2000);
        String walmartUrl= "https://www.walmart.com/";
        driver.get(walmartUrl);

        String actualWMTitle = driver.getTitle();
        String expectedWMTitle = "Walmart.com";

        if (actualWMTitle.contains(expectedWMTitle)){
            System.out.println("Test Passed");
        }else {
            System.out.print("Test Failed");
            System.out.println(" Actual Title = " + actualWMTitle);
        }

        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.close();
    }
}
