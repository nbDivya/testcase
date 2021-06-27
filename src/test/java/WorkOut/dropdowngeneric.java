package WorkOut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropdowngeneric {

     static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromeDriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");

        String dayxpath="//select[@id='day']//option";
        String monthxpath="//select[@id='month']//option";
        String yearxpath="//select[@id='year']//option";

       // Select getgenericValue( dayxpath,"17");
        //Select getgenericValue( monthxpath,"Feb");
        //Select getgenericValue( yearxpath,"1987");

    }

    public static void getgenericValue(String xpathValue, String value)
    {
        Select dropDownDay=new Select(driver.findElement(By.xpath(xpathValue)));
        dropDownDay.getOptions();
        //List<WebElement> listmonth = driver.findElements(By.xpath(xpathValue));
        //System.out.println(listmonth.size());
        //for (int i = 0; i < listmonth.size(); i++) {
          // String valmonth = listmonth.get(i).getText();
            //System.out.println(valmonth);
            //if (valmonth.equals(value)) {
              //  listmonth.get(i).click();
               // break;
            //}
        }
    }




