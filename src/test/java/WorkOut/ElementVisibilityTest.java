package WorkOut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ElementVisibilityTest {
    public static void main(String[] args) {

        /** isDisplayed()  ====>Returns a TRUE value if the specified element is present on the Webpage else it return false
         * isEnabled()  =============> The method is used to verify if the webelement is Enabled or Disabled
         * isSelected()   ======> This method is used to verrify the webelement is selected or not */



        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromeDriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //Dynamic wait
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://register.freecrm.com/register/");

        /** (1) isDisplayed()-------------->Applicable for all the Element*/
        Boolean b1=driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
        System.out.println(b1);//true to displayed

        /**(2)  isEnabled()----------------->Not Enabled*/
        Boolean b2=driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
        System.out.println(b2);

        //Select I Agree Checkbox
        driver.findElement(By.xpath("//a[text()='I Agree to the terms and conditions']"));
        Boolean b3=driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
        System.out.println(b3);



        /** (3) isSelected()--------------->Only applicable for checkbox,dropdown and Radio Button*/
        Boolean b4=driver.findElement(By.xpath("//button[@type='submit']")).isSelected();
        System.out.println(b4);


        /**(4)  Deselect the checkbox*/

        driver.findElement(By.xpath("//a[text()='I Agree to the terms and conditions']")).click();

        Boolean b5=driver.findElement(By.xpath("//button[@type='submit']")).isSelected();
        System.out.println(b2);






    }
}
