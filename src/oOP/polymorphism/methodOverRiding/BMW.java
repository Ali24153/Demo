package oOP.polymorphism.methodOverRiding;

import oOP.abstraction.ModernCar;

// Overriding is a method that allow a subClass or child Class to override a specific implementation of method
//that is already provided by one of its super classes or parent class
// it happen during run time
//@Overrid is called annotation
//
public class BMW extends ModernCar {
    @Override
    public void cameras() {

    }

    @Override
    public void autoLaneControl() {

    }

    @Override
    public void selfDriven() {

    }

    @Override
    public void gps() {

    }
    // benefit of override we only can override non static (check it) it used to call an existing method
    // from different class and allow to modify the code
    // it will check the parent class if do not use override so it will take more time but if
    //we use directly the sub class method which is good for performance it wont compile it execute directly
   @Override
    public  void dualClimateControl(){
       System.out.println("ali");
   }
}
