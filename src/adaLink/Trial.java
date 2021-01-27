package adaLink;



public class Trial {

    public static void main(String[] args) {
        Trial.computer();
        Trial obj= new Trial(23,65);
        Unite obj1= new Unite();
        Unite.meth();
          Unite.Mobile obj2= new Unite.Mobile();
          System.out.println();
        System.out.println(obj1.unite1);
        System.out.println("mobile name is "+Unite.Mobile.mName + "and the price is "+obj2.mPrice);
    }
        public static void computer() {



            int num1 = 45;
            int num2 = 44;
            int total = num1 + num2;
            ++total;
            total++;
            System.out.println(total);
    }

    public Trial(int number1, int number2){

     System.out.println("total is "+(number1*number2));


    }
    public static class Unite{

        public static void meth(){
            int mem1=23;
         int mem2=12;
         int total1=mem1*mem2;
         System.out.println("total1 is "+total1);
        }
        int unite1=45;
        int unite2= 34;
      public static class Mobile{

         static String mName="Samsung";
          int mPrice=3495;
      }
    }




    }












