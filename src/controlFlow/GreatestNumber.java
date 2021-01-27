package controlFlow;

import java.util.Scanner;

public class GreatestNumber {


    public static void main(String[] args) {
         Scanner input= new Scanner(System.in);

        System.out.println("enter num1");
        int num1= input.nextInt();
        System.out.println("enter num2");
        int num2=input.nextInt();
        System.out.println("enter num3");
        int num3=input.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println(num1+" is the Greatest number");
        }else  if (num2>num1 && num2>num3){
            System.out.println(num2+" is the Greatest number");
        }else if (num3>num1 && num3>num2){
            System.out.println(num3+" is the Greatest number");
        }




    }
}
