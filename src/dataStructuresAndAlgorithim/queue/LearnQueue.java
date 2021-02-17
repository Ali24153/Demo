package dataStructuresAndAlgorithim.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {

   //Queue: FIFO order


    public static void main(String[] args) {
        Queue<String> name=new LinkedList<>();

        name.add("Ali");
        name.add("Amar");
        name.add("Nadir");

        for(String st: name){

            System.out.println(st);


        }// name.element will only pick up the first element
        System.out.println(name.element());
        System.out.println("***********************************************After using element");
        System.out.println(name.poll());// poll will pick and remove the Value
        System.out.println("*****************************************After using poll");
        for (String st: name){
            System.out.println(st);
            System.out.println("*********************************************After using peek");
            System.out.println(name.peek());// peek will only pick the Value
            System.out.println("***********************************************8");
            for (String sti: name)
            {
                System.out.println(sti);
            }

        }


    }


}
