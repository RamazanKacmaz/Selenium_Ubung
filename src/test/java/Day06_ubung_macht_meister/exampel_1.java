package Day06_ubung_macht_meister;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class exampel_1 {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver" ,"resources/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        // 4. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());
        //5. Sayfa basliginin “Amazon” icerdigini test edin
        String expectedSayfabasligi = "Amazon";
        String actulaSayfaicerigi = driver.getTitle();
        if (actulaSayfaicerigi.contains(expectedSayfabasligi)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failled");
        }
        //6. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());
        //7. Sayfa url’inin “amazon” icerdigini test edin.
        String expectedUrl = "amazon";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failled");
        }
        //8. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());
        // 9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        String expectedSayfaIcerigi = "alisveris";
        String actalSayfIcerigi = driver.getPageSource();
        if (actalSayfIcerigi.contains(expectedSayfaIcerigi)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failled");
        }
        //10. Sayfayi kapatin.

        driver.close();

    }
}
