package problemAndSolution;

import java.util.Locale;

public class LearnString {

    //String is a dataType
    //string is a class
    // String is sequence of a character
    public static void main(String[] args) {
        try {
            String car = "Mercedes";
            System.out.println(car.length());
            System.out.println(car.equals("mercedes"));
            System.out.println(car.equals("Mercedes"));
            System.out.println(car.equalsIgnoreCase("mercedes"));
            System.out.println(car.charAt(5));
            System.out.println(car.substring(2,6));
            System.out.println(car.toLowerCase());
            System.out.println(car.toUpperCase());
            String country="Germany"; // if you want to give space then "  Germany"
            System.out.println(car.concat(country));
            System.out.println(car.contains("l"));
            System.out.println(car.compareTo(country));

        } catch (Exception e) {
          //  e.printStackTrace();
            System.out.println(" Error: String Index Out Of Bounds Exception");
        }


    }
}