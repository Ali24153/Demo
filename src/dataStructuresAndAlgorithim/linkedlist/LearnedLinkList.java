package dataStructuresAndAlgorithim.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LearnedLinkList {


    //Manipulate with LinkedList faster than ArrayList


    LinkedList<String>pizzaName=new LinkedList<>();
    LinkedList<String>pizzaList= new LinkedList<>();

    public static void main(String[] args) {
       LearnedLinkList obj= new LearnedLinkList();
        obj.getPizzaName();

        obj.pizzaName.add("veggie");
        obj.pizzaName.add("Cheese");
        obj.pizzaName.add("Mushroom");
        obj.pizzaName.add("chicken");
        obj.pizzaName.add("peperoni");


        System.out.println(obj.pizzaName.get(3));
        Iterator pi=  obj.pizzaName.iterator();
        while(pi.hasNext() ) {
            System.out.println(pi.next());
        }
       for (String piz: obj.pizzaName){
           System.out.println("this is pizza name "+piz);

       }

    } public void getPizzaName(){
        pizzaName.add("meatLover");
        pizzaName.add("Tuna");
        for (String pizza: pizzaList){
            System.out.println(pizza);
        }

    }
}


