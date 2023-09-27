package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_IlkTestOtomasyonu {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com/");

        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));

        aramakutusu.sendKeys("Nutella" + Keys.ENTER);

        List<WebElement> elementlerinListesi = driver.findElements(By.className("sg-col-inner"));
        String actualaramaSonucu = elementlerinListesi.get(0).getText();

        String expectedIcerik = "Nutella";

        if (actualaramaSonucu.contains(expectedIcerik)){
            System.out.println("Passed");
        }else {
            System.out.println("failled");
        }



        driver.close();

    }
}
