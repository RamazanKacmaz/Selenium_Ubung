package day02_driverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_IlkOtomasyonTesti {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com/");
        System.out.println(driver.getTitle());
        System.out.println("===========================");

        String expectedIcerik = "Amazon";
        String actualIcerik = driver.getTitle();

        if (actualIcerik.contains(expectedIcerik)){
            System.out.println("Passed" +" " +  expectedIcerik);
        }else {
            System.out.println("Failled"+ actualIcerik);
        }

        System.out.println("===========================");

        System.out.println(driver.getCurrentUrl());


        String expectedUrlicerik = "amazon";
        String actualUrlIcerik = driver.getCurrentUrl();

        if (actualUrlIcerik.contains(expectedUrlicerik)){
            System.out.println("Passed" + actualUrlIcerik);
        }else {
            System.out.println("Failled" + expectedIcerik);
        }

        System.out.println("===========================");

        System.out.println(driver.getWindowHandle());

        System.out.println("===========================");

        String expectedSayfaIcerigi = "sell";
        String actualSayfaIcerigi = driver.getPageSource();


        if (actualSayfaIcerigi.contains(expectedSayfaIcerigi)){
            System.out.println("Passed");
        }else {
            System.out.println("Failled");
        }

        System.out.println("===========================");

        Thread.sleep(2000);
        driver.close();


    }

}
