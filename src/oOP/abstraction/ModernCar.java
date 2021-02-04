package oOP.abstraction;
// add abstract

// abstract is not fully abstract unlike interface which is fully abstract
//abstract method you are allow to use abstract key word when you do not want to use a body
//ex public abstract void display();
// we also can create static and non static method
public abstract class ModernCar {

    String modernCarBrand="BMW";
    double carPrice;
    // abstract method use abstract key word no need of body
    public abstract void cameras() ;
    public abstract void autoLaneControl();
    public abstract void selfDriven();
    public abstract void gps();

    // static and non static methods are allowed also in abstract methods
    public void remoteStart(){
        System.out.println("Modern Car Has a Remote Start Features");
    }

    public void dualClimateControl(){

        System.out.println("Modern Car Has Climate Control Features");
    }





}
