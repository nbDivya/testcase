package com.Test;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

  /**keyword "invocationTimeout" is used to stop the infinite loop*/

    @Test(invocationTimeOut = 2)
    public void infiniteLoopTest()
    {
        int i=1;
        while(i==1)
        {
            System.out.println(i);
        }
    }
}
