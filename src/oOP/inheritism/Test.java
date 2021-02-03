package oOP.inheritism;

public class Test {
    public static void main(String[] args) {

        Son son= new Son();
        GrandFather grandFather = new GrandFather();
       Father father=new Father();

        System.out.println(grandFather.getGrandFatherSSN());
       father.gfage(57);

        System.out.println(son.getGrandFatherSSN());
        son.likeAnimals();
        son.likeAnimal();
    }
}
