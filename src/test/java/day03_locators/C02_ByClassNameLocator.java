package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_ByClassNameLocator {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.automationexercise.com/");

        List<WebElement> categoryList = driver.findElements(By.className("panel-title"));

        int expectedCakegorysayisi = 3;
        int actualcategorysayisi = categoryList.size();

        if (expectedCakegorysayisi == actualcategorysayisi){
            System.out.println("passed");
        }else {
            System.out.println("failled");
        }

        for (WebElement each:categoryList
             ) {
            System.out.println(each.getText());
        }





        Thread.sleep(3000);
        driver.close();
    }
}
