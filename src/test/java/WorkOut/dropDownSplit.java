package WorkOut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.SelectableChannel;

public class dropDownSplit {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        WebElement day=driver.findElement(By.id("day"));
        WebElement month=driver.findElement(By.id("month"));
        WebElement year=driver.findElement(By.id("year"));

        String dob="30-Oct-2015";
        String dobarr[]=dob.split("-");

        getValueFromDropDown(day,dobarr[0]);
        getValueFromDropDown(month,dobarr[1]);
        getValueFromDropDown(year,dobarr[2]);




    }
    public static void getValueFromDropDown(WebElement element,String value)
    {
        Select select=new Select(element);
        select.selectByVisibleText(value);
    }
}
