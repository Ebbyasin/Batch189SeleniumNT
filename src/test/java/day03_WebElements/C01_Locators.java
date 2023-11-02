package day03_WebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {

    public static void main(String[] args) {




        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasına gidiniz
        driver.get("https://amazon.com");

        //Arama kutusunu locate ediniz ve iphone yazdırıp aratınız
        /*
        1.yol
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("iphone");
        aramaKutusu.submit();
        */
        /*
        2.yol
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        */

        /*
        3.yol name attribute kullanarak
        */
        driver.findElement(By.name("field-keywords")).sendKeys("iphone",Keys.ENTER);


        //sayfayı kapatınız
        driver.close();

        /*
        Locate ettiğimiz webelement <input> tagina sahip ise o webelemente sendKeys methodu aracılığı ile
        istediğimiz yaziyi gönderebiliriz
        Eger bir arama kutusunu locate edip text gonderirsek iki sekilde enter tusuna bastirabiliriz
        1) submit() methodu
        2) Keys.Enter
        */








    }
}
