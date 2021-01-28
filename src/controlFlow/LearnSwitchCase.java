package controlFlow;


import java.util.Scanner;

public class LearnSwitchCase {
    public static void main(String[] args) {
     Scanner input= new Scanner(System.in);
        System.out.println("Enter the foodSerial Please :");
        int foodSerial =input.nextInt();
        String foodName;
        switch (foodSerial){
            case 1:
            foodName="burger";
            break;
            case 2:
                foodName="Pizza";
                break;
                case 3:
            foodName="Subs";
            break;
            case 4:
                foodName="Calzones";
                break;
            default:
                foodName="Sorry We Don't Have that!";
                break;
        }
        System.out.println("You are selected= "+ foodName);

    }


}
