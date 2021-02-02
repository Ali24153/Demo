package singleton;

public class SingleTon {
    String car ="Mercedes";


    public static void main(String[] args) {
        LearnSingleton obj2= LearnSingleton.getInstance(); // the object creation with out new
        System.out.println(obj2.stName);
        // wont allow me to create
        // a an object with constructor of a
        // class because it was declared as private on the LearnSingleton class
    }
}
