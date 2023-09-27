package Day05_übung;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class day05 {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com/");

        /*String ecpectedTitleicerik = "amazon";
        String actualTitleIcerik = driver.getTitle();

        if (actualTitleIcerik.contains(ecpectedTitleicerik)){
            System.out.println("Passed");
        }else {
            System.out.println("Failled");
        }*/

       /* String  expectedUrlIcerik = "amazon";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("Passed : " + " " + actualUrl);
        }else {
            System.out.println("Failled");
        }*/

        //9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin

       /* String expectedSayfaIcerigi = "Sell";
        String actualSayfaIcerigi = driver.getPageSource();

        if (actualSayfaIcerigi.contains(expectedSayfaIcerigi)){
            System.out.println("Passed : " + " ");
        }else {
            System.out.println("Failled : " + " ");
        }
        Thread.sleep(2000);
        driver.navigate().to("https://www.youtube.com/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().forward();

        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("Nutella" + Keys.ENTER);*/


        /*

        Software testi icin tasarim asamasinda
        belirlenen sonuclar (Expected Result)

        uygulamanin kendisinden alinan
        sonuclar (Actual Result) karsilastirilir.

        Expected ve actual result birbirine esit
        ise test basarili (Test Passed),
        Expected ve actual result birbirine esit
        degilse test basarisiz (Test Failed)
        olarak raporlanir.





         */


    }
}
