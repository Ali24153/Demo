package adaLink;

import java.util.Scanner;

public class LogginPin {
    public static void main(String[] args) {
       LogginPin.getMoney();

    }

    static void getMoney() {



        Scanner code = new Scanner(System.in);
        System.out.println("please enter your pin");
         int pin = code.nextInt();

             int count=1;

        if ( pin != 1234)

                System.out.println("wrong pin try again");
                pin = code.nextInt();
                    count++;
               // if (count == 3) {
                    System.out.println("your are Blocked");
                //}

                }//else {System.out.println("enter you amount");
            }
     //  }


