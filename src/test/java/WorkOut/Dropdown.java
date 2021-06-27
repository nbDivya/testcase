package WorkOut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
    public static void main(String[] args) {
        //  PART1------------>SELECTBYVISIBLETEXT()

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromeDriver.exe");
        WebDriver driver = new ChromeDriver();

     driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");


        WebElement day = driver.findElement(By.id("day"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement year = driver.findElement(By.id("year"));


        getValueFromDropDown(day, "21");
        getValueFromDropDown(month, "Jun");
        getValueFromDropDown(year, "1985");


    }


    public static void getValueFromDropDown(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }
}





