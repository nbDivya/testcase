package com.Test;

import org.aopalliance.intercept.Invocation;
import org.testng.annotations.Test;

public class InvocationCountTest {
//invocation count is used to print the same test at 5times

    @Test (invocationCount = 5)
    public void Sum()
    {
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);
    }
}
