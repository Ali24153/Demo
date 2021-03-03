package excelReadAndWrite;



import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

import java.util.Iterator;

public class ReadExcel {
public static  String excelFile="../Adal/DataTest/DataFile.xlsx";

    // Need to get the Input Byte.
    public static void main(String[] args) throws Exception{

        readExcelFile();
    }



    public static void  readExcelFile() throws Exception {

        FileInputStream fileInputStream= new FileInputStream(excelFile);
        XSSFWorkbook workbook= new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet= workbook.getSheetAt(0);
  Iterator<Row> rowIterator= sheet.iterator();

     while (rowIterator.hasNext()){
         Row row= rowIterator.next();
         Iterator<Cell> cellIterator= row.iterator();
         while (cellIterator.hasNext()){
             Cell cell= cellIterator.next();


             if(cell.getCellType()== CellType.STRING){
                 System.out.print(cell.getStringCellValue()+"  ");
             }else if(cell.getCellType()==CellType.NUMERIC){
                 System.out.print(cell.getNumericCellValue()+"  ");
             }
         }
         System.out.println();
     }

     workbook.close();
    }
}

