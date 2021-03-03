package excelReadAndWrite;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ExcelRead {


    //fileLocation
   public static String filePath="../Adal/DataTest/adal_2021.xlsx";
    public static void main(String[] args) {
        ExcelRead.readExcelFile(filePath,0);
    }


     public static void readExcelFile(String filePath, int sheetNumber ){
           try {

               // create FileInputStream which is a class and extends inputStream (abstract class)
               FileInputStream inputStream = new FileInputStream(filePath);
               // create a Workbook object which is an interface coming from APACHE POI extends closeable and Iterable<Sheet>
               // XSSFWorkbook is a class coming from APACHE POI it extend PoiXmlDocument and implement WorkBook interface
               Workbook workbook = new XSSFWorkbook(inputStream);// we passe the inputStream object inside the workbook object
               // we need to Iterate sheet is an interface which extends Iterable<Row>
               Sheet dataTypeSheet = workbook.getSheetAt(sheetNumber);
               // we need to iterate it will iterate Row which is an interface extends Iterable<Cell>

            Iterator<Row> rowIterator= dataTypeSheet.iterator();

               // we need to use while loop it will help us to iterate rows
               while (rowIterator.hasNext()) {

                   //we need nested loop to iterate the cells (Rows is a combination of cells)
                   Row currentRow = rowIterator.next();// which position it will start
                   Iterator<Cell> cellIterator = currentRow.iterator();
                   // we need to iterate the cells
                   while(cellIterator.hasNext()) {
                       // we need to mention the DataType
                       Cell currentCell = cellIterator.next();

                       //if will help us to get the Type Of Data
                       if (currentCell.getCellType() == CellType.STRING) {
                           System.out.println(currentCell.getStringCellValue() + "  ");// if it is a string type of data then print me this

                       } else if (currentCell.getCellType() == CellType.NUMERIC) {
                           System.out.println(currentCell.getNumericCellValue() + " ");
                       }

                       System.out.println();// it will print the next rows
                   }



               }
           }catch (FileNotFoundException fn){
               System.out.println(" file Not found");
           }catch(IOException io)

    {
        System.out.println("Riding done");
    }


     }



    }





