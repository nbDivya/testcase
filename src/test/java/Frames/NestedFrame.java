package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NestedFrame {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromeDriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //Dynamic wait [implicitly/Explicit/pageLoadTimeout]
        //If the page is load with in 2sec the rest of 18 sec will ignore
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://the-internet.herokuapp.com/nested_frames");

        WebElement topFrame=driver.findElement(By.name("frame-top"));
        driver.switchTo().frame(topFrame);


        WebElement leftFrame=driver.findElement(By.name("frame-left"));
        driver.switchTo().frame(leftFrame);
        System.out.println(driver.findElement(By.tagName("body")).getText());

        driver.switchTo().parentFrame();

        WebElement rightFrame=driver.findElement(By.name("frame-right"));
        driver.switchTo().frame(rightFrame);
        System.out.println(driver.findElement(By.tagName("body")).getText());

        /* WebElement bottomFrame=driver.findElement(By.name("frame-bottom"));
         driver.switchTo().frame(bottomFrame);
        System.out.println(driver.findElement(By.tagName("body")).getText());*/

    }
}
