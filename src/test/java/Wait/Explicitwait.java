package Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Explicitwait {
    public static void main(String[] args) {
        /** No Explicit Keyword or Method
         * Available with WebDriverWait with some  Expected condition
         * Specific to element
         * Dynamic in nature
         * We should never use implicit and Explicit wait together
         * Selenium WebDriver will wait for the element first bze of Implicitwait and Explicitwait will be applied
         */

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromeDriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //Dynamic wait [implicitly/Explicit/pageLoadTimeout]
        //If the page is load with in 2sec the rest of 18 sec will ignore
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/");
//login button
        clickon(driver,driver.findElement(By.xpath("//button[@name='login']")),20);
        //create a page link
        clickon(driver,driver.findElement(By.xpath("//*[@id='reg_pages_msg']/a]")),20);

    }
    public static void clickon(WebDriver driver, WebElement element,int timeout)
    {
        new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
}
