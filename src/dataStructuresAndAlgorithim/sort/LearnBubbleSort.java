package dataStructuresAndAlgorithim.sort;

public class LearnBubbleSort {


    public static void main(String[] args) {
        int[] arr = {34, 57, 6, 9, 34, 13, 89, 12};
        LearnBubbleSort.getSort(arr);
            for (int i =0; i< arr.length;i++){
                System.out.print(arr[i]+ " ");
            }
    }
      public static void getSort( int arr[]){

            for (int i = 0; i < arr.length; i++) {

                for (int j = 1; j < (arr.length - i); j++) {

                    if (arr[j - 1] > arr[j]) {
                        int temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;

                    }
                }

            }

        }

    }
