/*package day15;

import day13.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTableDemo {
    public static void main(String[] args) {
        WebDriver driver;
        String s="https://the-internet.herokuapp.com/tables";
        BaseClass baseClass=new BaseClass();
        baseClass.SetupChrome();
        baseClass.Openurl(s);
        baseClass.windowMaximise();
        baseClass.implicitlyWait();
        driver = baseClass.driver;

        //1.To retrieve all the header
       WebElement table =  driver.findElement(By.xpath("//table[@id='table1']/thead/tr"));
        System.out.println(table.getText());

        //2.To get the individual column
        List <WebElement> columns= driver.findElement(By.xpath("//table[@id='table1'/thead/tr/th"));
        System.out.println("Total no.of.Column"+ columns.size());
        for(WebElement column:columns)
        {
            System.out.println(column.getText());
        }

        //3.Read the rows and get the row size
        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='table1'/tbody/tr"));
        System.out.println("The Row size"+rows.size());
        for(WebElement row:rows)
        {
            System.out.println(row.getText());
        }

//4.To retrieve particular persons data
for(int i=1;i<rows.size();i++)
{
    WebElement colData=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td[4]"));
    String dueAmt=colData.getText();
    if(dueAmt.equals("$100.00"))
    {
        List<WebElement> personData=driver.findElements(By.xpath("//table[@id=table1/tbody/tr["+i+"]/td"));
        for(int j=0;j<personData;j++)
        {
            System.out.println(personData.get(j).getText());
        }

    }
}
//To Retrieve all data
        for(int i=1;i<rows.size();i++)
        {
            WebElement colData=driver.findElement(By.xpath("//table[@id='table1]/tbody/tr["+i+"]/td"));
            int colData =colData.size();
            System.out.println("No.of.rows#"+i);
            for(int j=0;j<colsize;j++)
            {
                System.out.println(colData.get(j).getText());



                            }


        }
    }

}*/