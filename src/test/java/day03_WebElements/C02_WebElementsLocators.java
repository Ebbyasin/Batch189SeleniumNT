package day03_WebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebElementsLocators {

    public static void main(String[] args) throws InterruptedException {






        //sayfayı kapatalım

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Google sayfasına gidelim
        driver.get("https://google.com");

        // Arama kutusunu "name" attribute e göre bularak "selenium" yazalim
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("selenium");

        // Aramayı yapalim
        searchBox.submit();

        //Başlığın selenium içerdiğini test edelim
        String actualTitle=driver.getTitle();
        String expectedTitle="selenium";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed" +" actual title "+actualTitle);
        }

        //Sayfada kaç tane link olduğunu yazdıralım
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("Linklerin sayisi = " + links.size());

        //Sayfadaki linklerin metinleri varsa konsola yazdıralım
        for (WebElement w:links) {
            if (!w.getText().isEmpty()){
                System.out.println(w.getText());//Burdaki mantığı anlamadım,muhakkak sor
            }

        }
        Thread.sleep(3000);
        //sayfayı kapatalım
        driver.close();

         /*
        Eger birden fazla webelementi locate etmek istiyorsak findElements methodu kullaniriz.
        Bu method bize elemanlari webelement olan bir list return eder

        Bir weblemente ait yaziyi alabilmek icin getText() methodunu kullanariiz

         */






    }
}
