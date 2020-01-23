package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyTitleVerification {
    public static void main(String[] args) {
//        TC #1: Etsy Title Verification
//        1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
//          open browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        2.Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

//        3.Search for “wooden spoon”
        driver.findElement(By.name("search_query")).sendKeys("wooden spoon"+ Keys.ENTER);

//        4.Verify title: Expected: “Wooden spoon | Etsy”

        String expected = "Wooden spoon | Etsy";
        String actual = driver.getTitle();

        if(actual.equals(expected)){
            System.out.println("Passed");
        }else {
            System.out.println("failed");
        }

    }
}
