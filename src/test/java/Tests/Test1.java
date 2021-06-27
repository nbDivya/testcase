package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectModel.BaseClass;
import pageObjectModel.HomePage;
import pageObjectModel.ResultPage;

public class Test1  extends BaseClass {

    public static HomePage home;
    public static ResultPage result;

    @Test

    public void verifytest() throws InterruptedException {
        HomePage home=new HomePage();

         home.setCloseBtn();
         Thread.sleep(2000);
        home.searchtxt("Selenium WebDriver");
        Thread.sleep(3000);
        Assert.assertEquals(20,result.CountOfResults());
        result.CountOfResults();
        System.out.println(result.CountOfResults());
        result.getTitle();


    }
}
