package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestNgBasic {

    //Precondition Annotations------->Starting with @Before
    @BeforeSuite
    public void setup()
    {
        System.out.println("@BeforeSuite-----setup system property for chrome");
    }


    @BeforeTest
    public void launchBrowser()
    {
        System.out.println("Launch browser");
    }


    @BeforeClass
public void Login()
{
    System.out.println("Login app");
}


@BeforeMethod
    public void enterUrl()
{
    System.out.println("enterUrl");
}

//Testcases-----Starting with @Test
    @Test
    public void googleTitleTest()
    {
        System.out.println("Google Title Test");
    }

    @Test
    public void googleSearchTest()
    {
        System.out.println("Search  Test");
    }

    @Test
    public void googleLogoTest()
    {
        System.out.println("Google Logo Test");
    }

    //Post condition starting with @ After

    @AfterMethod
    public void logout()
    {
        System.out.println("Logout from app");
    }

    @AfterClass
    public void closeBrowser()
    {
        System.out.println("close Browser");
    }


@AfterTest
    public void deleteAllCookies()
{
    System.out.println("DeleteAllCookies");
}



}
