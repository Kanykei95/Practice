package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Best_Buy {
    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://bestbuy.com");
        Thread.sleep(5000);

        if(driver.findElement(By.xpath("/html/body/div[6]/div/div/div[1]/button/span[2]")).isDisplayed()){
            driver.findElement(By.xpath("/html/body/div[6]/div/div/div[1]/button/span[2]")).click();
        }

        WebElement bestBuySearchBox = driver.findElement(By.xpath("//input[@id='gh-search-input']"));
       bestBuySearchBox.sendKeys("air pods");
       driver.findElement(By.xpath("//img[@alt='Search Icon']")).click();

      WebElement firstELement= driver.findElement(By.xpath("//li[@data-sku-id='6084400']"));
      firstELement.click();


    }
}
