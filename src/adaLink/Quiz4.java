package adaLink;

import java.util.Scanner;

public class Quiz4 {

    public static void main(String[] args) {
        Quiz4 quiz4=new Quiz4();
        //quiz4.increaseOrDecrease();
        quiz4.num(124,45,21);


    }

    public void increaseOrDecrease() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = input.nextInt();
        System.out.println("Enter the second number");
        int number2 = input.nextInt();
        System.out.println("Enter the third number");
        int number3 = input.nextInt();
        if (number1 < number2 && number2 < number3) {
            System.out.println("The numbers are in increase order");
        } else if (number1 > number2 && number2 > number3) {
            System.out.println("The Numbers are in decrease order");
        } else {
            System.out.println("The Numbers are Neither increase or decrease order");
        }
    }
    public int num(int num1, int num2, int num3){
         int total= num1+num2+num3;
        if (num1 < num2 && num2 < num3) {
            System.out.println("The numbers are in increase order");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("The Numbers are in decrease order");
        } else {
            System.out.println("The Numbers are Neither increase or decrease order");
        }return total;
    }
}