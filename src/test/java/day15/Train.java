package day15;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Train {
    public static void main(String[] args)  throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");

        driver.manage().window().maximize();

driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        /*Alert alertOK = driver.switchTo().alert();
        alertOK.accept();*/


        /*Alert alert = driver.switchTo().alert(); // switch to alert
        String alertMessage= driver.switchTo().alert().getText(); // capture alert message
        System.out.println(alertMessage); // Print Alert Message
        Thread.sleep(5000);
        alert.accept();*/

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        /** FROM STATION*/
WebElement fromstation =driver.findElement(By.xpath("//input[@type='text']"));
fromstation.sendKeys("MAS");

       /** TO STATION*/
WebElement tostation=driver.findElement(By.xpath("//span[@class='ng-tns-c58-9 ui-autocomplete ui-widget']//input"));
tostation.sendKeys("PUNE");

/**Click on "Train with Available Berth" */
    //input[contains(@id,'availableBerth') '
        WebElement checkBox;
        checkBox = driver.findElement(By.xpath("//*[@id='divMain']/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[4]/div/span[3]/label"));
       System.out.println(checkBox.isSelected());
        checkBox.click();
         Thread.sleep(2000);

      /**  Click on Search */
        //button[@class='search_btn train_Search']
        //button[contains(text(),'Search')

       boolean b1= driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
        System.out.println(b1);



        /**Verify the search results page is displayed*/
        String title=driver.getTitle();
        System.out.println("The Page Title is="+title);




/**In the Search results page, click on “Train schedule” for the first search result*/
        //driver.findElement(By.xpath("//span[contains(text),'Train Schedule')]")).click();
//        driver.findElement(By.xpath("//span[@class='hidden-xs ng-star-inserted']")).click();
//      driver.findElement(By.xpath("//span[@class='a']/span[1]")).click();
        driver.findElement(By.linkText("Train Schedule")).click();


/**Verify the table is displayed*/



/**In the table, identify the headers and display the header text*/
List<WebElement> header= driver.findElements(By.xpath("//table[@class='table']/thead/tr/th"));
        System.out.println(header.size());
        for(WebElement head:header)
            System.out.println(head.getText());



        /**No.OF.ROWS*/
        List <WebElement> rows=driver.findElements(By.xpath("//table[@class='table']/tbody/tr/td"));
        System.out.println(rows.size());
        for(WebElement row:rows) {
            System.out.println("The No.of Rows="+row.getText());
        }

        /**No of column*/
        List<WebElement>columns=driver.findElements(By.xpath("//table[@class='table']/tbody/tr/td[1]"));
        System.out.println(columns.size());
        for(WebElement col:columns) {
            System.out.println("The No.Of.Column ="+col.getText());
        }

/**From the body,read and print first row result*/
        WebElement firstrow=driver.findElement(By.xpath("//table[@class='table'] /tbody /tr[1]/td[1]"));
        System.out.println("The first row   ="+firstrow.getText());

        /**To print last row*/














 }
}
