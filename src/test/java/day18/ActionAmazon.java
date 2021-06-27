package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

import static java.math.RoundingMode.DOWN;

public class ActionAmazon {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Actions builder=new Actions(driver);

        builder.moveToElement(driver.findElement(By.xpath("//*[@id='nav-link-prime']/span[1]"))).build().perform();
        Thread.sleep(2000);


      //prime button click

       // WebElement joinPrimeBtn=driver.findElement(By.xpath("//a[normalize-space()='join Prime']"));
        WebElement joinPrimeBtn=driver.findElement(By.xpath("//*[@id='multiasins-img-link']"));
       // builder.moveToElement(joinPrimeBtn).click().build().perform(); (or)
         joinPrimeBtn.click();

        Thread.sleep(2000);
        driver.quit();
        
        


    }
}
