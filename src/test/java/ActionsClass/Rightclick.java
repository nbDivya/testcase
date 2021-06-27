package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class Rightclick {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromeDriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //Dynamic wait
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        Actions action =new Actions(driver);
        /** In cssSelector----use (dot) operation for class and ------>id use(#) */
       WebElement rightclk= driver.findElement(By.cssSelector(".context-menu-one"));//Right click
       action.contextClick(rightclk).build().perform();

       WebElement copy=driver.findElement(By.cssSelector(".context-menu-icon-copy"));//click copy option
       String cpytxt=copy.getText();
        System.out.println(cpytxt);
        copy.click();







    }
}
