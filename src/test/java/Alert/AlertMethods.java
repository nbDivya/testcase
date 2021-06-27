package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AlertMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromeDriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //Dynamic wait [implicitly/Explicit/pageLoadTimeout]
        //If the page is load with in 2sec the rest of 18 sec will ignore
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://leafground.com/pages/Alert.html");

        //Sweet Alert
        driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
        Alert sweet=driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println("The sweet Alert is="+sweet.getText());
        sweet.accept();

        //Confirmation Alert
        driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
        Alert confirm=driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println("The confirm alert is="+confirm.getText());
        confirm.dismiss();


        //prompt Alert   (sendkeys to be used here)

        driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
        Alert prompt=driver.switchTo().alert();
        prompt.sendKeys("Hi Divi");
        Thread.sleep(3000);
       // System.out.println("The prompt alert is="+prompt.getText());
        prompt.accept();


    }


}
