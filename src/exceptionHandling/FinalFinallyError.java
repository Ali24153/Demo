package exceptionHandling;

public class FinalFinallyError {

    //Finalize is used to perform clean up processing just before object is garbage collection.
    //finally is a block
    // garbage collection is used to clean up all the unused items syntax is <System.gc()>



    final int var=12; // this is a final assignment we can reassign this value

 final  int VAR2=34; //by convention it is a good practice to write the
                     //all in capital letters whe it is final and constant.
    public static void main(String[] args) {
FinalFinallyError.divs(23,0);
System.gc();
    }

    public static int divs(int num1, int num2) {
        //this.var2=23; we can not call it here using this. because it is static method

        int result = 0;
        //System.out.println(FinalFinallyError.var2);
        try {

            result = num1 / num2;
            System.out.println(result);
            System.out.println("Azul");// this will not print
        } catch (Exception e) {
            System.out.println("Error!!! An Arithmetic Exception");
        }

        finally{
            System.out.println("Azul");
        }

        System.out.println("Helo");
        return result;
    }


    public int Trial(int mam1, int mam2){
     //this.var=33;  we can call it here because is not static but we can not reassign it because it is final.
        System.out.println();
        int total=mam1+mam2;
        return total;
    }
}