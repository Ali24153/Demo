package dataStructuresAndAlgorithim.map;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LearnListHashMap {

    public static void main(String[] args) {
        List<String>Usa=new ArrayList<>();
        Usa.add("NY");
        Usa.add("TX");
       Usa.add("CA");
       Usa.add("MI");
       Usa.add("OH");
       Usa.add("GA");
List<String>FR=new ArrayList<>();
      FR.add("Paris");
      FR.add("Marseille");
        FR.add("Lyon");
        FR.add("Normondi");
        FR.add("Oran");

        Map<String,List<String>> county =new HashMap<>();

        county.put("France",FR);
        county.put("USA",Usa);

        for(Map.Entry<String,List<String>> count: county.entrySet())

        System.out.println(count.getKey()+" "+count.getValue());
     //Another approach to retrieve Value
        for(String bled: county.keySet()){
            System.out.println(bled+" "+county.get(bled));


        }


    }

}
