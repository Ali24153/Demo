package controlFlow;

import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter Your Number Please:");
        int dayNumber= input.nextInt();
        String weekday;
        switch (dayNumber){
            case 1:
                weekday="Monday";
                break;
            case 2 :
                weekday="Tuesday";
                break;
            case 3 :
                weekday="Wednesday";
                break;
            case 4 :
                weekday="Thursday";
                break;
            case 5 :
                weekday ="Friday";
                break;
            case 6 :
                weekday="Saturday";
                break;
            case 7 :
                weekday="Sunday";
                break;
            default:
              weekday="";
             break;
        }
        if (dayNumber>=1 && dayNumber<=7){
            System.out.println("You Have Chosen: "+weekday);
        }else{
            System.out.println("you are out Of Range!");
        }
    }
}
