package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TASK_Etsy_Xpath {

    public static void main(String[] args) {

//        TC#2 Search ETSY
//1. Open browser
        WebDriverManager.chromedriver().setup();
        //open browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//2. Go to https://etsy.com
        driver.get("https://etsy.com");

//3. Enter any search term
        //we need to locate searchBox using xpath
        WebElement etsySearchBox= driver.findElement(By.xpath("//input[@name='search_query']"));
        etsySearchBox.sendKeys("wooden spoon");

//4. Click search button
        WebElement estySearchButton = driver.findElement(By.xpath("//button[@value='Search']"));
        estySearchButton.click();

//5. Verify title contains the search term
        String actualTitle = driver.getTitle();
        String expectedInTitle = "wooden spoon";
        if(actualTitle.contains(expectedInTitle)){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }
//USE XPATH TO LOCATE WEBELEMENTS



    }
}
