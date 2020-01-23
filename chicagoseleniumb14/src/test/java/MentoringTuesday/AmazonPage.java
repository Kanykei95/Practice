package MentoringTuesday;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPage {

    WebDriver driver;

    @Before
    public void setUp(){
        System.out.println("Instantiating the driver");
        WebDriverManager.chromedriver().setup();
       // WebDriver driver = new ChromeDriver();
        driver = new ChromeDriver();

    }
    @After
    public void tearDown(){
        System.out.println("quiting the browser");
        driver.quit();
    }


    @Test
    public void navigateTo(){
        String url = ("https://www.amazon.co");
        driver.get(url);


        String actual = driver.getCurrentUrl();
        System.out.println(actual);

//        if(url.equals(actual)){
//            System.out.println("the url verification passed");
//        }else{
//            System.out.println("the url verification failed");
//        }

        Assert.assertEquals(url,actual);//shorter way of comparing.. method. IF it wails it will show what is what in the console.
        //will show mistake what has been missed and etc.


    }

}
