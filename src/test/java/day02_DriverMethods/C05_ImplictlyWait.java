package day02_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_ImplictlyWait {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();//burada WebDriverManager clasından chrome driver in ayarlarını yükler,kurarız
        WebDriver driver=new ChromeDriver();//Burası bize boş bir browser açar,obje oluşturdugumuzda o clasın methodlarını kullanmaya hazır hale geliriz
        driver.manage().window().maximize();//maximize yapmaz isek benim gördügüm gibi driver da ekranı ilk hali(ufak)görür ve bazı webelementlere ulaşamaz
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//Benim browserim yukardan aşagıya calışırken aynı zamanda webbrowsere çalıştırıyor,
        // benim robotum bu aynı zamanda,bazen internet kaynaklı(hız),güncelleme vs olabilir.ey driver bekle ne için web sayfasındaki
        //browserların yüklenmesi için,max 15 sn.,misal 5 sn.de yüklendi bekleme devam et.ama 15 sn.bekledin gelmedi,hata verir..Thread devam eder
        //ama gelsede farketmez,çünkü aradığını (Webelementi)bulamadi neticede.******Bu notlar önemli****ÖNEMLİ!!!!!!****OKU****!!!
        //MAX. 15 saniye sayfadaki webelementlerin oluşması için bekler

        /*
        Bir sayfaya gittiğimizde internetten kaynakli islem yapilmak istenen webelementler hemen oluşmayabilir
        Dolayisiyla işlem yapılmak istenen webelement henüz oluşmamış ise kodlarımız bu elementi bulamaz ve hata alırız
        Bu nedenle implicitly wait kullanarak işimizin çoğunu hallederiz,bazı extra beklemeler için explicit wait konusunu
        öğreneceğiz
        */

        /*
        Web sayfalarındaki her öğe html,css,javascript bileşiminden ibarettir.misal girmen gerekeni girip giriş yaptığında işlem başarılı
        yazdıran javaScriptir.görülen her öğe webelementtir(gif,dropdown,checkBox)
        Her webelementin kendine özgü görünümü,rengi şekli var,bunlar css sayesinde olur.bu özellikleri attribute'ler ile sağlarız
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
