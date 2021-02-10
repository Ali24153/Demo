package dataStructuresAndAlgorithim.arrayList;



import java.util.ArrayList;

public class LearnArrayList {

    //no need to declare array size/dynamic array
    //arraylist type always works as 1D
    //array list use size not like single D or double D array where we use length
    // wrap class
    //int = Integer
    //double= Double
    //byte= Byte
    //short=Short
    ArrayList<String> stName=new ArrayList<>();
    public static ArrayList<Integer> studentID=new ArrayList<>();

    public static void main(String[] args) {

LearnArrayList learnArrayList=new LearnArrayList();
learnArrayList.stName.add("Ali");
        learnArrayList.stName.add("Nadir");
        learnArrayList.stName.add("Amar");
        learnArrayList.stName.remove(1);
        //learnArrayList.
        LearnArrayList.studentID.add(24153);
        LearnArrayList.studentID.add(75348);
        LearnArrayList.studentID.add(56343);

        System.out.println(learnArrayList.stName.size());
        // how to retrive all data from array list
        for (String st : learnArrayList.stName){
            System.out.println("student name "+st);
        }
    }
}
