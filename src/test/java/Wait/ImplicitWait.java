package Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) {

        /**IMPLICITLY WAIT
         * ***************
         * Its always applied Globally
         * Is available for all webelement
         * Dynamic in nature
         * It can be changed anywhere @ anytime in your code
         */
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromeDriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //Dynamic wait
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/signup");

        WebElement firstname=driver.findElement(By.name("firstname"));
        WebElement lastname=driver.findElement(By.name("lastname"));
        WebElement mobno=driver.findElement(By.name("reg_email__"));
        WebElement pwd=driver.findElement(By.name("reg_passwd__"));

        Sendkeys(driver,firstname,10,"varshid");
        Sendkeys(driver,lastname,5,"siva");
        Sendkeys(driver,mobno,10,"9941428081");
        Sendkeys(driver,pwd,10,"divibaskar");


    }

    public static void  Sendkeys(WebDriver driver,WebElement element,int timeout,String value)
    {
        new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(value);
    }
}
