package doEnum;
// we can note create an enum inside a methode
//We can not implement or extend
public class LearnEnum {

    public static void main(String[] args) {
        //how we call enum
        System.out.println(Mobile.red);
        //call Variable int enum color class
        System.out.println(Color.large);
        System.out.println(Color.name);
        // employee
        System.out.println(Employee.Carla);
    }
    //create enum inside a class

    public enum TV{

    }
    //Create multiple enum inside a class
}
//create enum outside of a class

enum Mobile{
yellow, red , white;
// those are inchagebale  once are declared

}

