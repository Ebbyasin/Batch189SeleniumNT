package day02_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomeWork31ekim {

    public static void main(String[] args) throws InterruptedException {

        /*
        Yeni bir class olusturalim (Homework)

         *Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i  yazdirin.
         *https://www.walmart.com/ sayfasina gidin.
         *Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
         *Tekrar “facebook” sayfasina donun
         *Sayfayi yenileyin
         *sayfayi tam sayfa (maximize) yapin
         *Sayfayi kapatin
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “Facebook” icerdigini
        //dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://facebook.com");
        String actualFaceBookTitle=driver.getTitle();
        System.out.println(actualFaceBookTitle.contains("Facebook") ? "TEST PASSED" : "actual Title : " +actualFaceBookTitle);

        //*https://www.walmart.com/ sayfasina gidin.
        Thread.sleep(3000);
        driver.get("https://www.walmart.com/");

        //*Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actualWalmartTitle=driver.getTitle();
        if (actualWalmartTitle.contains("Walmart.com")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed"+" actualWalmartTitle : " + actualWalmartTitle);

        }

        //*Tekrar “facebook” sayfasina donun
        Thread.sleep(3000);
        driver.navigate().back();

        //*Sayfayi yenileyin
        Thread.sleep(3000);
        driver.navigate().refresh();

        //*sayfayi tam sayfa (maximize) yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //*Sayfayi kapatin
        Thread.sleep(2000);
        driver.close();




    }
}
