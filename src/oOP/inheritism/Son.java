package oOP.inheritism;

public class Son extends Father {


    public String sonFavouriteDish = "pizza";
    public String sonFatherFavouriteSport = "Karate";
    private String sonFatherSSN;
    public int age = 34;
    private String bankAcc;

    public Son() {


    }

    public Son(String sonFavouriteDish, String sonFatherFavouriteSport, int age) {
        this.sonFavouriteDish = sonFavouriteDish;
        this.sonFatherFavouriteSport = sonFatherFavouriteSport;
        this.age = age;
    }

    public String getSonFatherSSN() {
        return sonFatherSSN;
    }

    public void setSonFatherSSN(String sonFatherSSN) {
        this.sonFatherSSN = sonFatherSSN;
    }

    @Override
    public String getBankAcc() {
        return bankAcc;
    }

    @Override
    public void setBankAcc(String bankAcc) {
        this.bankAcc = bankAcc;
    }public void getGfName(){
        System.out.println("Son's GF Name is Fatima");
    }
}