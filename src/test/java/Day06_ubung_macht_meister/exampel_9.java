package Day06_ubung_macht_meister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class exampel_9 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver" ,"resources/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin
        WebElement butonatikla = driver.findElement(By.xpath("(//button[@onclick='addElement()'])[1]"));
        butonatikla.click();
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement buttongorunur = driver.findElement(By.xpath("(//button[@onclick='deleteElement()'])[1]"));
        if (buttongorunur.isDisplayed()){
            System.out.println("Passed : Delete");
        }else {
            System.out.println("Failled : Delete");
        }
        //4- Delete tusuna basin
        buttongorunur.click();
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement yazigorunurmu = driver.findElement(By.tagName("h3"));
        if (yazigorunurmu.isDisplayed()){
            System.out.println("Passed : Add/Remove Elements ");
        }else {
            System.out.println("Failled : Add/Remove Elements");
        }

        Thread.sleep(3000);
        driver.close();
    }
}
