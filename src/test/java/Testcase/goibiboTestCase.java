package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobject.goibiboHome;


import java.util.concurrent.TimeUnit;

public class goibiboTestCase {
    @Test
    public void goibibo() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromeDriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //Dynamic wait
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.goibibo.com/");
        Thread.sleep(3000);

        PageFactory.initElements(driver,goibiboHome.class);
        goibiboHome.flight.click();


    }
}
