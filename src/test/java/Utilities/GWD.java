package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Locale;

public class GWD {



    private static WebDriver driver;


    public static WebDriver getDriver() {

        //extend report türkçe bilg çalışmaması sebebiyle kondu
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

       if (driver==null) {
           driver = new ChromeDriver();
           driver.manage().window().maximize(); //ekrani max yapar
           driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); //30 sn sayfayi yukleme muhleti
       }

        return driver;
    }



    public static void quitDriver() {

        //test sonucu ekranı bir miktar beklesin diye
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (driver!=null) { //driver var ise
            driver.quit();
            driver=null;

        }
    }



}
