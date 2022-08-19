package seleniumtestng;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelFileExample {

    public String[][] excelsheet(String fileName,String sheetName) throws IOException {
        String[][] excelfilepath=null;
        FileInputStream fileInputStream=new FileInputStream(fileName);
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet= workbook.getSheet("Sheet1");
       int rowNum= sheet.getLastRowNum();
       int cellNum=sheet.getRow(1).getLastCellNum();
       for (int i=0;i<rowNum;i++) {
           XSSFRow row = sheet.getRow(i);

           for (int a = 0; a < cellNum; a++)
           {
               XSSFCell cell =row.getCell(a);
               excelfilepath[i-1][a]=cell.getStringCellValue();
           }

       }
        return excelfilepath;
    }
}
