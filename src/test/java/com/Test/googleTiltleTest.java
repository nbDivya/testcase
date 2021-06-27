package com.Test;

import net.bytebuddy.build.ToStringPlugin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
/**https://testng.org/doc/documentation-main.html ---->Refer this for additional info*/

public class googleTiltleTest {
    WebDriver driver;

    @BeforeMethod
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromeDriver.exe");
         driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //Dynamic wait [implicitly/Explicit/pageLoadTimeout]
        //If the page is load with in 2sec the rest of 18 sec will ignore
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://www.google.com");

    }
    @Test
    public void googleTitleTest()
    {
        String title= driver.getTitle();
        System.out.println(title);
        /** Assert is used to validate the testcase*/
        Assert.assertEquals("title","google","Title is not matched");

    }
    @Test
    public void googleLogoTest() throws InterruptedException {
        Thread.sleep(2000);
        boolean b=driver.findElement(By.xpath("//*[@id='logo']")).isDisplayed();

        Assert.assertTrue(b);
        Assert.assertEquals("b","true");
    }
    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
