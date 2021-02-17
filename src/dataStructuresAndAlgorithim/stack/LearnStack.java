package dataStructuresAndAlgorithim.stack;

import java.util.Iterator;
import java.util.Stack;

public class LearnStack {
    //Stack :LIFO order
    //pushing the element on the top of Stack :Push()
    //popping the element on the top of the stack :pop()
    //look at the object on the top of stack without remove it from the stack:peek()
    public static void main(String[] args) {



        Stack<String> name = new Stack<>();
        name.add("Souad");
        name.add("Amar");
        name.add("Said");
        name.add("Khaled");
        name.add("Ali");
        //System.out.println(name.peek());//it will pick up the last added
        //System.out.println(name.pop());// it will pick and remove the last added value
        System.out.println(name.push("Yamina"));// push method will add an element to the stack will push to the top
        System.out.println(name);
        //System.out.println(name.peek());// pick up from the top
        // System.out.println(name.pop());// will get the very recent value

        Stack<Integer> age = new Stack<>();
        for (int i = 0; i < 7; i++) {
            System.out.println("age is " + age.push(i));
        }
        Iterator it = age.iterator();
        while (it.hasNext()) {
            System.out.println(age.pop());
        }
       Stack<Integer> num = new Stack<>();
        num.push(45);
        num.push(55);
        num.push(466);
        num.push(29);
        num.push(89);
        num.push(17);
        LearnStack.stackSearch(num, 55);
    }

    public static void stackSearch(Stack<Integer> sta, int element) {
        int position = sta.search(element);
        if (position == -1) {
            System.out.println("element not found");
        } else {
            System.out.println("element position "+ position);
        }

    }
}