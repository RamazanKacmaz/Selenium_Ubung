package day04_xPath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_XPath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);

        String expectedIcerik = "Spend less";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedIcerik)){
            System.out.println("Title testi PASSED");
        }else{
            System.out.println("Title testi FAILED");
        }
        Thread.sleep(2000);


        driver.findElement(By.linkText("Gift Cards")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Specialty Gift Cards")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//li[@class='a-carousel-card acswidget-carousel__card'])[1]"))
                .click();
        Thread.sleep(2000);

        driver.findElement(By.id("gc-mini-picker-amount-2")).click();
        Thread.sleep(2000);

        WebElement urunFiyatElementi = driver.findElement(By.xpath("//div[@id='gc-live-preview-amount-container']"));

        String expectedUrunUcreti = "25$";
        String actualUrunUcreti = urunFiyatElementi.getText();

        if (expectedUrunUcreti.equals(actualUrunUcreti)){
            System.out.println("Urun ucret testi PASSED");
        }else{
            System.out.println("Urun ucret testi FAILED");
            System.out.println("Actual urun ucreti : " + actualUrunUcreti);
        }

        driver.close();
    }
}
