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

        //cntrl+shift+c -->windowslarda sag tık incele(inspect) tuşu işlemini yapar
        //hoverover -->üzerinde gezinmek

        /*
            Locators-->konum belirleyici,yer bulucu
        Bir webelementi locate etmek için 8 tane locatorumuz var(id,name,classname,tagname,linktext,
        partiallinktext,xpath,cssselector
        Bunlardan 6 tanesi html kodlarında bulunan taglar ve attributelerle ilgilidir.
        Son iki tanesi yani xpath ve css selector,bunların kombinasyonuyla ilgili,aslında çok fazla attribute
        var neden bunlar dersen,en çok kullanılan bu attributeler o yüzden.
        Adres tespit ettik tamam driver a nasıl söylerim adresi,findElement() methoduyla..

         */


        //Amazon sayfasına gidiniz
        driver.get("https://amazon.com");

        //Arama kutusunu locate ediniz ve iphone yazdırıp aratınız
        /*
        1.yol-arama kutusunu başka yerlerde de kullanacaksak tercih ederiz.
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));**normalde twotabsearchtextbox iki tane gözüküyor
        aramaKutusu.sendKeys("iphone");                               **ama diğerini hemen üstünde görüyoruz,o id değil,for
        aramaKutusu.submit();                                    **diye bir attribute ait.yani iki tane id yok aynı sonucu veren
                                                    **bir tane id olduğu için orda 2 gözüksede problem yok
         */

        //**************ÖNEMLİ*********
        //Bize interwiew de sorarlar,kaç tane locator var,sen hangisini tercih edersin..8 tane var ve ben varsa id ile almayı
        //tercih ederim,çünkü unique dir,bensersiz olur,böylelikle rahatlıkla alabilirim,denir..




        /*
        2.yol-sadece bir kere kullanacaksak bu yolu tercih ederiz.
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
        istediğimiz yaziyi gönderebiliriz,yani sendKeys methodu input tagı olan webelement lerde uygulanabilir
        Eger bir arama kutusunu locate edip text gonderirsek iki sekilde enter tusuna bastirabiliriz
        1) submit() methodu
        2) Keys.Enter
        */








    }
}
