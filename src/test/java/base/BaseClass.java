package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;

    @BeforeSuite(alwaysRun = true)
    public void setup()  {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromeDriver.exe");
        WebDriver driver = new ChromeDriver();
    }

@BeforeMethod(alwaysRun = true)
public void launchapp() throws InterruptedException {
        driver.get("https://www.goibibo.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //Dynamic wait
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        System.out.println("Launching the Browser");

    }
}
