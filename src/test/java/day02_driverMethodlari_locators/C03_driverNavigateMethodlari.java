package day02_driverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C03_driverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        String expectedTitleIcerik = "Smile more";
        String actuelTitleIcerik = driver.getTitle();

        if (actuelTitleIcerik.contains(expectedTitleIcerik)){
            System.out.println("Amozon Title test Passed");
        }else {
            System.out.println("Amozon Title test Failled");
        }
        Thread.sleep(2000);

        driver.navigate().to("https://www.youtube.com");

        String expectedUrlIcerik = "youtube";
        String actuelUrlIcerk = driver.getCurrentUrl();

        if (actuelUrlIcerk.contains(expectedUrlIcerik)){
            System.out.println("Youtube Url test Passed");
        }else {
            System.out.println("Youtube Url test Failled");
        }
        Thread.sleep(2000);

        driver.navigate().back();

        String unexpectedUrlIcerik = "amazon";
        actuelUrlIcerk = driver.getCurrentUrl();

        if (actuelUrlIcerk.contains(unexpectedUrlIcerik)) {

            System.out.println(" Amazon Url Test Passed");
        }else {
            System.out.println("Amazon Url Test Failled");
        }

        Thread.sleep(2000);

        driver.navigate().forward();

        String expectedSayfaIcerik = "music";
        String actuelSayfaIcerik = driver.getPageSource();

        if (actuelSayfaIcerik.contains(expectedSayfaIcerik)){
            System.out.println(" Youtube kaynak kodu testi Passed");
        }else {
            System.out.println("Youtube kaynak kodu testi  Failled");
        }


        Thread.sleep(2000);
        driver.close();
    }
}
