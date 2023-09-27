package Day06_ubung_macht_meister;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class exampel_8 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver" ,"resources/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       // 1- https://www.amazon.com/ sayfasına gidin.
        driver.get("https://www.amazon.com/");
       // 2- Arama kutusuna “city bike” yazip aratin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);
       // 3- Görüntülenen sonuçların sayısını yazdırın
        WebElement elamanSayisi = driver.findElement(By.xpath("(//div[@class ='a-section a-spacing-small a-spacing-top-small'])[1]"));
        System.out.println(elamanSayisi.getText());
        // 4- Listeden ilk urunun resmine tıklayın.
        WebElement ilkurun = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
        ilkurun.click();

        Thread.sleep(2000);
        driver.close();
    }
}
