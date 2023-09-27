package Day06_ubung_macht_meister;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class example_11 {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver" ,"resources/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



        //1- https://www.amazon.com/ sayfasina gidelim

        driver.get("https://www.amazon.com/");

       // 2- arama kutusunu locate edelim
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
       // 3- “Samsung headphones” ile arama yapalim
        aramaKutusu.sendKeys("Samsung headphones"+ Keys.ENTER);
       // 4- Bulunan sonuc sayisini yazdiralim
        WebElement result = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        System.out.println(result.getText());
        // 5- Ilk urunu tiklayalim
        driver.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[1]")).click();
       // 6- Sayfadaki tum basliklari yazdiralim
        driver.navigate().back();
        List<WebElement> liste = driver.findElements(By.xpath("//a[@class='a-link-normal s-navigation-item']"));

        for (int i = 0; i <liste.size() ; i++) {
            System.out.println(i + " " + liste.get(i).getText());
        }


        driver.close();
    }
}
