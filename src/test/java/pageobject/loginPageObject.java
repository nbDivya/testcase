package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class loginPageObject {
    //Username  password  submitbtn

    public static WebElement username(WebDriver driver)
    {
        return driver.findElement(By.name("username"));
    }
    public static WebElement password(WebDriver driver)
    {
        return driver.findElement(By.name("password"));
    }

    public static WebElement loginButton(WebDriver driver)
    {
        return driver.findElement(By.xpath("//button[@type='submit']"));
    }




}



