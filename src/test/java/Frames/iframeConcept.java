package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class iframeConcept {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromeDriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //Dynamic wait [implicitly/Explicit/pageLoadTimeout]
        //If the page is load with in 2sec the rest of 18 sec will ignore
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://the-internet.herokuapp.com/iframe");

        WebElement frameElement=driver.findElement(By.id("mce_0_ifr"));//iFrameid for whole box
        driver.switchTo().frame(frameElement);//pass object to switch


        //Operation inside the frame
        WebElement insideframe=driver.findElement(By.id("tinymce"));
        insideframe.clear();
        Thread.sleep(2000);

        insideframe.sendKeys("I'm inside the text");
        driver.switchTo().defaultContent();//moving frame to outside to click a link
        Thread.sleep(3000);
        driver.findElement(By.linkText("Elemental Selenium")).click();//outside link





    }
}
