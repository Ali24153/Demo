package singleton;

public class LearnSingleton {

    // Singleton Class we are allowed to create one instance of a class at time.
    //using private constructor we c an ensure that one object can be created at a time.

String stName="Jhon";
private LearnSingleton(){


}

// in order to gat access to private constructor follow these steps
    //1- create a instance variable /object and make as public
    public static LearnSingleton instance= new LearnSingleton();
    //2- create a return type of methode
    public static LearnSingleton getInstance(){
        return instance;
    }


    public static void main(String[] args) {
        LearnSingleton obj =new LearnSingleton();
    }




}
