package day02_driverMethodlari_locators;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_C01_driverGetMethodlari {

    public static void main(String[] args) {

        System.setProperty("Webdriver.choreme.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getWindowHandles());




        driver.close();

    }


}
