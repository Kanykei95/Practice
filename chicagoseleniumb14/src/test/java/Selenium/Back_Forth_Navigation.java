package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Back_Forth_Navigation {

    public static void main(String[] args) {

//TC#3:	Back	and	forth	navigation

// 1-Open	a	chrome	browser
        WebDriverManager.chromedriver().setup();
        //to open browser
        WebDriver driver = new ChromeDriver();


// 2-Go	to:	https://google.com
        driver.get("https://www.google.com");

// 3-Click	to	Gmail	from	top	right.
        driver.findElement(By.linkText("Gmail")).click();
// 4-Verify	title	contains:Expected:	Gmail
        String expected = "Gmail";
        String actual  = driver.getTitle();

        if(actual.contains(expected)){
            System.out.println("Passed gmail title");
        }else {
            System.out.println("Failed gmail title");
        }
// 5-Go	back	to	Google	by	using	the	.back();

        driver.navigate().back();
// 6-Verify	title	contains:Expected:	Google
        String expectedGoodle = "Google";
        String actualGoogle = driver.getTitle();

        if (actual.contains(expected)){
            System.out.println("Passed google title");
        }else{
            System.out.println("Failed google title");
        }

// 7-Go	back to	Gmail	using	the	Forward	button
        driver.navigate().forward();

// 8-Verify	title	contains:Expected:	Gmail
        if(driver.getTitle().contains("Gmail")){
            System.out.println("Gmail title verification passed again!!!");
        }else{
            System.out.println("Gmail title verification failed again!!!");
        }





    }
}
