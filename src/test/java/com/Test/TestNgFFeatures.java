package com.Test;

import org.testng.annotations.Test;

public class TestNgFFeatures {
    @Test
    public void LoginTest()
    {
        System.out.println("LoginTest");
        int i=9/0;

    }


    @Test(dependsOnMethods = "loginTest")
    public void HomepageTest()
    {
        System.out.println("HomepageTest");
    }


}
