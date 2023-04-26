package class32;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ExcelFileDemo5 {
    public static void main(String[] args) throws IOException {
        String path="Files/Book1.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        // a class we can use to read and write data easily from excel
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet2=xssfWorkbook.getSheet("Sheet2");
        int noOfRows=sheet2.getPhysicalNumberOfRows();
        System.out.println(noOfRows);
       // List<Map<String,String>> excelData=new ArrayList<>();

        for (int i = 0; i <noOfRows ; i++) {
            var row=sheet2.getRow(i);
            int noOfCell=row.getPhysicalNumberOfCells();
            for (int j = 0; j <noOfCell ; j++) {
                System.out.println(row.getCell(j));

            }
            System.out.println();

        }


    }
}
