package oOP.abstraction;
// class extends another & a class only implements an interface
public class Tasla extends RacingCar implements Car,AutoPilot{
   // a class cam implements a multiple interface but extends one class a time
    //Tesla own Variables

 public static void main(String[] args) {
  Tasla tesla=new Tasla();
  System.out.println(tesla.modernCarBrand);
 }
    String carModel ="T45";
    double teslaPrice=75000;


    // Tesla  own methode
    public void teslaInfo(){
        System.out.println("Tesla car Information");
    }




    public void cameras() {

    }

    public void autoLaneControl() {

    }

    public void selfDriven() {

    }

    public void gps() {

    }

    public void autoPilot() {

    }

    public void largeDisplay() {

    }

    public void RacingCarFeature() {
        System.out.println("Racing Feature");

    }

    public void eginePower() {
        System.out.println("255 horse power");
    }

    public void engineCilanders() {
        System.out.println("eight cylinders");
    }
}
