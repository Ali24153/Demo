package controlFlow;

import java.util.Scanner;

public class Quiz4 {
    public static void main(String[] args) {
        System.out.println("Please enter your age");
     Quiz4.rightToVote();
    }

    public static void rightToVote(){
        Scanner input= new Scanner(System.in);

        int age=input.nextInt();

        if(age>=18){
            System.out.println("You are eligible to vote");
        }else System.out.println("You are not eligible to vote");
    }


}


