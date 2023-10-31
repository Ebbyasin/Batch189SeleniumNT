package day02_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.TreeMap;

public class C04_ManageMethods {
    public static void main(String[] args) throws InterruptedException {



        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //TechPro sayfasina gidelim. https://www.techproeducation.com/
        driver.get("https://www.techproeducation.com/");

        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanın konumu = " +driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutu = " + driver.manage().window().getSize());

        Thread.sleep(3000);

        //Sayfayi simge durumuna getirin
        System.out.println("Sayfanın ölçüleri = " + driver.manage().window().getSize());

        //simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().minimize();

        //Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        Thread.sleep(3000);
        driver.manage().window().maximize();
        System.out.println("Maximize durumunda  boyutu = " + driver.manage().window().getPosition());
        System.out.println("Maximize durumunda konumu = " + driver.manage().window().getSize());

        //Sayfayi fullscreen yapin
        Thread.sleep(3000);
        driver.manage().window().fullscreen();

        //Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        Thread.sleep(3000);
        System.out.println("Fullscreen durumunda  boyutu = " + driver.manage().window().getPosition());
        System.out.println("Fullscreen durumunda konumu = " + driver.manage().window().getSize());

        //Sayfayi kapatin
        driver.close();




    }
}
