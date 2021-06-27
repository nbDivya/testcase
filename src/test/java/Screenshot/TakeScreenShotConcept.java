package Screenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;

import static org.seleniumhq.jetty9.util.IO.copyFile;

public class TakeScreenShotConcept {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromeDriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();


        //Dynamic wait
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.google.com/");

        //TakeScreeenshot and store as a File format
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("E:/selenium/takescreen/google.png"));

       //Now copy the Screenshot to desired location using copyfile method
       //FileUtils.copyFile(src,new  File("E:\\selenium"));




    }
}
