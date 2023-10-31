package day02_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethodsTest {

    //Amazon sayfasina gidelim
    //Sayfa başlığını konsola yazdıralım
    //Sayfanın Url'ini konsola yazdıralım
    //Techproeducation sayfasına gidelim
    //Sayfa başlığını konsola yazdıralım
    //Sayfanın Url'ini konsola yazdıralım

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver(); //Boş bir web sayfası açar bize


        String amazonUrl="https://amazon.com";
        String techproUrl="https://techproeducation.com";

        //Amazon sayfasına gidelim
        driver.get(amazonUrl);

        //Sayfa Başlığını konsola yazdıralım
        String actualTitle=driver.getTitle(); //methodu gidilen sayfanın basligini verir
        System.out.println("Amazon sayfasi baslik bilgisi = " + actualTitle);

        //Sayfanın Url'ini konsola yazdıralım
        String actualUrl=driver.getCurrentUrl(); //gidilen sayfanın URL'ini verir.
        System.out.println("Amazon sayfasi Url'i = " + actualUrl);

        //Techproeducation sayfasına gidelim
        driver.get(techproUrl);

        //Sayfa başlığını konsola yazdıralım
        String techProActualTitle=driver.getTitle();
        System.out.println("techProActualTitle = " + techProActualTitle);

        //Sayfanın Url'ini konsola yazdıralım
        String techProActualUrl=driver.getCurrentUrl();
        System.out.println("TechPro Sayfası başlık bilgisi = " + techProActualUrl);


    }
}
