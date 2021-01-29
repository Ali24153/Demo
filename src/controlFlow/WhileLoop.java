package controlFlow;

public class WhileLoop {


    public static void main(String[] args) {
        int age= 19;

        while (age<24){
            System.out.println("your age is greater than"+age);
            age++;
            int age1=24;
            while (age1>16){
                System.out.println("your age is greater than "+age1);
                age1--;
            }

        }
    }
}
