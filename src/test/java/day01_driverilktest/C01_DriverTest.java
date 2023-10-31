package day01_driverilktest;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C01_DriverTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();//sisteme chrome driver ayarlamalarımı yaptım bununla
        WebDriver driver=new ChromeDriver();//burayı dinleyip ne için yaptığını not al.Bu objeyi oluşturmak chrome sayfası açmak demektir
        driver.get("https://google.com");

        // WebDriverManager.firefoxdriver().setup();       --> firefox bende yüklü olmadığı için bu kısmı yorum olarak aldım.
        // WebDriver firefoxDriver = new FirefoxDriver();
        // firefoxDriver.get("https://google.com");

        WebDriverManager.edgedriver().setup();
        WebDriver edgeDriver=new EdgeDriver();
        edgeDriver.get("https://google.com");



        /*
        WebDriverManager sayesinde istediğmiz browseri rahatlıkla setup yaparak otomasyonda kullanabiliriz
         Bu sayede gerekli olan driveri bilgisayarimiza indirmek, yapilandirmak... zorunda kalmayiz
        */


    }
}
