package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_LocatorsTagName {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.automationexercise.com/");

        List<WebElement> linkListesi = driver.findElements(By.tagName("a"));
        int actuallistsayisi =linkListesi.size();
        int expectedlistsayisi = 147;

        if (actuallistsayisi == expectedlistsayisi){
            System.out.println("passed");
        }else {
            System.out.println("failled");
        }

        driver.findElement(By.partialLinkText("Products")).click();

        WebElement specialOfferElementi = driver.findElement(By.id("sale_image"));

        if (specialOfferElementi.isDisplayed()){
            System.out.println("Passed");
        }else {
            System.out.println("Failled");
        }

        Thread.sleep(5000);
        driver.close();

    }
}
