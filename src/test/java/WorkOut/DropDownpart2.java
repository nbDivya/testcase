package WorkOut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownpart2 {
    public static void main(String[] args) {

        //TYPE2:----> SELECTBYINDEX
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromeDriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");

        WebElement day=driver.findElement(By.id("day"));
        WebElement month=driver.findElement(By.id("month"));
        WebElement year=driver.findElement(By.id("year"));

        //SELECT BY INDEX APPLIED HERE
Select select=new Select(day);
select.selectByIndex(12);
select.isMultiple();


        /** 1....What is the size of particular DropDown ? (Important)
         * getoption() method it will return list of webelement
         */

List<WebElement>daylist=select.getOptions();
        System.out.println(daylist.size());
        int totalday=daylist.size()-1;
        System.out.println("The Total days in the month are="+totalday);


        /**2........How will you print all the value from the dropdown ?*/
        for(int i=0;i<daylist.size();i++)
        {
            String dayvalue=daylist.get(i).getText();
            System.out.println( dayvalue);


            /**3.............How will you select the specific value from dropdown with the help of getoption()?
             * refer question no 1 via that
             */


            if(dayvalue.equals("21"))
            {
                daylist.get(i).click();

            }


        }






    }




}
