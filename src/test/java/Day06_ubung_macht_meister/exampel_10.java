package Day06_ubung_macht_meister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class exampel_10 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver" ,"resources/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);
        //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
        Thread.sleep(2000);
        // 5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String expectedTitle = "Spend less";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title Test Passed");
        }else {
            System.out.println("Title Test Failled");
        }
        Thread.sleep(2000);
        //6- Gift Cards sekmesine basin
        driver.findElement(By.linkText("Gift Cards")).click();
        Thread.sleep(2000);
        //7- Specialty Gift Cards butonuna basin
            driver.findElement(By.linkText("Specialty Gift Cards")).click();
        //8- ilk urunu tiklayin
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[1]")).click();
        //9- Gift card details’den 25 $’i secin
        Thread.sleep(2000);
        WebElement para = driver.findElement(By.id("gc-mini-picker-amount-2"));
        //10-Urun ucretinin 25$ oldugunu test edin
        String expectedUrunUcreti = "25$";
        String actualucret = para.getText();

        if (actualucret.equals(expectedUrunUcreti)){
            System.out.println("Passed");
        }else {
            System.out.println("Failled");
        }
        //11-Sayfayi kapatin
        Thread.sleep(2000);
        driver.close();
    }
}
