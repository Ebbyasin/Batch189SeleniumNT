package day02_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodsTest {

    public static void main(String[] args) {

        //Amazon sayfasina gidelim. https://www.amazon.com/
        //Sayfa basligini(title) yazdirin
        //Sayfa basliginin "Amazon" icerdigini test edin
        //Sayfa adresini(url) yazdirin
        //Sayfa url'inin "amazon" icerdigini test edin.
        //Sayfa handle degerini yazdirin
        //Sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin
        //Sayfayi kapatin.

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //Sayfa basligini(title) yazdirin
        String actualTitle=driver.getTitle();
        System.out.println("Sayfa Basliği = " +actualTitle);

        //Sayfa basliginin "Amazon" icerdigini test edin
        if (actualTitle.contains("Amazon")){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        //Sayfa adresini(url) yazdirin
        String actualUrl=driver.getCurrentUrl();
        System.out.println("Sayfa url'i = " +actualUrl);

        //Sayfa url'inin "amazon" icerdigini test edin.
        if (actualUrl.contains("amazon")){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        //Sayfa handle degerini yazdirin
        String amazonWindowHandle=driver.getWindowHandle();
        System.out.println("Sayfa Handle Değeri = " + amazonWindowHandle);

        //Sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin
        driver.getPageSource();
        if (driver.getPageSource().contains("Gateway")){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        //Sayfayi kapatin.
        driver.close();// Bu en son driverin olduğu sayfayi kapatir
        driver.quit(); //Bu da bizim otomasyon ile açtığımız birden fazla sekme ve pencereyi kapatmak için kullanırız







    }
}
