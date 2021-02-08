package dataReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LearnDataReader {

    //Path/ Location
    //Absolute Path: full Path: C:\Users\alita\IdeaProjects\Adal\DataTest\Sample.txt
    //Relative Path: partial path//DataTest/Sample.txt


    public static void main(String[] args) throws IOException {
        LearnDataReader.readDataMethod();
    }
   public static void readDataMethod() throws IOException {

       //FileReader FileReader is a class coming from JDK
       FileReader fileReader=null; //reference variable
       BufferedReader bufferedReader=null;// reference variable//bufferedReader will help to read the data

       String filepath="../Adal/DataTest/Sample.txt"; //always use back slash or use two froward slash\\

       try{

           fileReader = new FileReader(filepath);
           bufferedReader= new BufferedReader(fileReader);
           String data;
           while((data =bufferedReader.readLine())!=null){//bufferedReader is coming from BufferedReader Class
               System.out.println(data);
           }

       }catch (FileNotFoundException e){
           System.out.println("File not found Exception");

       }  finally {
           try {
               fileReader.close();

               bufferedReader.close();
           }catch (Exception e){
               System.out.println("File already closed");
           }
       }



   }

   }

