package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIrstSeleniumClass {

    public static void main(String[] args)throws InterruptedException {

        WebDriverManager.chromedriver().setup();// this line creates the connection between driver and selenium.
                                                //AND sets up the driver

        WebDriver driver = new ChromeDriver();  //instantiating the chromeDriver instance
        driver.manage().window().maximize();

        driver.get("https://www.google.com");   //accepts string parameter

        System.out.println(driver.getTitle());

        driver.navigate().back();               //will go to google and run back
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.navigate().to("https://www.etsy.com");   //same thing as get method

        System.out.println(driver.getTitle());

        driver.close();
    }
}
