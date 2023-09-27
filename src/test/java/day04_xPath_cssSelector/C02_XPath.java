package day04_xPath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_XPath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@*='addElement()']")).click();
        Thread.sleep(2000);

        WebElement deleteButonu = driver.findElement(By.xpath("//button[@*='deleteElement()']"));

        if (deleteButonu.isDisplayed()){
            System.out.println("Passed");
        }else {
            System.out.println("failled");
        }

        Thread.sleep(2000);

        deleteButonu.click();

        Thread.sleep(2000);

        WebElement addRemoveyazisiElementi = driver.findElement(By.xpath("//h3"));

        if (addRemoveyazisiElementi.isDisplayed()){
            System.out.println("passed");
        }else {
            System.out.println("Faillled");
        }


        Thread.sleep(2000);
        driver.close();

    }
}
