package day04_xPath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_Locators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com/");

        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("city bike" + Keys.ENTER);

        WebElement sonucYazdirmaelemnti = driver.findElement(By.className("sg-col-inner"));
        System.out.println(sonucYazdirmaelemnti.getText());

        List<WebElement> urunlerlistesi = driver.findElements(By.className("s-image"));
        urunlerlistesi.get(12).click();

        Thread.sleep(3000);
        driver.close();

    }
}
