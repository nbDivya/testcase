package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static java.awt.SystemColor.menu;

public class Edureka {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://www.edureka.co/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(3000);


//create object for actions and linked with driver
        Actions builder=new Actions(driver);
        //helps to shift  the mouse to the center of the element
        builder.moveToElement(driver.findElement(By.xpath("/html/body/nav/div[1]/a/span"))).build().perform();
Thread.sleep(3000);


        WebElement link=driver.findElement(By.cssSelector("#test-menu-left > div.slider > ul > li:nth-child(1) > ul > li:nth-child(10) > a"));
        builder.moveToElement(link).build().perform();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li//a[text()='Software Testing']")).click();
        Thread.sleep(4000);

WebElement act=driver.findElement(By.id("search-inp"));
builder.moveToElement(act).build().perform();
Thread.sleep(3000);

WebElement search=driver.findElement(By.xpath("//span[@class='typeahead__button']"));
builder.moveToElement(search).build().perform();
Thread.sleep(3000);

Actions seriesOfActions;
seriesOfActions= (Actions) builder
        .sendKeys(act,"Selenium")
        .keyDown(search, Keys.SHIFT)
        .keyUp(search,Keys.SHIFT)
        .build();
        seriesOfActions.perform();
Thread.sleep(2000);
driver.quit();
    }
}
