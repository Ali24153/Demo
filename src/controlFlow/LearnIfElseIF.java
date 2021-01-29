package controlFlow;

import java.util.Scanner;

public class LearnIfElseIF {
    public static void main(String[] args) {

        LearnIfElseIF obj= new LearnIfElseIF();
        obj.yourGrade();

    }
public void yourGrade(){
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter you score");
    int grade = input.nextInt();

    if (grade >= 95) {
        System.out.println("You got an A+");
    }
    if (grade >= 97 && grade <= 99) {
        System.out.println("You are Smart");
    } else if (grade == 100) {
        System.out.println("You are a genius");
    } else if (grade < 95 && grade >= 90) {
        System.out.println("You got an A-");
    } else if (grade < 90 && grade >= 87) {
        System.out.println("You got an B+");
    } else if (grade < 87 && grade >= 82) {
        System.out.println("You got an B-");
    } else if (grade > 82 && grade >= 75) {
        System.out.println("You got an C");

    } else if (grade > 75 && grade >= 70) {
        System.out.println("You got an C- ");
    } else if (grade < 70) {
        System.out.println("you are field");
    }
    if (grade < 45) {
        System.out.println("you need to study harder");
    }
}
}