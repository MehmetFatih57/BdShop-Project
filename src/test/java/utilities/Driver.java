package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

/*
POM(Page Onject Model)
Test senaryolarinin daha az kod ile yazilmasina ve bakiminin daha kolay yapilmasina
olanak saglayan yazilim test yontemidir. TestNG de ve CUCUMBER de  POM kalibini kullaniriz
 */

public class Driver {
    public Driver(){
            /*
Driver class'ından obje oluşturmanın önüne geçmek için
default constructor'ı private yaparak bunun önüne geçebiliriz
Bu uygulamaya singleton patter denir
 */
    }



    static WebDriver driver;

    public static WebDriver getDriver(){
        /*
            Driver'i her cagirdigimizda yeni bir pencere acilmasinin onune gecmek icin
            if blogu icinde Eger driver'a deger atanmamis ise deger ata, eger atanmis ise
            Driver'i ayni sayfada return et.
             */

        /*
        Properties dosyasinda key olarak belirttigimiz browse'a asagidaki ornekteki gibi hangi degeri
        belirlersek testlerimiz o browser ile calisir.
         */
        if (driver == null){
            switch (ConfigReader.getProperty("browser")){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;
            }
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }

        return driver;

    }

    public static void closeDriver(){
        if (driver != null){//-->driver'a deget atanmissa
            driver.close();
            driver = null;  //--> driver'i kapattiktan sonra bosalt
        }

    }

    public static void quitDriver(){
        if (driver != null){//-->driver'a deget atanmissa
            driver.quit();
            driver = null;  //--> driver'i kapattiktan sonra bosalt
        }
    }



}
