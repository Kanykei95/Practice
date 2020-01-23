package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLoginAuthentication {
    public static void main(String[] args) throws InterruptedException {

        //C#5:	Basic	login	authentication
        // 1-Open	a	chrome	browser
        WebDriverManager.chromedriver().setup();
        //open browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // 2-Go	to:	http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        // 3-Verify	title	equals:Expected:	Web	Orders	Login
        String expected = "Web Orders Login";
        String actual = driver.getTitle();

        if (expected.equals(actual)){
            System.out.println("Passed web orders login");
        }else{
            System.out.println("Failed web orders login");
        }
        // 4-Enter	username:	Tester
        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");

        // 5-Enter	password:	test
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test" + Keys.ENTER);
        Thread.sleep(2000);//to slow the speed

        // 6-Click	“Sign	In”	button
driver.findElement(By.linkText("ctl00$MainContent$login_button")).click();


        // 7-Verify	title equals:Expected:	Web	Orders

        String expectedWebOrder = "Web Orders";
        String actualWebOrder = driver.getTitle();

        if(expected.equals(actual)){
            System.out.println("Passed web orders");
        }else {
            System.out.println("Failed web orders");
        }






    }
}
