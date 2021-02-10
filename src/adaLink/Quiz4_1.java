package adaLink;

import java.util.Scanner;

public class Quiz4_1 {
    public static void main(String[] args) {
        Quiz4_1 obj= new Quiz4_1();
        obj.rightToVote();
    }

    /**
     *
     */
    public void rightToVote(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=input.nextInt();

        if ( age>=18){
            System.out.println("you have the right to Vote");
        }else if (age== 1 || age<17){
            System.out.println("you will be eligible in " +(18-age)+" years");

        }else if (age==0){
            System.out.println("please enter correct age!!");
        }else if(age==17){
            System.out.println("you will be eligible in "+(18-age)+" year");
        }

    }

    /**
     *  this method will check if the use is eligible for vote
     * @param age
     * author: Ali
     */
    public int vote(int age) {
return age;
    }
}
