package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTesParameterization {
    WebDriver driver;
    @Parameters({"browser","url"})
    @Test(priority=1)
    public void launchURLTest(String browser,String url)
    {
        System.out.println("Running Browser is "+browser);
        if(browser.equals("chrome"))
        {
           System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browser.equals("Firefox"))
        {
            driver=new FirefoxDriver();
        }
       else if(browser.equals("ie`"))
        {
            driver=new InternetExplorerDriver();
        }
        driver.get(url);
    }

    @Parameters({"username","password"})

    @Test(priority=2)
    public void LoginTest(String username,String password) throws InterruptedException {

        System.out.println(username);
        System.out.println(password);
        Thread.sleep(4000);
        driver.findElement(By.name("email")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);

    }


}
