package controlFlow;

public class LearnForLoop {


    public static void main(String[]args){

        int i;
        int j;
        int space=7;
        for( i=1 ; i<=5; i++){

            for(j=1; j<space; j++)
                System.out.print(" ");
                for(int k=1; k<(i*2) ;k++)
                    System.out.print("*");
            System.out.println(" ");
        space=space-1;


        }

    }
}
