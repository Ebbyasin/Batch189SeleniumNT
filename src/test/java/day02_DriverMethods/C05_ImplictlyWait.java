package day02_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_ImplictlyWait {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //MAX. 15 saniye sayfadaki webelementlerin oluşması için bekler
        /*
        Bir sayfaya gittiğimizde internetten kaynakli islem yapilmak istenen webelementler hemen oluşmayabilir
        Dolayisiyla işlem yapılmak istenen webelement henüz oluşmamış ise kodlarımız bu elementi bulamaz ve hata alırız
        Bu nedenle implicitly wait kullanarak işimizin çoğunu hallederiz,bazı extra beklemeler için explicit wait konusunu
        öğreneceğiz
        */

        //techpro sayfasına gidiniz
        driver.get("https://techproeducation.com");

        //sayfa başlığının TechPro Education olduğunu test ediniz
        String expectedTitle = "TechPro Education";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle.equals(expectedTitle) ? "TEST PASSED" : "TEST FAILED");


        //facebook sayfasına gidiniz
        driver.get("https://facebook.com");

        //sayfa url'inin facebook içerdiğini test ediniz
        if (driver.getCurrentUrl().contains("facebook")){
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAİLED");
        }

        //techpro sayfasına geri dönününüz
        driver.navigate().back();


        //Geri döndüğünüzü test ediniz
        actualTitle=driver.getTitle();
        System.out.println(actualTitle.equals(expectedTitle) ? "TEST PASSED" : "TEST FAILED");

        //sayfayı kapatınız
        driver.close();


    }
}
