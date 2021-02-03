package oOP.inheritism;

public class Father extends GrandFather {

    public String fatherFavouriteDish="Couscous";
    public String fatherFavouriteSport="Bascket";
    private String fatherSSN;

    public Father(String grandFatherFavouriteDish, String grandFatherFavouriteSport, String fatherFavouriteDish, String fatherFavouriteSport) {
        super(grandFatherFavouriteDish, grandFatherFavouriteSport);
        this.fatherFavouriteDish = fatherFavouriteDish;
        this.fatherFavouriteSport = fatherFavouriteSport;
    }




    public int age= 34;



    public String getFatherSSN(){
        return fatherSSN;
    } public void setFatherSSN(String fatherSSN){
        this.fatherSSN=fatherSSN;
    }public Father(){

    }public void likeAnimal(){
        System.out.println("Cat");
    }
}

