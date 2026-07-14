package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class baseTest {
    //protected-accessible within the package or subclass of the class
    protected WebDriver driver;

    //added a method to start the browser
    //BeforeMethod is testNG annotation
    @BeforeMethod
    public void setUp(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com");
    }
    @AfterMethod
    public void tearDown(){
        if (driver != null)//if driver is still open then close it
        {
        driver.quit();
        }
    }
}
