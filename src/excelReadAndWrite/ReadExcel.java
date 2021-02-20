package excelReadAndWrite;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcel {


    public static void main(String[] args) throws IOException {
        String filepath="../Adal/DataTest/adal_2021.xlsx";
        FileInputStream fileInputStream= new FileInputStream(filepath);
        Workbook workbook=new XSSFWorkbook(fileInputStream);

        Sheet firstSheet= workbook.getSheetAt(0);
        Iterator<Row> rowIterator= firstSheet.iterator();
        while (rowIterator.hasNext()){
            Row currentRow = rowIterator.next();
            Iterator<Cell> cellIterator=currentRow.iterator();
            while(cellIterator.hasNext()){
                Cell currentCell= cellIterator.next();

                if( currentCell.getCellType()== CellType.STRING){
                    System.out.println(currentCell.getStringCellValue()+" ");

                }else if(currentCell.getCellType()==CellType.NUMERIC){
                    System.out.println(currentCell.getNumericCellValue()+" ");

                }
            }




        }workbook.close();
        fileInputStream.close();
    }
}
