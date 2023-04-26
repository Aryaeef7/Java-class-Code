package Apache;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDemo {
    public static void main(String args[]) throws IOException {
        FileInputStream fis = new FileInputStream("ExcelSheet/Book1.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        Sheet sheet = wb.getSheet("Sheet1");
        Row row = sheet.getRow(0);
        Cell value = row.getCell(0);
        System.out.println(value);


    }

}
