package exceptionHandling;

import java.util.concurrent.Callable;

// is used when we expected an error.
public class Calculator {
int div;
    // throws exception will be added after you click on add Exception when we call the method
    public static void main(String[] args) throws Exception {
        Calculator obj=new Calculator();
        Calculator.calcs(65,0);
        try{obj.divs(14,0);}
        catch (Exception e ){
            System.out.println(" Error!! Arithmetic Exception");
        }


       //obj.divs(958,0); // this will ask to add Exception method After you add throws Exception to the method

    }
    public static int calcs (int num1, int num2 ) {
        int result = 0;
         try{ result= num1/num2;
            System.out.println(result);

        } // this is  called a try block
        catch (Exception e){
           // e.printStackTrace(); will print the type of error.
            System.out.println(" Arithmetic Exception. Please use value greater than Zero "); // this is called catch method
            // (Exception is a class && e is a variable.

        }return result; // always used in the end of the method.

    }
    public int divs(int number1, int number2) throws Exception {
        this.div=number1/number2;
        System.out.println(div);
        return div;
    }
}
