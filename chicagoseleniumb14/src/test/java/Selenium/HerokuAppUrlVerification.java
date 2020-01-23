package Selenium;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuAppUrlVerification {

    public static void main(String[] args) {

//        TC #3: HerokuApp URL verification
//        1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        //open browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


//        2.Go to https://the-internet.herokuapp.com/forgot_password
        driver.get("https://the-internet.herokuapp.com/forgot_password");

//        3.Enter any email into input box
        driver.findElement(By.name("email")).sendKeys("Kana");
//        4.Click on Retrieve password
        driver.findElement(By.className("radius")).click();

//        5.Verify URL contains: Expected: “email_sent
        String actual = driver.getCurrentUrl();
        String expected = "email_sent";

        if (actual.contains(expected)){
            System.out.println("passed ");
        }else {
            System.out.println("failed");
        }

        //veirfy that text box displayed had the text as expected
        //expected " your emails been sent

        String actualTextBoxValue = driver.findElement(By.id("content")).getText();
        String expectedTextBoc = "Your e-mail's been sent";

        if(actual.equals(expected)){
            System.out.println("Passed text Box");
        }else {
            System.out.println("failed text box");
        }





    }
}
