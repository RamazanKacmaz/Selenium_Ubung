package Day06_ubung_macht_meister;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class exampel_4 {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver" ,"resources/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


       // 2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin
        //(title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://de-de.facebook.com/");
        String expectedTitle = "facebook";
        String actualTilt = driver.getTitle();
        if (actualTilt.contains(expectedTitle)){
            System.out.println("Title Test Passed");
        }else {
            System.out.println("Title Test Failled"+ " " + actualTilt);
        }
        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa
        //“actual” URL’i yazdirin.
        String expectedUrl = "facebook";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl)){
            System.out.println("Url Test Passed");
        }else {
            System.out.println("Url Test Failled" + actualUrl);
        }
        //4.https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com/ ");
        //5. Sayfa basliginin “Walmart” icerdigini dogrulayin.
        String expectedBaslik = "Walmart.com";
        String actualBaslik = driver.getTitle();
        if (actualBaslik.contains(expectedBaslik)){
            System.out.println("Baslik Test Passed");
        }else {
            System.out.println("Baslik Test Failled");
        }
        //6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
       // 7. Sayfayi yenileyin
        driver.navigate().refresh();
        //8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
        //9.Browser’i kapatin
        driver.close();
    }
}
