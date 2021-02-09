package dataStructuresAndAlgorithim.array;

public class ArrayWithMethod {


    public static void main(String[] args) {
        int number[]= {9,23,5,67,4,978,49,9565};
           ArrayWithMethod.checkMinimum(number);
        System.out.println(ArrayWithMethod.getArray());
    }

    static void checkMinimum(int num[]){
        int min=num[0];

        for (int i = 0; i<num.length; i++){
            if(min>num[i]){
                min=num[i];
            }else {
                System.out.println(num[i]+ " is not the smallest number");
            }
        }
        System.out.println(min);
    }static int[]getArray(){

        return new int [] {65,958,956,88};
    }
}
