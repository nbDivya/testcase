package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LocatorConcept {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromeDriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //Dynamic wait
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://login.yahoo.com/");
        Thread.sleep(2000);

        /******preference in locatorr
         * 1)=========>id,name
         * 2)xpath,cssselector
         * 3)--------------
         * 4)linktext & className
         * 5)partialLinkText
         */



        /**  1.ID:
         *     ***         (Unique)
         */
//        WebElement username=driver.findElement(By.id("login-username"));//username
//        username.sendKeys("test@yahoo.com");
//        Thread.sleep(2000);
//
//        WebElement nextbtn=driver.findElement(By.id("login-signin"));//Nextbutton
//        nextbtn.click();

        /**  2.Name:
         *   ******          (unique)
         */

        driver.findElement(By.name("username")).sendKeys("test@yahoo.com");
        Thread.sleep(2000);

        driver.findElement(By.name("signin")).click();


        /**3..xpath(Extended HTML path)
         *    ************************
         */

            driver.findElement(By.xpath("//input[@type='text']")).sendKeys("test@yahoo.com");
            driver.findElement(By.xpath("//input[@id='login-signin']")).click();


        /**4.CSS Selector
         * **************          (Rightclick--->copy---->selector)
          */

        driver.findElement(By.cssSelector("#login-username")).sendKeys("test@yahoo.com");
        driver.findElement(By.cssSelector("#login-username")).click();

        /**5.LinkText()
         * ************     (Only for Links)
         */
        //driver.findElement(By.linkText("Difficulty to signing in?").click();
        driver.findElement(By.linkText("Signup")).click();

        /** 6.Partial LinkText()
         *  *******************      (only for links but not Recommended)
         *  It will create Duplicate
         */

        //driver.findElement(By.partialLinkText("Difficulty").click();


        /**7.Class Name
         * ************
         * To be duplicate
         * Its not unique
         */

        driver.findElement(By.className("phone-no ")).sendKeys("test@yahoo.com");


        /**8.TagName
         * *********
         */
    }
}
