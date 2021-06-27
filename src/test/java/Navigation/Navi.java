package Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Navi {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromeDriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //Dynamic wait
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.google.co.in/");
        Thread.sleep(2000);

        driver.navigate().to("https://www.amazon.in/");
        Thread.sleep(2000);

         driver.navigate().back();//come back to google page

        Thread.sleep(2000);

        driver.navigate().forward();//amazon page

        Thread.sleep(2000);

        driver.navigate().back();//google
driver.navigate().refresh();//refresh



    }
}
