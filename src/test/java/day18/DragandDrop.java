package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        WebElement SourceElement=driver.findElement(By.id("draggable"));
        WebElement TargetElement= driver.findElement(By.id("droppable"));
        Actions action=new Actions(driver);
        Thread.sleep(2000);
        action.dragAndDrop(SourceElement,TargetElement).build().perform();
        Thread.sleep(2000);
        driver.quit();


    }
}
