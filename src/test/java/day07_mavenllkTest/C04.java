package day07_mavenllkTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04 {

    static WebDriver driver;

    @BeforeClass
    public static void setup (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com/");
    }

    @AfterClass
    public static void teardown(){
        driver.close();
    }

    @Test
    public void titleTest(){
        // 1- Title'in Amazon icerdigini test edin
        String expectedTitle ="Amazon";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title Test Passed");
        }else {
            System.out.println("Title Test Passed");
        }
    }

    @Test
    public void nutellaTest(){
        // 2- Arama kutusuna "Nutella" yazip aratin ve sonucun Nutella icerdigini test edin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        WebElement sonucYaziElementi = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        String expectedSonucIcerik = "Nutella";
        String actualSonucYazisi = sonucYaziElementi.getText();
        if (actualSonucYazisi.contains(expectedSonucIcerik)){
            System.out.println("Nutella testi PASSED");
        }else {
            System.out.println("Nutella testi FAILED");
        }
        driver.navigate().back();
    }

    @Test
    public void JavaTest(){
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Java" + Keys.ENTER);
        WebElement sonucYaziElementi = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        String expectedSonucIcerik = "Java";
        String actualSonucYazisi = sonucYaziElementi.getText();
        if (actualSonucYazisi.contains(expectedSonucIcerik)){
            System.out.println("Java testi PASSED");
        }else{
            System.out.println("Java testi FAILED");
        }
    }
}
