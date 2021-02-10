package dataStructuresAndAlgorithim.map;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMapTravers {

    //Key point:
    //for operation like remove, add, containskey, time complexity is 0
    //TreeMap always keeps the elements key is sorted (increasing order) while elements in hashmap have no order


    public static void main(String[] args) {
        int [] number={23,4,75,4,345,56,97,958,76,23,346,75,95,4,};

        LearnHashMapTravers.getDuplicate(number);

    }

public static void getDuplicate(int [] num){

    HashMap<Integer, Integer> hmap=new HashMap<>();


    for(int i=0; i<num.length;i++){
        Integer count=hmap.get(num[i]);
            if(hmap.get(num[i])==null){
                hmap.put(num[i],1);

            }else{hmap.put(num[i], ++count);
        }
    }for(Map.Entry mp: hmap.entrySet()){
            System.out.println(mp.getKey()+" "+mp.getValue());
        }

}



}
