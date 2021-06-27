package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobject.loginPageObject;

import java.util.concurrent.TimeUnit;

public class loginTestcase {
    @Test
    public void login() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromeDriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //Dynamic wait
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.phptravels.net/login");
        Thread.sleep(3000);

        loginPageObject.username(driver).sendKeys("user@phptravels.com");
        loginPageObject.password(driver).sendKeys("demoUser");
        loginPageObject.loginButton(driver).click();


    }
}
