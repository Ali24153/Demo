package dataStructuresAndAlgorithim.array;

import java.util.Arrays;

public class TwoDArray {

 // DataType[1st Dimension] [2nd dimension]= new dataType[numRow][NumColumn]
 public static void main(String[] args) {
     String[][] stName=new String[3][4];// declare array with length
     System.out.println(stName.length);
    String[][] carInfo={
            {"CarBrand","CarColor", "CarPrice"},
            {"BMW","Red","200000"},
            {"Mercedes","Black","37000"},
            {"Nissan","White","34000"}

    };
     System.out.println(carInfo[1][1]);
     for(String car[] :carInfo){
         for(String cari: car){
             System.out.print(cari+ "   ");
         }
         System.out.println();
     }
     stName[0][0]="stId";
     stName[0][1]="FirstName";
     stName[0][2]="LastName";

     stName[1][0]="2345";
     stName[1][1]="Stiwe";
     stName[1][2]="Brian";

     stName[2][0]="2364";
     stName[2][1]="Louis";
     stName[2][2]="Peters";
     System.out.println(stName[2][1]);
     //retrieve all the values from two D array
    for (String stn[]:stName)//convert 2 D to one D
         {
        for (String st : stn){
            System.out.print(st+"   ");

        }
             System.out.println();
    }

 }

}
