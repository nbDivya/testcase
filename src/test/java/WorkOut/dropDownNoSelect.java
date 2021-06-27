package WorkOut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class dropDownNoSelect {
    /**Without using Select class how you select value from the dropdown  @@@@@@*/

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromeDriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");

        WebElement day=driver.findElement(By.id("day"));
        WebElement month=driver.findElement(By.id("month"));
        WebElement year=driver.findElement(By.id("year"));

        List<WebElement> listmonth= driver.findElements(By.xpath("//select[@id='month']//option"));
        System.out.println(listmonth.size());
        for(int i=0;i<listmonth.size();i++)
        {
            String valmonth=listmonth.get(i).getText();
            System.out.println(valmonth);
            if(valmonth.equals("Feb"))
            {
                listmonth.get(i).click();
                break;
            }
        }


    }
}
