package CrossBrowser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestClass {
    public static WebDriver driver;
    @BeforeTest
    @Parameters("browser")
    public void setup(String browser) throws InterruptedException {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromeDriver.exe");
            driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();


            //Dynamic wait
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/gecoDriver.exe");
            driver = new FirefoxDriver();
        }

        driver.get("https://www.google.com/");
        Thread.sleep(3000);
    }

 @Test
         public void sampleTest()
        {
            driver.findElement(By.name("q")).sendKeys("Cross browser testing");
        }
@AfterTest
    public void tearDown()
{
    driver.quit();
    }

}
