package dataStructuresAndAlgorithim.array;

public class ThreeDArray {

    //3D Array= 1D+ 2D Array
    //DataType[size][row][column] arrayName=new DataType[size][row][column]
    //Declare 3D Array

    static String [][][]pizza=new String[2][3][3];
    static String[][][]pizza1=new String[2][3][3];

    public static void main(String[] args) {
        ThreeDArray.pizza[0][0][0]="Sauce";
        ThreeDArray.pizza[0][0][1]="Size";
        ThreeDArray.pizza[0][0][2]="PizzaType";
        //System.out.println(ThreeDArray.pizza[0][0][0]);
        ThreeDArray.pizza[0][0][0]="Red";
        ThreeDArray.pizza[0][0][1]="Large";
        ThreeDArray.pizza[0][0][2]="Veggie";

        ThreeDArray.pizza[0][1][0]="White";
        ThreeDArray.pizza[0][1][1]="Xlarge";
        ThreeDArray.pizza[0][1][2]="MeatLover";

        ThreeDArray.pizza[0][2][0]="Alfredo";
        ThreeDArray.pizza[0][2][1]="Medium";
        ThreeDArray.pizza[0][2][2]="Cheese";

        ThreeDArray.pizza[1][2][0]="NoSauce";
        ThreeDArray.pizza[1][2][1]="Small";
        ThreeDArray.pizza[1][2][2]="Mushroom";
        for(String[][] pizz: pizza){
            for(String []piz: pizz){
                for(String pi :piz)
                    System.out.print(pi+ "      ");

            }System.out.println();

        }


    }
}
