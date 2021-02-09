package dataStructuresAndAlgorithim.arrayList;



import java.util.ArrayList;

public class LearnArrayList {

    //no need to declare array size/dynamic array
    //arraylist type
    ArrayList<String> stName=new ArrayList<>();
    public static ArrayList<Integer> studentID=new ArrayList<>();

    public static void main(String[] args) {

LearnArrayList learnArrayList=new LearnArrayList();
learnArrayList.stName.add("Ali");
        learnArrayList.stName.add("Nadir");
        learnArrayList.stName.add("Amar");
        LearnArrayList.studentID.add(24153);
        LearnArrayList.studentID.add(75348);
        LearnArrayList.studentID.add(56343);

        System.out.println(learnArrayList.stName);
    }
}
