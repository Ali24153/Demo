package debug;

import java.util.Scanner;

public class LearnDebug {
    //identify a logical error by yourself.
    //breakpoint
    //  to do the debugging after you select the break point right click ang click on debug.
    public static void main(String[] args) {
        LearnDebug.pattern();
        //int num1=34;
        //int num2=54;
        //int num3=67;
        //int num4=56;
        //int num5=67;
        //int addition=num5-num4;
        //System.out.println(addition);
        System.gc();
    }
public static void pattern(){

    Scanner input=new Scanner(System.in);
    System.out.println("enter the num ");
    int rowNumber=input.nextInt();
    for (int i=1; i<rowNumber; i++){
        for (int j=1 ; j<=i ; j++)
            System.out.print(j +" ");
        {

        } System.out.println("  ");
    }

}


}
