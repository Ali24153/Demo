package dataStructuresAndAlgorithim.sort;



public class LearnInsertionSort {

    public static void main(String[] args) {
        int number[]={67,45,13,98,12,4,66,95};


        for (int i =0; i<number.length; i++){
            int j= i-1;


                int num=number[i];
                while(j>=0 && number[j]>num){
                    number[j+1]=number[j];
                    j--;
                }number[j+1]=num;


        }
       for (int x=0;x<number.length;x++){
           System.out.print( number[x]+ " ");
       }



    }
}
