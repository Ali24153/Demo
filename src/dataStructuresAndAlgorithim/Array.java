package dataStructuresAndAlgorithim;

public class Array {

    //Array can hold multiple value of same datatype
    //DataType[] variableName= new DataType[numberOfVariable]
    //

    public static void main(String[] args) {
         int[] stid={345, 46757, 5757, 5443};

        String[] students = new String[6];// make it static if is declared on the class level outside of the main method
        //static String [] students=new String[0] and add the variable using
        // class name like Array.student[0]="".
        int[] number = new int[6];
        number[0] = 23;
        number[1] = 24;
        number[2] = 34;
        students[0] = "ali";
        students[1] = "amar";
        students[2] = "nadir";
        System.out.println(students[0]);
        System.out.println(students[1]);

        try {
            System.out.println(students[9]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Array Index Out Of Bounds Exception");
        }
        System.out.println("*********************************Student name using each loop");
        // for each loop
        //for (DataType VariableName: ArrayName)
        //System.out.println(VariableName);
        for(String st : students){
            System.out.println("student addresses " +st);
        }System.out.println("*********************************Student name using  for loop");
        for(int i=0; i<students.length; i++){
            System.out.println(students[i]);
        }for(int i=0; i<students.length; i++){
            System.out.println(number[i]);
        }System.out.println("*********************************print dynamic array");
        System.out.println(stid[3]);
        for(int st: stid){
            System.out.println(st);
        }

    }




}
