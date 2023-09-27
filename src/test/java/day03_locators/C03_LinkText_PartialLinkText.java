package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_LinkText_PartialLinkText {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        driver.findElement(By.partialLinkText("Gif")).click();

        WebElement ggiftcardyaziElement = driver.findElement(By.className("nav-menu-logo"));

        if (ggiftcardyaziElement.isDisplayed()){
            System.out.println("passed");
        }else {
            System.out.println("Failled");
        }

        Thread.sleep(5000);
        driver.close();
    }
}
