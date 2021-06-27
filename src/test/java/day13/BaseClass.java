package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass
{
    public WebDriver driver;
    public void SetupChrome()
    {
        System.setProperty("webdriver.chrome.driver","src/main/resource/Chromedriver.exe");
        driver=new ChromeDriver();
    }
    public void Openurl(String s)
    {
        driver.get(s);
    }
public void windowMaximise()
    {
        driver.manage().window().maximize();
    }
    public void implicitlyWait()
    {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void enterTextByName(String locator,String text)
    {
        driver.findElement(By.name(locator)).sendKeys(text);
    }
    public void enterTextById(String locator,String text)
    {
        driver.findElement(By.id(locator)).sendKeys(text);
    }
    public void clickButtonByXpath(String locator)
    {
        driver.findElement(By.xpath(locator)).click();
    }
}
