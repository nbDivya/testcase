/*
package apachePoiExcelOperation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class ReadingExcel {

    private static WebDriver driver;

    */
/**Apache -poi is an ApI provided by Apache foundation which is a collection of different java Libraries
     * These libraries gives the facility to Read ,Write and Manipulate different microsoft file such as
     *  =====Excel-sheet
     *  ====Power-point
     *  ====Word files
     *//*

    //Interface and classes in Apache-poi
    //  WorkBook----->Sheet------>Row------>Cell
    //workBook---->XSSFworkBook
    //Sheet------->XSSFSheet
    //Row--------->XSSFRow
    //cell-------->XSSFCell
    public static void main(String[] args) throws IOException, InvalidFormatException {

    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String searchText = readFile("Sheet2",1,0);
        driver.findElement(By.name("q")).sendKeys(searchText);
       driver.findElement(By.name("btnK")).click();

}
    public static String readFile(String sheetName, int rowNum, int colNum) throws IOException, InvalidFormatException
    {

        */
/**
         * Workbook -> Sheets -> Row -> Column --> cells -->CEll value(String, numeric, Formula)
         *//*

        //File stream
        File file = new File("C:/Users/Admin/Desktop/ReadExcel.xls");



        //Opening the workbook
        */
/**  2method we are using here
         *  ====>GetSheet(Sheetname)====>Return sheet obj
         * =======>IndexName
         *//*

        HSSFWorkbook workbook = new HSSFWorkbook(file);
//        XSSFSheet sheet = workbook.getSheetAt(0); -- Use index
        //If I want to use sheet name

        HSSFSheet sheet =  workbook.getSheet(sheetName);
        HSSFRow row = sheet.getRow(rowNum);
        //for particular cell/col
        String cellData = row.getCell(colNum).getStringCellValue();



        return cellData;
    }
}


















































*/
