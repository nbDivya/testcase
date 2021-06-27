package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromeDriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //Dynamic wait
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(0);

        WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions action=new Actions(driver);
        Thread.sleep(3000);
        action.dragAndDrop(source,target).build().perform();

    }
}
