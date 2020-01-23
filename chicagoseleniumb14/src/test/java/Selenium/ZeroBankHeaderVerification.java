package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankHeaderVerification {
    public static void main(String[] args) {
//        TC #4: Zero Bank header verification
//        1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        2.Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

//        3.Get attribute value of href from the “forgot your password” link
       String actualLink = driver.findElement(By.partialLinkText("Forgot your password")).getAttribute("href");


//        4.Verify attribute value containsExpected: “/forgot-password.html"
        //EXPECTED:"/forgot-password.html
        String expectedLink ="/forgot-password.html";

        if(actualLink.contains(expectedLink)){
            System.out.println("Passed");
            }else {
            System.out.println("failed");
        }


    }
}
