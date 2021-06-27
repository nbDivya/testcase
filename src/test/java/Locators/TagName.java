package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TagName {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromeDriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //Dynamic wait
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.google.com/");
        Thread.sleep(2000);

        /***  1) Get the total count of links on the page
         *       ****************************************
         */

        List<WebElement> tag = driver.findElements(By.tagName("a"));
        System.out.println("No.of.Links in the page:" + tag.size());


        /***  2) Get the text off each link on the page
         *      **************************************
         */

        for (int i = 0; i < tag.size(); i++) {
            String text = tag.get(i).getText();
            System.out.println(text);
        }


    }
}
