package exceptionHandling;

import java.util.Scanner;

public class LearnExceptionHandling {
    public static void main(String[] args) {

        try{ int num1= 3;
            int num2=0;
            int total=num1/num2;

        } catch (Exception e){
           //*** e.printStackTrace(); this will print the type of error.****
            System.out.println("this is Arithmetic Exception");
        }
    }
}
