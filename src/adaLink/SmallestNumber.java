package adaLink;

import java.util.ArrayList;

public class SmallestNumber {


    public static void main(String[] args) {

       int [] number= {45,99,86,85,5,66,7,2,78,344,1};
       int min=number[0];
       for(int i=0;i<number.length;i++){

           if(min>number[i]){
               min=number[i];

           }

       }System.out.println(min);

    }
}
