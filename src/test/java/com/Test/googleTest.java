package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class googleTest {
    WebDriver driver;
                            /** priotity and Grouping*/
    @BeforeMethod
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("http://www.google.com");

    }
    @Test(priority=3,groups="Title")
    public void  googleTitleTest()
    {
        String title=driver.getTitle();
        System.out.println(title);
    }
    @Test(priority=1,groups="LinkTest")
    public void mailLinkTest()
    {
        boolean b=driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed();

    }
    @Test(priority=5,groups="test")
    public void test()
    {
        System.out.println("test1");

    }

    @Test(priority=4,groups="test")
    public void test2()
    {
        System.out.println("test2");

    }

    @Test(priority = 2,groups="test")
    public void test3()
    {
        System.out.println("test3");

    }




    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }

}
