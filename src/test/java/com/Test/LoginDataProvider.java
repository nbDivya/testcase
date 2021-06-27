/*
package com.Test;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginDataProvider {
    public class login()
    {
        object[][]data=null;
        WebDriver driver;
        @DataProvider(name="loginData")
        public void loginprovider()
        {
            return
        }

        public void getExceldata() throws IOException {
            FileInputStream excel=new FileInputStream("C:/Users/Admin/Desktop/TestData.xls");
            HSSFWorkbook workbook=new HSSFWorkbook(excel);

            HSSFSheet sheet=workbook.getSheetAt(0);

            int rowcount=sheet.getRow();
            int columncount=sheet.getcol


        }
    }
}
*/
