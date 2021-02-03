package oOP.encapsulation;

public class Car {

    //Encapsulation: data Hiding


    public String carName="BMW";
    public double carPrice;
    private String carBrand="Mercedes";
    private String carColor;
    private boolean isAvailable;
// Getter and setter method
// Getter method returns Type
//private String carBrand
public String getCarBrand(){
    return carBrand;
}
// setter method is not a return Type
// private String carBrand
public void setCarBrand(String carBrand){
    this.carBrand= carBrand;
} public boolean getIsAvailable(){
    return isAvailable;
    }
    public void setAvailable(boolean isAvailable){
    this.isAvailable=isAvailable;
    }

   public String getCarColor(){
    return carColor;
   }
   public void setCarColor(String carColor){
    this.carColor=carColor;
   }

    public Car() {
    }

    public Car(String carName) {
        this.carName = carName;
    }
// to create constructor faster right click Generate and select constructor.
    public Car(String carName, double carPrice, String carBrand, String carColor, boolean isAvailable) {
        this.carName = carName;
        this.carPrice = carPrice;
        this.carBrand = carBrand;
        this.carColor = carColor;
        this.isAvailable = isAvailable;
    }
}
