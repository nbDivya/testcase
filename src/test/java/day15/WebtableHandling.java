package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebtableHandling {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain-lose");
        driver.manage().window().maximize();

        //To print first row and first column
        WebElement first = driver.findElement(By.xpath("//table[@class='dataTable'] /tbody /tr[1]/td[1]"));
        System.out.println("The first row  and 1st column test is =" + first.getText());

        //To print 3rd row and 4th column

        WebElement third = driver.findElement(By.xpath("//table[@class='dataTable'] /tbody /tr[3]/td[4]"));
        System.out.println("The 3rd row  and 4th column test is =" + third.getText());


        //To print the 2Nd row of the table
        List<WebElement> secondrow = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[2]/td"));
        System.out.println("Second row size is=" + secondrow.size());
        for (int j = 0; j < secondrow.size(); j++) {
            System.out.println(secondrow.get(j).getText());
        }


      /*  //TO GET THE COLUMN
        List<WebElement> firstcolumn = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
        System.out.println("The first column size is=" + firstcolumn.size());
        for (WebElement firstcol : firstcolumn) {
            System.out.println(firstcol.getText());
        }
*/
        //COMPARISON of 1st column with 4th column data
        List<WebElement> Company=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
       // List<WebElement> CurrentPrice =driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[4]"));
       for(int i=1;i<Company.size();i++)
        {
            //if(driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[4]"));
            System.out.println(Company.get(i).getText());

            if(Company.get(i).getText().equalsIgnoreCase("Kiri Industries"))
            {
                WebElement CurrentPrice= driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td[4]"));

                System.out.println(CurrentPrice.getText());
            }
        }


        System.out.println(Company.size());
       // System.out.println(CurrentPrice.size());


/*
        //To print heading of the column and size
        List<WebElement> columns = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
        System.out.println("The column  size is=" + columns.size());
        for (WebElement column : columns) {
            System.out.println(column.getText());
        }

//To print no  of rows
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td"));
        System.out.println("The row size:=" + rows.size());
        for (WebElement row : rows) {
            System.out.println(row.getText());
        }

      */
/*  //To print last row in the table

        List<WebElement> row = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
        System.out.println("The Last row is : " + row.size());
        int lastRow = row.size();*//*



*/

        }
    }















































