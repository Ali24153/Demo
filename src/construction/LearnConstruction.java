package construction;
// to create constructor faster right click Generate and select constructor.
public class LearnConstruction {
 String stName;
 int stID;
 int stAge;
 String stAddress;
 boolean isStMale;

    public  LearnConstruction(String name, int id,int age,String address, boolean male){

      this.stName=name;
      this.stID=id;
      this.stAge=age;
      this.stAddress=address;
      this.isStMale=male;

        System.out.println("The Student Name is "+stName+" ,the Student ID is "+stID+" ,the student Age is "+stAge+
                " ,the student address is "+stAddress+" ,Is the student gender a male "+isStMale);


    }

    public static void main(String[] args) {
        LearnConstruction obj=new LearnConstruction("Amar",24153,18,"Columbus-OH",true);
    }


}

