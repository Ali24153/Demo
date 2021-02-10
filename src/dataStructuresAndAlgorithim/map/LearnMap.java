package dataStructuresAndAlgorithim.map;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {

    //map<key,value>
    public static void main(String[] args) {
        Map<String,String>country=new HashMap();
        country.put("Algeria","Tizi");
        country.put("Usa", "NY");
        country.put("France","Paris");
       // System.out.println(country.get("Algeria"));

        for(String bled: country.keySet()){
            System.out.println(bled+" : "+country.get(bled));
        }
    }
}
