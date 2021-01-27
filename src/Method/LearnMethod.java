package Method;

public class LearnMethod {

static int adad1;
static int adad2;
    public static void main(String[] args) {
     int num3=3;
     int num4=4;


        System.out.println("total is "+(num3+num4));
      LearnMethod obj= new LearnMethod();
      obj.doMultip(435,967);
      obj.doCalculation();
      obj.doSums(54,85);
        int koul=obj.doSums(87,748);
        System.out.println("this is koul "+koul);
        System.out.println(adad1);
      int method=obj.doCalculation();
       // System.out.println(method);
    }

public int doCalculation(){

        int num1=34;
        int num2=46;
        //int total=num1*num2;
        //return total;
    //System.out.println("this is Cal "+(num1+num2));
    return num1*num2;


    }
    public int doSums(int number1, int number2) {
    int mem1 =number1;
    int mem2 = number2;
        System.out.println("this is the sum" +(mem1-mem2));
        return mem1-mem2;

    }

public int doMultip(int num1, int num2 ){

   adad1=num1;
   adad2=num2;
    System.out.println("this multi " +(num1*adad2));

   return adad1*adad2;
}
}



