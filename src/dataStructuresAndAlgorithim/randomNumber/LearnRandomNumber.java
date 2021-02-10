package dataStructuresAndAlgorithim.randomNumber;

import java.util.Random;

public class LearnRandomNumber {

    public static void main(String[] args) {
       int  [] stID= new int [10];
// Random only accept integer
        Random input=new Random(13);// seed optional means start point
        for (int i =0;i<stID.length;i++){
            stID[i]=input.nextInt(30);// set the boundary to 60 or also called end point
            System.out.println(stID[i]);
        }
    }
}
