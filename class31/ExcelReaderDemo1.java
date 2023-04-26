package class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ExcelReaderDemo1 {
    public static void main(String[] args) throws IOException {
        // location of the ile on the computer
        String path="Files/Book1.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);

 // class that know how to read and write data to an Excel file
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet1=xssfWorkbook.getSheet("sheet1");
        // as we intrested in row 1 we pass 1 inside the getRow method
        Row row=sheet1.getRow(1);
        Cell cell=row.getCell(1);

        System.out.println(cell);// all the numbers are treated as a double in Excel
    }
}
