package Day06_ubung_macht_meister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class exampel_7 {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver" ,"resources/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/ ");
        //3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> listler = driver.findElements(By.tagName("a"));
        int expectedList = 147;
        int actualList = listler.size();
        if (actualList == expectedList){
            System.out.println("Link sayisi testi Passed");
        }else {
            System.out.println("Link sayisi testiFailled");
        }
        //4- Products linkine tiklayin
        driver.findElement(By.partialLinkText("Products")).click();
        //5- special offer yazisinin gorundugunu test edin
        WebElement elementYazisi = driver.findElement(By.id("sale_image"));

        if (elementYazisi.isDisplayed()){
            System.out.println("Special Offer testi  Passed");
        }else {
            System.out.println("Special Offer testi Failled");
        }
        //6- Sayfayi kapatin
        driver.close();
    }
}
