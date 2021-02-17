package dataStructuresAndAlgorithim.queue;

import java.util.PriorityQueue;

public class LearnPriorityQueue {



    //Top element from from priority queue; peek method only pick value from queue
// Queue is taking the first value (FIFO) but priorityQueue is taking Value based on numeric or alphabetic order
    public static void main(String[] args) {
        PriorityQueue<String> name=new PriorityQueue<>();
        name.add("Souad");
        name.add("Amar");
        name.add("Ali");
        name.add("Nadir");
        name.add("Lyes");
        name.add("fateh");
        System.out.println(name.remove());
        System.out.println("After remove***************************");
        //for (String st : name){
            //System.out.println(name);
       // }
        System.out.println(name);

    }
}
