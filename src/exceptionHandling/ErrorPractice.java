package exceptionHandling;

public class ErrorPractice {
 int total;

    public static void main(String[] args) throws Exception {
        ErrorPractice obj = new ErrorPractice();


        ErrorPractice.divs(34,0);
        try{
            obj.division(23,0);
        } catch (Exception e) {
            System.out.println("this is  Arithmetic Exception");
        } //obj.division(23,0);
    }



 public int division(int num1, int num2) throws  Exception{
     this.total=num1/num2;
     System.out.println(total);
     return total;
 }

public static int divs (int num1, int num2 ) {
        int result = 0;
    try {
          result = num1 / num2;
        System.out.println(result);
        System.out.println("Azul");
    } catch (Exception e) {
        System.out.println("Error!!! An Arithmetic Exception");
    }

    System.out.println("hello");


    return result;
}

}
