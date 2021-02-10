package dataStructuresAndAlgorithim.arrayList;

import java.util.*;

public class StateList {

    public static void main(String[] args) {
        List<String> stateList = new LinkedList<String>();
        stateList.add("OH");
        stateList.add("GA");
        stateList.add("MI");
        stateList.add("NY");
        stateList.add("CA");
        System.out.println(stateList);
        System.out.println("*************************printing using iterator");
        Iterator sta=stateList.iterator();
        while (sta.hasNext()){
            System.out.println("states name are "+sta.next());
        }

for(String state:stateList){
    System.out.println("state name is "+state);
}
    }
}