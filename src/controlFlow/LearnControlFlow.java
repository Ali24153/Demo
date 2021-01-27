package controlFlow;

public class LearnControlFlow {


    public static void main(String[] args) {


        int age = 23;
        int num = 87;
        String gender = "male";

        if ( gender=="female"||age >= 20 && num != 87) {
            System.out.println("this true");
        } else {
            System.out.println("this is false");
        }
    }
}