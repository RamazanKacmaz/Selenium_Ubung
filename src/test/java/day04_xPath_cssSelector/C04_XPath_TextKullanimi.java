package day04_xPath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_XPath_TextKullanimi {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        driver.findElement(By.xpath("//button[text() = 'Add Element']")).click();
        Thread.sleep(2000);

        WebElement deleteButonu = driver.findElement(By.xpath("//*[text() = 'Delete']"));
        if (deleteButonu.isDisplayed()){
            System.out.println("Delete buton testi PASSED");
        }else{
            System.out.println("Delete buton testi FAILED");
        }
        Thread.sleep(2000);

        deleteButonu.click();
        Thread.sleep(2000);

        WebElement addRemoveYaziElementi = driver.findElement(By.xpath("//*[text() = 'Add/Remove Elements']"));
        if (addRemoveYaziElementi.isDisplayed()){
            System.out.println("Add/Remove yazi testi PASSED");
        }else {
            System.out.println("Add/Remove yazi testi FAILED");
        }
        Thread.sleep(2000);
        driver.close();

    }
}
