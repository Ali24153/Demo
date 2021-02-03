package oOP.inheritism;

public class GrandFather {


    public String grandFatherFavouriteDish="Burger";
    public String grandFatherFavouriteSport="Soccer";
    private String grandFatherSSN="98978786";
    public int age= 34;
    private String bankAcc;

    public String getBankAcc() {
        return bankAcc;
    }

    public void setBankAcc(String bankAcc) {
        this.bankAcc = bankAcc;
    }

    public int gfage(int age){
        this.age=age;
        System.out.println("the age is  "+age);
        return age;

    }

    public String getGrandFatherSSN(){

        return grandFatherSSN;
    }
    public void setGrandFatherSSN(String grandFatherSSN){
        this.grandFatherSSN=grandFatherSSN;
    }
public GrandFather(){

}

    public GrandFather(String grandFatherFavouriteDish, String grandFatherFavouriteSport) {
        this.grandFatherFavouriteDish = grandFatherFavouriteDish;
        this.grandFatherFavouriteSport = grandFatherFavouriteSport;
    }

    public GrandFather(String grandFatherFavouriteDish){
      this.grandFatherFavouriteDish=grandFatherFavouriteDish;
    }
        public void watchSports(){

            System.out.println("Grand Father Like to watch Boxing");

        }public void likeAnimals(){

        System.out.println("Grand Father like to dogs");
    }
}
