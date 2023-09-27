package Day06_ubung_macht_meister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class exampel_6 {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver" ,"resources/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       // 2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");
        //3- Category bolumundeki elementleri locate edin
        List<WebElement> categoryElment = driver.findElements(By.className("panel-title"));

       // 4- Category bolumunde 3 element oldugunu test edin
        int ecpectedElement = 3;
        int actualElement = categoryElment.size();
        if (actualElement == ecpectedElement){
            System.out.println("Passed");
        }else {
            System.out.println("Failled");
        }
        //5- Category isimlerini yazdirin
        for (WebElement each:categoryElment
             ) {
            System.out.println(each.getText());
        }
        //6- Sayfayi kapatin

        driver.close();
    }
}
