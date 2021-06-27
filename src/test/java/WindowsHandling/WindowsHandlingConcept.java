package WindowsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowsHandlingConcept {

    /**program concept
     * Window Handles Practice
     * Button1. This button is used for opening a new browser window. ...
     * Button2. This button is used for opening a new tab in the existing browser window. ...
     * Button3. This button is used for opening multiple browser windows. ...
     * Button4. This button is used for opening multiple tabs in the existing browser. ...
     * Button5  */
    public static void main(String[] args) throws InterruptedException {
        /**    Hints:
         *     *****>>>>  get.windowhandle(): This method helps to get the window handle of the current window
         get.windowhandles(): This method helps to get the handles of all the windows opened
         set: This method helps to set the window handles in the form of a string.
         set<string> set= driver.get.windowhandles()
         switch to: This method helps to switch between the windows
         action: This method helps to perform certain actions on the windows*/


         System.setProperty("webdriver.chrome.driver", "src/main/resources/chromeDriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //Dynamic wait [implicitly/Explicit/pageLoadTimeout]
        //If the page is load with in 2sec the rest of 18 sec will ignore
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        //It will return as the parent window name as String
        String parentWindow=driver.getWindowHandle();//get the handle of parent using this cmd
        System.out.println("parentwindow is="+parentWindow);

        driver.findElement(By.id("newWindowBtn")).click();//click open new window button-1
        //get the handles of all window using this cmd

        Set<String>handles= driver.getWindowHandles();//Which returns the set of handles

        for(String handle:handles)
        {
            System.out.println(handle);  // Its also print parent window handle as well as child window handle
            if(!handle.equals(parentWindow))
            {
                driver.switchTo().window(handle);
                driver.findElement(By.id("firstName")).sendKeys("Divya");
                Thread.sleep(2000);
                driver.close();//close the current window(child winow)
            }

        }
        driver.switchTo().window(parentWindow);
        driver.findElement(By.id("name")).sendKeys("siva");//parent Window
        Thread.sleep(5000);



    }

}
