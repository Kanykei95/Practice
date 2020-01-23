package Selenium;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekVerification {
    public static void main(String[] args) {


        //TC	#2:	Cybertek	verifications
       // 1.Open browser
        WebDriverManager.chromedriver().setup();
        //to open browser
        WebDriver driver = new ChromeDriver();
        //maximize the window size
        driver.manage().window().maximize();

        //2.Go	to	https://www.cybertekschool.com
        driver.get("htttp://www.cybertekschool.com");

        // 3. Verify URL	containsExpected:	cybertekschool
        String expectedUrl = "cybertekschool";
        String actualURL = driver.getCurrentUrl();
        if(expectedUrl.equals(actualURL)){
            System.out.println("Cybertek url passed");
        }else{
            System.out.println("Cybertek url failed");
        }



        // 4.Verify	title:	Expected:	Cybertek
        String expected ="Cybertek";
        String actual = driver.getTitle();

        if(expected.equals(actual)){
            System.out.println("Cybertek title verification PASSED");
        }else{
            System.out.println("Cybertek title verification FAILED");
        }





    }
}
