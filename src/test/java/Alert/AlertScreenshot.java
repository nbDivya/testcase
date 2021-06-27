package Alert;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AlertScreenshot {
    private static Object TakesScreenshot;

    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromeDriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://leafground.com/pages/Alert.html");


        driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
Alert first=driver.switchTo().alert();
Thread.sleep(2000);
first.accept();
File src=((org.openqa.selenium.TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src , new  File("E:/selenium/takescreen/leafalert.png"));
    }


}
