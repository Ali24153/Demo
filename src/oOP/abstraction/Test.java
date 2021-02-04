package oOP.abstraction;

import oOP.polymorphism.methodOverRiding.Audi;

public class Test {
    public static void main(String[] args) {


        Tasla tesla = new Tasla();
        tesla.RacingCarFeature();
        tesla.eginePower();
        System.out.println(tesla.carModel);
        Audi audi=new Audi();
        audi.dualClimateControl();
    }
}