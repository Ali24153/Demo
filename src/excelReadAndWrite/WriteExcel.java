package excelReadAndWrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {

    //create an Excel file using Java
    //Insert data to the created excel file



    // file path
    public static final String filepath="../Adal/DataTest/FirstExcelFile.xlsx";

    public static void main(String[] args) throws IOException {

        Object[][]emp={
                {"ID","FistName","LastName","DepID"},
                {"100","Jake","Miller","001"},
                {"101","Carlos","Ortiga","002"},
                {"102","Carla","Biggs","003"},
                {"103","Mike","Odier","004"},
                {"104","Ali","Tadjedit","001"}
        };

        WriteExcel.writeToExcel(filepath,"TS1",emp);

    }

public static void writeToExcel(String filepath, String sheetName, Object[][] data) throws IOException {

 // object is a parent classes it will take any type of data

    XSSFWorkbook workbook= new XSSFWorkbook();// this this is workbook object it will create a file
    XSSFSheet sheet=  workbook.createSheet(sheetName);// this will help us to create the sheet inside the workbook
    // tell the code how many Rows it needs to create

    // To insert data
    int rowNum=0;//start from row 0 index
    System.out.println("Excel file is Created");// to know if the file is created
    //Convert the 2 d array to single array
    for(Object[] rw: data){
        Row row= sheet.createRow(rowNum++);// it create the Rows start in our sheet by 0 and increament by 1

        int colNum=0;
        for (Object col : rw){
            Cell cell= row.createCell(colNum++); // it will create the columns

            if(col instanceof String){
                cell.setCellValue((String)col);// it will insert the data as String
            }else if (col instanceof Integer){
                cell.setCellValue((Integer)col);// it will insert the data as Integer
            }
        }

    }try{
    FileOutputStream outputStream= new FileOutputStream(filepath);// this will save the file after being created
     workbook.write(outputStream);// this will develop the file
    workbook.close();} // we need to close after saving it
    catch (FileNotFoundException fn){
        System.out.println("File Not found Exception");
    }catch (IOException io){
        System.out.println("done");
    }


}




}
