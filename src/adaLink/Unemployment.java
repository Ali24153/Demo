package adaLink;

import java.util.Scanner;
//it happen during the compilation time
public class Unemployment {

    public static void main(String[] args) {
        Unemployment obj= new Unemployment();
        obj.qualify();
    }


        public void qualify () {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter input1");
            String apply = input.next();
            System.out.println("Enter input2");
            double earning = input.nextDouble();
//

            if (apply.equals("yes")  && earning <= 200) {
                System.out.println("you are eligible proceed to the next steps");
            }else {
                System.out.println("you are not eligible");
            }
        }

}