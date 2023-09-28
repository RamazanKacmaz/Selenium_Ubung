package day07_mavenllkTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;

public class C02 {

    WebDriver driver = new ChromeDriver();

    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void amazonTest(){
        setup();
        driver.get("https://www.amazon.com/");
        String expectedUrl = "amazon";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl)){
            System.out.println("Url Test Passed");
        }else {
            System.out.println("Url Test Failled");
        }
        ReusableMethods.bekle(2);
        driver.close();
    }

    @Test
    public void youtubeTest(){
        setup();
        driver.get("https://www.youtube.com/");
        String expectedTitle = "best";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title Test Passed");
        }else {
            System.out.println("Title Test Failled");
        }

        ReusableMethods.bekle(2);
        driver.close();
    }

    @Test
    public void uTest(){
        driver.get("https://www.utest.com/");
        String expectedsayfa = "test";
        String  actualSayfa = driver.getPageSource();

        if (actualSayfa.contains(expectedsayfa)){
            System.out.println("Sayfa Test Passed");
        }else {
            System.out.println("Sayfa Test Failled");
        }

        ReusableMethods.bekle(2);
        driver.close();
    }
}
