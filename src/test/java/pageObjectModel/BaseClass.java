package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

import static Tests.Test1.home;

public class BaseClass {
    public static WebDriver driver;






    @BeforeMethod
    public static void launchApp()
    {
     System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
     driver=new ChromeDriver();


     driver.get("https://www.flipkart.com/");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);


     }
       /*          @AfterMethod
    public void TearDown()
                 {
                     driver.quit();
                 }*/

}
