package oOP.polymorphism.methodOverloading;
// we can declare two method with the same name if we give different parameters(signature)
//different patterns means different datatype (number of datatype is datatype)
public class Calculator {

    public void doSum(int num1, int num2){
        int total=num1+num2;
        System.out.println("total is "+total);


    }public void doSum(int num1, int num2,int num3){
       int total=num1+num2;
        System.out.println("total is "+total);

    }public int doSum(int num1){
        System.out.println(num1);
        return num1;
    }public static void doSum(int num1,String name){

    }
}
