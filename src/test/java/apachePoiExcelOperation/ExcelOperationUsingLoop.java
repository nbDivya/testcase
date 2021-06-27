/*
package apachePoiExcelOperation;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelOperationUsingLoop {
    public static WebDriver driver;

    public static void main(String[] args) throws IOException, InvalidFormatException, FileNotFoundException {
        //Workbook-->sheet-->row-->cell--->cellvalue(string,numeric,formula)
        //File Stream
        File file = new File("selenium/src/main/resources/ReadExcel.xls");

        //Opening the workbook
        HSSFWorkbook workbook = new HSSFWorkbook(file);
        String sheetName = null;
        HSSFSheet sheet = workbook.getSheet(sheetName);

        int rows = sheet.getLastRowNum();
        int col = sheet.getRow(1).getLastCellNum();

        for (int r = 0; r <= rows; r++) {
            HSSFRow row = sheet.getRow(r);//get the row
            for (int c = 0; c < col; c++) {
                HSSFCellSCell cell = row.getCell(c);
                switch (cell.getCellType()) {
                    case STRING:
                        System.out.println(cell.getStringCellValue());
                        break;
                    case NUMERIC:
                        System.out.println(cell.getNumericCellValue());
                        break;
                    case BOOLEAN:
                        System.out.println(cell.getBooleanCellValue());
                        break;
                }
                System.out.println("1");
                System.out.println();


            }
        }


    }
}*/
