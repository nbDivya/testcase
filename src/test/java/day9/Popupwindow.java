package day9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Popupwindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/Chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.naukri.com/");
        driver.manage().window().maximize();
        Set<String> handles=driver.getWindowHandles();
        System.out.println(handles.size());
        Iterator<String>itr=handles.iterator();
        String mainwindow=itr.next();
        String popup1=itr.next();
        String popup2=itr.next();

        driver.switchTo().window(popup1);
        System.out.println("1st popup is="+driver.getTitle());
        driver.close();

        driver.switchTo().window(popup2);
        System.out.println("2nd popup is="+driver.getTitle());
        driver.close();

        driver.switchTo().window(mainwindow);
        System.out.println("Mainwindow is="+driver.getTitle());
        driver.close();



    }














    }
