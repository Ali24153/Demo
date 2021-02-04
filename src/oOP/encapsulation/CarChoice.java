package oOP.encapsulation;

import debug.LearnDebug;

// every private Variable need to put in getter and setter methode in order to be accessed
// when you  create getter and setter first we create getter method then setter method
// when we use first we use then we get the value
public class CarChoice {
    public static void main(String[] args) {

        Car obj =new Car();
        obj.setCarBrand("Tesla"); // set value or Assign value
        obj.setAvailable(true);
        obj.setCarColor("Red");
        System.out.println(obj.carName );
        System.out.println(obj.getCarBrand() );// get the value
        System.out.println(obj.getIsAvailable());
        System.out.println(obj.getCarColor());
       }

}
