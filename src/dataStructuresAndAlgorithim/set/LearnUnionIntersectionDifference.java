package dataStructuresAndAlgorithim.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LearnUnionIntersectionDifference {

    public static void main(String[] args) {
        int num1[]= {1,3,5,7,8,9,34,56,66};
        int num2[]={2,3,8,66,89,65,44,43,67};

        Set<Integer> number1= new HashSet<>();
        number1.addAll(Arrays.asList(new Integer[]{1,3,5,7,8,9,34,56,66}));
        Set<Integer> number2= new HashSet<>();
        number2.addAll(Arrays.asList(new Integer[]{2,3,8,66,89,65,44,43,67}));

        // Union set
        Set<Integer> union= new HashSet<>(number1);
        union.addAll(number2);
        System.out.println(union);

        //intersection set
        Set<Integer>inter=new HashSet<>(number1);
        inter.retainAll(number2);
        System.out.println(inter);
        // symmetric difference
        Set<Integer> dif =new HashSet<>(number1);
        dif.removeAll(number2);
        System.out.println(dif);



    }
}
